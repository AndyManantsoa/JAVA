//Write a java program that implements a multi-thread application that has three threads. First thread
//generates random integer every 1 second and if the value is even, second thread computes the square of the
//number and prints. If the value is odd, the third thread will print the value of cube of the number.
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.Random;

// Shared queue for storing generated numbers
class NumberQueue {
    private final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void put(int number) {
        try {
            queue.put(number);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int take() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return 0;
        }
    }
}

// Thread for generating random numbers
class NumberGenerator extends Thread {
    private final NumberQueue queue;
    private final Random random;

    public NumberGenerator(NumberQueue queue) {
        this.queue = queue;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            int number = random.nextInt(100);
            queue.put(number);
            System.out.println("Generated: " + number);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Thread for computing squares of even numbers
class EvenSquareCalculator extends Thread {
    private final NumberQueue queue;

    public EvenSquareCalculator(NumberQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            int number = queue.take();
            if (number % 2 == 0) {
                int square = number * number;
                System.out.println("Square of " + number + ": " + square);
            }
        }
    }
}

// Thread for computing cubes of odd numbers
class OddCubeCalculator extends Thread {
    private final NumberQueue queue;

    public OddCubeCalculator(NumberQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            int number = queue.take();
            if (number % 2 != 0) {
                int cube = number * number * number;
                System.out.println("Cube of " + number + ": " + cube);
            }
        }
    }
}

public class P24 {
    public static void main(String[] args) {
        NumberQueue queue = new NumberQueue();

        NumberGenerator generator = new NumberGenerator(queue);
        EvenSquareCalculator evenSquareCalculator = new EvenSquareCalculator(queue);
        OddCubeCalculator oddCubeCalculator = new OddCubeCalculator(queue);

        generator.start();
        evenSquareCalculator.start();
        oddCubeCalculator.start();
    }
}