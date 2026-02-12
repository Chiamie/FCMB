package streams.input;

import java.io.FileInputStream;

import java.io.IOException;

public class CustomFileInputReader {

    public static void main(String[] args){

        String path = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\RegeX\\src\\user.json";
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            byte[] data = fileInputStream.readAllBytes();
            System.out.println(new String(data));
        } catch(IOException ex){
            ex.printStackTrace();
        }


    }

}
