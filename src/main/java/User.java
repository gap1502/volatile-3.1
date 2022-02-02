public class User implements Runnable {

    private static final int TIMER = 3500;
    private static final int COUNT_OF_GAMES = 10;

    @Override
    public void run() {
        try {
            for (int i = 0; i < COUNT_OF_GAMES; i++) {
                if (Thread.currentThread().isAlive()) {
                    Box.BOX_STATUS = true;
                    Thread.sleep(TIMER);
                    System.out.println("Кот в коробке выключил тумблер!");
                }
            }
            Thread.sleep(TIMER);
            System.out.println("Пользователь завершил игру");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}