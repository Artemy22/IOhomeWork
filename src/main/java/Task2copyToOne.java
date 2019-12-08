/*
2. Написать программу, которая скопирует несколько файлов в один.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2copyToOne {
    public static void main(String[] args) throws IOException {

        File fileMaim = new File("src/main/resources/task21.txt");
        FileOutputStream out = new FileOutputStream(fileMaim, true);
        FileInputStream inMain = new FileInputStream("src/main/resources/task21.txt");
        FileInputStream in2 = new FileInputStream("src/main/resources/task22.txt");
        FileInputStream in3 = new FileInputStream("src/main/resources/task23.txt");
        System.out.println(in2.read());
        System.out.println(in3.read());
        int ch;
        while ((ch = in2.read()) != -1) {
            out.write(ch);
        }
        in2.close();
        while ((ch = in3.read()) != -1) {
            out.write(ch);
        }
        in3.close();
        out.close();
    }
}
