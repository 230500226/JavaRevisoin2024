package com.mycompany.javarevision2024;

import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "This is an example of writing to a file in Java.";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}