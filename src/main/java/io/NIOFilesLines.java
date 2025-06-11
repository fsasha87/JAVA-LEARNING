package io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
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
            if (item.startsWith("Как")) {
                String upper = item.toUpperCase();
                result.add(upper);
            }
        }
        for (String item : result) {
            System.out.println(item);
        }

        try {
            String str = Files.readString(Paths.get("D:\\in.txt"), StandardCharsets.UTF_8);
            System.out.println(str);
            Files.writeString(Paths.get("D:\\out.txt"), str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stream<String> stream = Files.lines(Paths.get("src/main/resources/Pushkin.txt"));
        List<String> result2 = stream
                .filter(line -> line.startsWith("Как"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        result2.forEach(System.out::println);
    }
}
