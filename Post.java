import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Post implements Serializable {

    // Attributes
    private static int idCounter = 0;
    private int postID;
    private String author;
    private String subject;
    private String message;
    private String[] tags;
    private int parentID;
    private int date;

    // constructor for posts
    public Post(String author, String subject, String message) {
        this(author, subject, message, new String[0], -1, null);
    }

    // constructor allows posts with custom datestamps (for debugging)
    public Post(String author, String subject, String message, LocalDate date) {
        this(author, subject, message, new String[0], -1, date);
    }

    // constructor that allows additional attributes of tags and parent post ID
    public Post(String author, String subject, String message, String[] tags, int parentID){
        this(author, subject, message, tags, parentID, null);
    }

    // base constructor with arguments for all attributes 
    public Post(String author, String subject, String message, String[] tags, int parentID, LocalDate date) {
        this.postID = ++idCounter;
        this.author = author;
        this.subject = subject;
        this.message = message;
        this.tags = tags;
        this.parentID = parentID;
        if (date == null) {
            this.date = (int)LocalDate.now().toEpochDay();
        } else {
            this.date = (int)date.toEpochDay();
        }
    }

    public String toString() {
        String result = String.format("Post[postID=%d, author=\"%s\", subject=\"%s\", message=\"%s\", date=%d, tags=[], parentID=-1]", 
                                postID, author, subject, message.replace("\n", "\\n"), date);
        return result;
    }

}