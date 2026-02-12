package streams.input;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public class CloudDataReader {
    public static void main(String[] args) {


//        final String file = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src\\streams\\output\\posts.json";
//        String url = "https://jsonplaceholder.typicode.com/posts";
//        String data = readDataFrom(url);
//
//        try (FileWriter fileWriter = new FileWriter(file)){
//            fileWriter.write(data);
//        }catch(IOException ex) {
//            ex.printStackTrace();
//        }

        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src\\streams\\output\\dotun.json";
        String url = "https://jsonplaceholder.typicode.com/users";
        String data = readDataFrom(url);

        try(FileWriter fileWriter = new FileWriter(fileLocation)){
            fileWriter.write(data);

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static String readDataFrom(String cloudLocation){
        URI uri = URI.create(cloudLocation);
        try(InputStream inputStream = uri.toURL().openStream()){
            return new String (inputStream.readAllBytes());
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
