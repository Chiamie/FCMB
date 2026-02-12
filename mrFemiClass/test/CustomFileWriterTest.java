import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CustomFileWriterTest {

    @Test
    void testCanWriteToFile() throws IOException {
        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src";
        String filename = "user.json";

        Path path = Path.of(fileLocation, filename);
        String json = """
                    {
                    "name": "Zeus",
                    "age": 10000000,
                    "country": "Greece"
                    }
                    """;
        CustomFileWriter.writeJsonToFile(path, json);
        String dataFromFile = Files.readString(path);
        assertEquals(json, dataFromFile);
    }

    @Test
    void testCanWriteYamlToFile() throws IOException {
        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src";
        String filename = "user.yaml";

        Path path = Path.of(fileLocation, filename);
        String yaml = """
                    name: Zeus
                 age: 10000000
                 country: Greece
                 """;
        CustomFileWriter.writeYamlToFile(path, yaml);
        String dataFromFile = Files.readString(path);
        assertEquals(yaml, dataFromFile);
    }

    @Test
    void testCanReadYamlFromFile() throws IOException {
        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src";
        String filename = "user.yaml";

        Path path = Path.of(fileLocation, filename);
        String yaml = """
                    name: Zeus
                 age: 10000000
                 country: Greece
                 """;

        String dataFromFile = CustomFileWriter.readYamlFromFile(path);
        assertEquals(yaml, dataFromFile);
    }

    @Test
    void testCanReadJsonFromFile() throws IOException {
        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src";
        String filename = "user.json";

        Path path = Path.of(fileLocation, filename);
        String json = """
                    {
                    "name": "Zeus",
                    "age": 10000000,
                    "country": "Greece"
                    }
                    """;

        String dataFromFile = CustomFileWriter.readJsonFromFile(path);;
        assertEquals(json, dataFromFile);
    }

}