package _Tasks.task5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Task5 {
    public static void main(String[] args) {
//5-1: I/O: посимвольно: fr+fw/fis+fos => while ((c = fr.read())!=-1) => write,sout(char(c)) => (S_s->by[]->write
        try (FileReader fr = new FileReader("D:\\in.txt");
             FileWriter fw = new FileWriter("D:\\out.txt", true)) {
//        try (FileInputStream fr = new FileInputStream("D:\\in.txt");
//             FileOutputStream fw = new FileOutputStream("D:\\out.txt", true)) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
                System.out.print((char) c);
            }
            String s = "Т.Г.Шевченко";
            fw.write(s);
//            byte[] ar = s.getBytes();
//            fw.write(ar);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//5-2: построчно: br(fr)+bw(fw) => while((s = br.readLine()) != null)=>write+sout
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\in.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\out.txt"))) {
            String s = null;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//5-3: br+bw=>br.lines().forEach(list::add/sout::) => write+sout
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\in.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\out.txt"))) {
            List<String> list = new ArrayList<>();
            br.lines().forEach(System.out::println);
            br.lines().forEach(list::add);
            for (String item : list) {
                bw.write(item);
                bw.newLine();
                System.out.println(item);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//5-4: br+ist+system.in => с/в консоль
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            System.out.println("Please, enter text:");
            s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//5-5: Files.nIS/nOS => by[is.avaible()] => is.read(ar)/os.write(ar) => sout(new String(ar))
        try (InputStream is = Files.newInputStream(Paths.get("D:\\in.txt"));
             OutputStream os = Files.newOutputStream(Paths.get("D:\\out.txt"))) {
            byte[] ar = new byte[is.available()];
            is.read(ar);
            os.write(ar);
            System.out.println(new String(ar));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//5-6: list -> files.readAllLines(path,UTF-8) -> Files.write -> sout
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get("D:\\in.txt"), StandardCharsets.UTF_8);
            Files.write(Paths.get("D:\\out.txt"), list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String item : list) {
            System.out.println(item);
        }

//5-7: S_Files.readString(path,UTF-8) => sout => writeString
        try {
            String str = Files.readString(Paths.get("D:\\in.txt"), StandardCharsets.UTF_8);
            System.out.println(str);
            Files.writeString(Paths.get("D:\\out.txt"), str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//5-8: Files.lines->filter(startswith)->map(toUpperCase)->sout/newList
        try {
            ArrayList<String> newList = new ArrayList<>();
            Files.lines(Paths.get("D:\\in.txt")).filter(e -> e.startsWith("І ")).map(String::toUpperCase).forEach(System.out::println);
            Files.lines(Paths.get("D:\\in.txt")).filter(e -> e.startsWith("І ")).map(String::toUpperCase).forEach(newList::add);
            for (String item : newList)
                System.out.println(item);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//5-9: properties: file my.properties(1=a)=>properties=>fis=>load=>getproperty
        Properties properties = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/resources/my.properties");
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(properties.getProperty("one"));

//5-10: serialisation: Entity+Serializable+pr_s_f_l_serialVersionUID=1L+transient => oos(fos(some.data))+oos.writeObject(list)
//=> ois(fis)+(T)ois.readObject()+sout
        ArrayList<Woman> list2 = new ArrayList<>();
        Collections.addAll(list2, new Woman("Valia", 15), new Woman("Kate", 36), new Woman("Vira", 62));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/out.data"))) {
            oos.writeObject(list2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<Woman> newWoman = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/out.data"))) {
            newWoman = (ArrayList<Woman>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(newWoman);

//5-11: Files: create Path => if exist create directory/file=>Path_getFileName
//=> ((String=>by[]=>write)/writeString=>sout(new_S(readAllBytes))=>copy=>delete file/dir=>Files.newDirectoryStream
        try {
            Path wayDir = Paths.get("D:\\testFer");
            if (!Files.exists(wayDir)) {
                Files.createDirectory(wayDir);
            }
            Path fileWay = Paths.get("D:\\testFer\\some.txt");
            if (!Files.exists(fileWay)) {
                Files.createFile(fileWay);
            }
            System.out.println(fileWay.getFileName());
            String someText = "Some text";
            byte[] ar = someText.getBytes();
            Files.write(fileWay, ar);
            Files.writeString(fileWay, "Some text2");
            Files.exists(fileWay);
            System.out.println(new String(Files.readAllBytes(fileWay)));
            Path copyFileWay = Paths.get("D:\\testFer\\some2.txt");
            if (!Files.exists(copyFileWay)) {
                Files.copy(fileWay, copyFileWay);
            }
            Files.delete(copyFileWay);
            Files.delete(fileWay);
            Files.delete(wayDir);
            DirectoryStream<Path> allfiles = Files.newDirectoryStream(Paths.get("D:\\IT"));
            for (Path path : allfiles) {
                if (path.toString().contains("Idea"))
                    System.out.println(path);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//5-12: File(устар): create File => if exist mkdir/createNewFile => isFile+length => delete dir/file => sout(dir.listFiles)
        File newDir = new File("D:\\testSav");
        if (!newDir.exists())
            newDir.mkdir();
        File newFile = new File("D:\\testSav\\1.txt");
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(newFile.isFile());
        System.out.println(newFile.length());
        newFile.delete();
        newDir.delete();

        File dir = new File("D:\\");
        for (File item : dir.listFiles()) {
            System.out.println(item.getName());
        }
    }
}
