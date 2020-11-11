package ru.geekbrains.lesson9;

import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
        String folder = "/C:/dir1/dir";
        recursiveDelete(new File(folder));
    }

    public static void recursiveDelete(File file) {
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                recursiveDelete(f);
            }
        }
        file.delete();
        System.out.println("Удаленный файл или папка: " + file.getAbsolutePath());
    }
}
