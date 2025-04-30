package cycle3new;

class SharedBuffer {
    private int data;
    private boolean hasData = false;
    // Producer puts data
    public synchronized void produce(int value) {
        try {
            while (hasData) {
                wait(); // Wait if data is already produced
            }
            data = value;
            hasData = true;
            System.out.println("Produced: " + data);
            notify(); // Wake up consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // Consumer gets data
    public synchronized void consume() {
        try {
            while (!hasData) {
                wait(); // Wait if no data produced
            }
            System.out.println("Consumed: " + data);
            hasData = false;
            notify(); // Wake up producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {
    SharedBuffer buffer;
    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500); // Just to slow down producer
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    SharedBuffer buffer;
    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(500); // Just to slow down consumer
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class java25 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}