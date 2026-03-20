import java.util.*;
import java.time.LocalDate;
import java.io.*;
import java.time.format.DateTimeFormatter;


public class MessageBoard implements Serializable {
    private List<Post> posts;
    private String boardName;

    public MessageBoard(String boardName) {
        this.boardName = boardName;
        this.posts = new ArrayList<>();
    }

    public String getBoardName() {
        return boardName;
    }

    public int[] getPostIDs() {
        int[] postIDs = new int[posts.size()];
        int i = 0;
        for (Post post : posts) {
            postIDs[i++] = post.getPostID();
        }
        return postIDs;
    }

    public int getPostIndex(int postID) throws IDInvalidException {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getPostID() == postID) {
                return i;
            }
        }
        throw new IDInvalidException("Invalid post ID.");
    }
    public int addPost(String author, String subject, String message) {
        Post newPost = new Post(author, subject, message);

        this.posts.add(newPost);
        return newPost.getPostID();
    }
    public String getFormattedPost(int postID) throws IDInvalidException{
        // this should make use of getPostIndex to access the post
        // and print it using the .toFormattedString() method
        Post postToFormat = this.posts.get(this.getPostIndex(postID));

        String postToDisplay = postToFormat.toFormattedString();
        System.out.println(postToDisplay);
        
        return postToDisplay;
    }

}