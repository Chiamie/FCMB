import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Can you read from sources other
//than the terminal using class Scanner?
public class CustomDataReader {

    public static void main(String[] args) throws FileNotFoundException {
        var fileInputStream = new FileInputStream("C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src\\streams\\output\\posts.json");
//        System.out.println(fileInputStream.getClass());
        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while(scanner.hasNextLine()){
            builder.append(scanner.nextLine()).append("\n");
        }
        System.out.println(builder);
    }
}
