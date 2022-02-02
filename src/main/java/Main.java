public class Main {

    public static void main(String[] args) {

        User user = new User();
        Box box = new Box();
        Thread threadUser = new Thread(user);
        Thread threadBox = new Thread(box);
        threadUser.start();
        threadBox.start();

        try {
            threadUser.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadBox.interrupt();
    }
}