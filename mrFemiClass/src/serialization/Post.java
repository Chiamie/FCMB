package serialization;

import java.io.Serial;
import java.io.Serializable;

public class Post implements Serializable {
    private static final long  serialVersionUID =  -651825987767693978L;
    private String content;
    private String id;
    private String author;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Post(String content, String id, String author) {
        this.content = content;
        this.id = id;
        this.author = author;
    }
}
