package streams.input;

import java.io.*;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CustomDataInputReader {

    public static void main(String[] args) throws FileNotFoundException {

//        System.out.println("Enter your name:   ");
//        try (DataInputStream dataInputStream = new DataInputStream(System.in)) {
//            byte[] data = dataInputStream.readNBytes(11);
//            System.out.println("Your name is: " + new String(data));
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }

        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src\\user.json";
        InputStream inputStream = new FileInputStream(fileLocation);

        System.setIn(inputStream);

        try (DataInputStream dataInputStream = new DataInputStream(System.in)) {
            byte[] data = dataInputStream.readAllBytes();
            System.out.println(new String(data));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
