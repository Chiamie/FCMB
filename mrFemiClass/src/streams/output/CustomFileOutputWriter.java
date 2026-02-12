package streams.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class CustomFileOutputWriter {

    public static void main(String[] args){

//        String json = """
//                {
//                "name": "John Doe",
//                "phone_number": "123456789"
//                }
//        """;
//
//        String filePath = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src\\user.json";
//        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
//            fileOutputStream.write(json.getBytes());
//        }catch(IOException ex){
//            ex.printStackTrace();
//        }

        String json = """
                {
                "name": "Achalugo",
                "age": "25",
                "gender": "Female",
                }
                """;

        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src\\streams\\output\\achalugo.json";

        try(FileOutputStream fileOutputStream = new FileOutputStream(fileLocation)){
            fileOutputStream.write(json.getBytes());

        } catch(IOException e){
            e.printStackTrace();
        }


    }
}
