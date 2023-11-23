package runnable;

public class Task extends Thread {

    private String message;

    public Task(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        int i = 5;
        i++;
        System.out.println(message + i);
    }

    public static void main(String[] args) {
        String msg = "Hello";

        Task t1 = new Task(msg);
        Task t2 = new Task(msg);
        t1.start();
        t2.start();
    }
}
