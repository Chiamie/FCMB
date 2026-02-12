import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomDeleteFile {

    public static void main(String[] args){


        try {
            String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src\\streams\\output\\dotun.json";
            Path path = Path.of(fileLocation);


            Files.deleteIfExists(path);

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
