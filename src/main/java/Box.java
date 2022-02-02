public class Box implements Runnable{

    private static final int TIME_TO_TURN_ON = 2000;
    public static volatile boolean BOX_STATUS;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (BOX_STATUS) {
                try {
                    Thread.sleep(TIME_TO_TURN_ON);
                    BOX_STATUS = false;
                    System.out.println("Пользователь включил тумблер!");
                } catch (InterruptedException ex) {
                    return;
                }
            }
        }
        System.out.println("Коробка закрылась.");
    }
}
