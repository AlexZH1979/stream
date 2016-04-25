package ru.yandex.zhmyd;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Readert {
    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        try {
            File file = new File("C:\\Users\\USER\\Desktop\\copy.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String s:list) {
            System.out.println(s);
        }

       list.forEach(s -> System.out.println(s));
    }
}
