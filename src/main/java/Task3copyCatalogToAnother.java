/*
"3. Написать программу для копирования всех файлов из одного каталога в
другой."
*/

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Task3copyCatalogToAnother {
    public static void main(String[] args) throws IOException {
        File trgDir = new File("Directory2");
        File srcDir = new File("Directory1");

        FileUtils.copyDirectory(srcDir, trgDir);
    }
}
