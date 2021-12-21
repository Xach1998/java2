package homework.inputOutput;

import java.io.File;
import java.util.Scanner;

public class FileSearchWithDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type folder path!");
        String path = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
//C:\Users\User\Desktop\Новая папка

        File file = new File(path);

        boolean b = search(file, fileName);
        System.out.println(b);

    }

    public static boolean search(File file, String filename) {
        File[] files = file.listFiles();
        boolean find = false;
        if (files != null) {
            for (File singleFile : files) {
                if (singleFile.getName().equals(filename)) {
                    find = true;
                    return find;
                } else {
                    search(singleFile, filename);
                }

            }
        }
        return find;

    }
}
