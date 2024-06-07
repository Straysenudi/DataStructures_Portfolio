package fifo_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOQueue {
    private Queue<Integer> queue;

    public FIFOQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int item) {
        queue.add(item);
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue.poll();
        System.out.println("Dequeued: " + item);
        return item;
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements: " + queue);
        }
    }

    public static void main(String[] args) {
        FIFOQueue fifoQueue = new FIFOQueue();

        fifoQueue.enqueue(10);
        fifoQueue.enqueue(20);
        fifoQueue.enqueue(30);

        fifoQueue.displayQueue();

        fifoQueue.dequeue();
        fifoQueue.dequeue();

        fifoQueue.displayQueue();
    }
}


