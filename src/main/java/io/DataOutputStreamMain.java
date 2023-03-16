package io;

import java.io.*;
import java.nio.charset.Charset;

public class DataOutputStreamMain {
    public static void main(String[] args) {
//        try(BufferedReader br = new BufferedReader(new FileReader("text.txt", Charset.forName("windows-1251")))){
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, Charset.forName("windows-1251")));
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/resources/data.dat"))))
        { dos.writeInt(1000);
            dos.writeUTF("It is string");
            dos.writeBoolean(true);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("src/main/resources/data.dat")))){
            int a = dis.readInt();
            String b = dis.readUTF();
            boolean c = dis.readBoolean();
            System.out.println(a+b+c);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
