

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable");
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}