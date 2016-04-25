package ru.yandex.zhmyd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class App 
{
    private static final Logger LOGGER = LoggerFactory.getLogger("ru.yandex.zhmyd.App");

    public static void main( String[] args )
    {

        File file = new File("C:\\Users\\USER\\Desktop\\test.dat");
  /*      try {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        User user = new User("first", "last", "password");

        LOGGER.info("Create new user {} at {}", user, new Date());

        OutputStream output = null;
        try {
            output = new FileOutputStream(file);


            System.out.format("firstname %s  lastname %s age %d", user.getFirstName(), user.getLastName(), user.getAge());


            ObjectOutput objectOutput = new ObjectOutputStream(output);

            objectOutput.writeObject(user);

            output.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeOutput(output);
        }
    }

    private static void closeOutput(OutputStream stream){
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
