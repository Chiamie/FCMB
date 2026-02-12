import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {

//    1. Create a Path that points to a location on the Computer
//    2. Use a method of class Files to operate on the Path
//    3. This is the java.nio way to create a path

    public static void main(String[] args) {

        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src";
        String filename = "user.json";

        Path path = Path.of(fileLocation, filename);



//        System.out.println(path.getFileSystem());

        try {
            Files.createFile(path);
        }catch (IOException ex) {
            ex.printStackTrace();
        }




    }


}
