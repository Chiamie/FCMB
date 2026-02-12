package streams.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CustomPrintStreamer {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src\\streams\\output\\posts.json";
        FileInputStream fileInputStream = new FileInputStream(filePath);

//        By default System.in reads from the terminal
//         but with setIn() you can explicitly tell
//        System.in where to read from

        System.setIn(fileInputStream);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }



    }
}
