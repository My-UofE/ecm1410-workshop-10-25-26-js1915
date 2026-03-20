public class TestPostApp {
    public static void main(String[] args) {
        
        Post javaPost = new Post("Alex Adam", "Help with Java", "Hi, could anyone help me I need to learn how to code in java!");
        System.out.println(javaPost.toFormattedString());

        javaPost.saveAsTextFile("mypost.txt");


    }
}
