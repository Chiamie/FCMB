package serialization;

import org.junit.jupiter.api.Test;

import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class PostSerializerTest {
    @Test
    void serializeTest() {
        String content = "This is my first post";
        String id = "abcde";
        String author = "John Doe";

        Post post = new Post(content, id, author);
        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\FCMB\\mrFemiClass\\src\\serialization\\output";
        String fileName = "post";

        Path path = Paths.get(fileLocation, fileName);
        PostSerializer.serialize(post, path);
    }

    @Test
    void deserializeTest() {

        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\FCMB\\mrFemiClass\\src\\serialization\\output";
        String filename = "post";
        Path path = Paths.get(fileLocation, filename);
        Post post = PostDeserializer.deserializer(path);

        assertNotNull(post);
        assertEquals("John Doe", post.getAuthor());
        assertEquals("This is my first post", post.getContent());
        assertEquals("abcde", post.getId());
    }

}