package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PostSerializer {

    public static void serialize(Post post) {

//        you have to decide the destination of the serialized data; where you are sending it to
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(System.out)) {

            objectOutputStream.writeObject(post);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serialize(Post post, Path path) {

        try ( OutputStream outputStream = Files.newOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            objectOutputStream.writeObject(post);
        }catch(IOException ex){
            ex.printStackTrace();
        }


    }
}
