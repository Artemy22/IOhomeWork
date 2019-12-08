/*
1. Написать программу, которая считает текстовый файл, заменит в нем все слова “Hello” на “1234” и запишет изменения в тот-же файл.
 */


import java.io.*;

public class Task1replace {
    public static void main(String[] args) throws IOException {


        File file = new File("src/main/resources/task1.txt");
        FileOutputStream out = new FileOutputStream(file, true);
        FileInputStream in = new FileInputStream("src/main/resources/task1.txt");


        String greetings = "Hello. It's the hello test. \n";
//        out.write(greetings.getBytes());

        int ch;
for (ch = 0; ch <10; ch++){
        out.write(greetings.getBytes());
}
        while ((ch = in.read()) != -1) {
            if (ch == 'l') ch = 'y';
            out.write(ch);
        }
        out.close();
        in.close();
    }
}
