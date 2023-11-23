package runnable;

public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new CustomThread();

        t.run();
        t.start();
        Thread.sleep(10000);
        t.run();
    }
}
