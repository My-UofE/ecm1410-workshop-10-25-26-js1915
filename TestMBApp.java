public class TestMBApp {
    public static void main(String[] args) {
        MessageBoard mb = new MessageBoard("Coding Support");
        mb.addPost("Alex Adam", "Help with Java", "Hi could anyone help me I need to learn howto code in java!");
        mb.addPost("Belinda Bennett", "Help with java", "Hi Alex. Yes I can send some tutorials I found useful");
        mb.addPost("Cindy Carter", "Coding on a Chromebook", "Hi, could anyone help me I need to learn how to code in java!");
        mb.addPost("Dennis Dobson", "Windows problems", "My windows laptop is stuck on a reboot loop. Does anyone know what to do!");

        mb.getFormattedPost(4);
    }

}
