package ru.yandex.zhmyd;


import java.io.*;

public class Second {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\USER\\Desktop\\test111.dat");

        File copy = new File("C:\\Users\\USER\\Desktop\\copy.txt");



        InputStream stream = null;
        try {



            System.setOut(new PrintStream(copy));


            System.setErr(new PrintStream(copy));

            stream = new FileInputStream(file);

            ObjectInput input = new ObjectInputStream(stream);

            User user = (User) input.readObject();
            System.out.println(user);



            stream = new FileInputStream(file);
            input = new ObjectInputStream(stream);
            User user1 = (User) input.readObject();

            System.out.println(user1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeInput(stream);
        }
    }

    private static void closeInput(InputStream stream){
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
