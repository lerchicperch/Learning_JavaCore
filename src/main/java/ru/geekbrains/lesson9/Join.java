package ru.geekbrains.lesson9;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Join {

    public static void join (Path directory, Path fileToJoin) throws IOException {

        ArrayList<Path> inputs = new ArrayList<>();
        for (File file : directory.toFile().listFiles()) {
            if (!file.isDirectory()) {
                try (Reader reader = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8)) {
                    inputs.add(Paths.get(file.getAbsolutePath()));
                }
            }
        }

        Files.createFile(fileToJoin);
        Charset charset = StandardCharsets.UTF_8;

        for (Path path : inputs) {
            List<String> lines = Files.readAllLines(path, charset);
            Files.write(fileToJoin, lines, charset, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        }
    }

    public static void main(String[] args) throws Exception {
        join(Path.of("C:\\dir1"), Path.of("join.txt"));
    }

}