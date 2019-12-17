/*
1. Написать программу, которая считает текстовый файл, заменит в нем все слова “Hello” на “1234” и запишет изменения в тот-же файл.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1replace {
    public static void main(String[] args) throws IOException {


        File file = new File("src/main/resources/task1.txt");
        FileOutputStream out = new FileOutputStream(file, true);
        FileInputStream in = new FileInputStream("src/main/resources/task1.txt");

        Path path = Paths.get("src/main/resources/task1.txt");
        Charset charset = StandardCharsets.UTF_8;

        String content = new String(Files.readAllBytes(path), charset);
        content = content.replaceAll("Hello", "1234");
        Files.write(path, content.getBytes(charset));
    }
}