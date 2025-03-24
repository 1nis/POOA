public class MonThread extends Thread{

    @Override
    public void run() {
        for (int i=5; i>=0; i--) {
            try {
                sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
