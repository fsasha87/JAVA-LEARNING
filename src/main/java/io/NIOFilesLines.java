package io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class NIOFilesLines {
    public static void main(String[] args) throws IOException {
        List<String> text = Files.readAllLines(Paths.get("src/main/resources/Pushkin.txt"), UTF_8);
        List<String> result = new ArrayList<>();
        for (String item : text) {
            if (item.startsWith("Как")){
                String upper = item.toUpperCase();
                result.add(upper);
            }
        }
        for (String item : result) {
            System.out.println(item);
        }

        Stream<String> stream = Files.lines(Paths.get("src/main/resources/Pushkin.txt"));
        List<String> result2 = stream
                .filter(line -> line.startsWith("Как"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        result2.forEach(System.out::println);

        try (DirectoryStream<Path> files = Files.newDirectoryStream(Paths.get("D:\\Progs"))){
            for (Path path : files){
                System.out.println(path);
            }
        }
    }
}
