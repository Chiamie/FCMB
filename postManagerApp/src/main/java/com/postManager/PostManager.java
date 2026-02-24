package com.postManager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;

public class PostManager {

    private static ObjectMapper mapper = new ObjectMapper();
    public static String serialize(Post post) {

        mapper.configure(INDENT_OUTPUT, true);
        try{
            String json = mapper.writeValueAsString(post);
            return json;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(String json, String fileLocation) throws IOException {

        try(FileOutputStream fileOutputStream = new FileOutputStream(fileLocation)){
            fileOutputStream.write(json.getBytes());

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static List<String> serialize(List<Post> posts) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(INDENT_OUTPUT, true);

        List<String> jsons = new ArrayList<>();

        for(Post post : posts){
            try{
                jsons.add(mapper.writeValueAsString(post));

            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

        }
        return jsons;

    }

    public static Post deserialize(String json) {

        try {
            return mapper.readValue(json, Post.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }
}
