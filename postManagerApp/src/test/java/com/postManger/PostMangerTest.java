package com.postManger;

import com.postManager.Post;
import com.postManager.PostManager;
import org.junit.jupiter.api.Test; 

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PostMangerTest {

    @Test
    void testCanSerializePost(){
        Post post = new Post();
        post.setId(1);
        post.setPostId(1000);
        post.setEmail("chiamie@gmail.com");
        post.setBody("This is my first post");
        post.setAuthor("chiamie");


        String json = PostManager.serialize(post);
        assertNotNull(json);

        String expected = generateTestJson();

        assertEquals(expected.replace("\r\n", "\n"), json.replace("\r\n", "\n"));
    }

    private static String generateTestJson() {
        String expected = """
            {
              "id" : 1,
              "email" : "chiamie@gmail.com",
              "body" : "This is my first post",
              "author" : "chiamie",
              "date" : [ 2026, 2, 17, 12, 0 ],
              "post_id" : 1000
            }""";
        return expected;
    }

    @Test
    void testCanDeserializePost(){
        String json = generateTestJson();
        Post post = PostManager.deserialize(json);
        assertNotNull(post);
        assertEquals(1000, post.getPostId());
        assertEquals("chiamie", post.getAuthor());
        assertEquals("This is my first post", post.getBody());
        assertEquals(1, post.getId());




    }

    @Test
    void testCanWriteSerializedJsonToFile() throws IOException {
        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Documents\\2026\\java\\postManagerApp\\src\\main\\java\\com\\postManager\\example.json";
        String json = """
            {
            "id": 1,
            "email": "chiamie@gmailcom",
            "body": "This is my first post"
            "author": "chiamie"
            }
            """;

        PostManager. writeToFile(json, fileLocation);

    }

    @Test
    void testCanSerializePostWithDate(){

        Post post = new Post();
        post.setId(1);
        post.setPostId(1000);
        post.setEmail("chiamie@gmail.com");
        post.setBody("This is my first post");
        post.setAuthor("chiamie");
        LocalDate date = LocalDate.of(2026, 2, 17);
        LocalTime time = LocalTime.of(12, 00);
        LocalDateTime postDate = LocalDateTime.of(date, time);

        post.setDate(postDate); //[2026, 2, 17, 12, 0]

        String json = PostManager.serialize(post);
        System.out.println("json: " + json);
        assertNotNull(json);
        String expected = generateTestJson();
        assertEquals(expected.replace("\r\n", "\n"), json.replace("\r\n", "\n"));




    }
}
