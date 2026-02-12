import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomFileWriter {


    public static void writeJsonToFile(Path path, String json) throws IOException {

        Files.writeString(path, json);


    }


    public static void writeYamlToFile(Path path, String yaml)  throws IOException {

        Files.writeString(path, yaml);
    }

    public static String readYamlFromFile(Path path)  throws IOException {

        return Files.readString(path);
    }

    public static String readJsonFromFile(Path path)  throws IOException {
        return Files.readString(path);
    }
}
