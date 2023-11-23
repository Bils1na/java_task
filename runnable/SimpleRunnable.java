package runnable;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleRunnable {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            Stream<Integer> res = IntStream.range(0, 1000).boxed();
            System.out.println(res);
        });

        t.start();
        t.interrupt();

        // String name = Thread.currentThread().getName();
        // System.out.println(name);

        // Thread t = new Thread();
        // t.start();
        // System.out.println(t.getName());
        // t.setName("Second thread");
        // System.out.println(t.getName());
        // t.setDaemon(true);


        // Runnable task1 = () -> {
        //     for (int i = 1; i <= 5; i++) {
        //         System.out.println(i);
        //     }
        // };
    
        // Runnable task2 = () -> {
        //     for (int i = 10; i < 15; i++) {
        //         System.out.println(i);
        //     }
        // };
        
        // Thread one = new Thread(task1);
        // Thread two = new Thread(task2);
    
        // one.start();
        // two.start();
    }
}