package ru.geekbrains.lesson9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Sequences {

    public static int countSequence(Path path, String sequence) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String contents;
            StringBuilder sb = new StringBuilder();
            contents = readUsingFiles(path);
            System.out.println(contents);
            Pattern p = Pattern.compile(sequence);
            Matcher m = p.matcher(contents);
            int counter = 0;
            while(m.find()) {
                counter++;
            }
            //System.out.println(counter);
            return counter;
        }
    }

    public static String readUsingFiles(Path path) throws IOException {
        return new String(Files.readAllBytes(path));
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countSequence(Path.of("C:/dir1/file3.txt"), "aa"));
    }
}
