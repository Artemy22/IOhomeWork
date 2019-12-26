/*
"4. Написать программу, которая создаст текстовый файл и запишет в него
список файлов (путь, имя, дата создания) из заданного каталога."*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Task4createFilWithPath {

    static File dir = new File("Directory1");
    static String dirName;

    public static void main(String[] args) throws IOException {
        dirName = "Directory2";
        dirChecker();
        getPathFile();
        getFilesWithLastModif();

    }

    public static void getFilesWithLastModif() throws IOException {

        String string = Arrays.toString(dir.listFiles());
        String[] parts = string.split(", ");

        String part1 = parts[0].substring(1);
        File firstFileName = new File(part1);
        fileWriter("The 1st file:\n" + "Name: " + firstFileName.getName() + "\npath: " + part1 + "\nlast modified date: " + getCreatedAtFile(part1).toString() + "\n");

        String part2 = parts[1].substring(0, parts[1].length() - 1);
        File secondFileName = new File(part2);
        fileWriter("The 2nd file:\n" + "Name: " + secondFileName.getName() + "\npath: " + part2 + "\nlast modified date: " + getCreatedAtFile(part2).toString() + "\n");

    }

    public static void getPathFile() {

        System.out.println(dir.getAbsoluteFile());
    }

    static Date getCreatedAtFile(String filePath) {
        File innerFile = new File(filePath);
        return new Date(innerFile.lastModified());
    }

    public static void dirChecker() throws IOException {
        if (!new File(dirName).exists()) {
            new File(dirName).mkdirs();
        }
    }

    public static void fileWriter(String whatShouldBeWritten) throws IOException {
        File fileToWrite = new File(dirName+"/task#4");
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite, true));

        writer.append('\n');
        writer.append(whatShouldBeWritten);
        writer.close();
    }
}
