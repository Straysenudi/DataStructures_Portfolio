package steque;

public class Steque {
    private Node front, rear;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Steque() {
        front = null;
        rear = null;
        size = 0;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
        size++;
        System.out.println("Pushed: " + item);
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Steque is empty. Cannot pop.");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Popped: " + item);
        return item;
    }

    public boolean isEmpty() {
        return front == null;
    }

     public void displaySteque() {
        if (isEmpty()) {
            System.out.println("Steque is empty.");
            return;
        }
        Node current = front;
        System.out.print("Steque elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
     
    public static void main(String[] args) {
        Steque steque = new Steque();

        steque.push(10);
        steque.push(20);
        steque.push(30);

        steque.displaySteque();

        steque.enqueue(40);
        steque.enqueue(50);

        steque.displaySteque();

        steque.pop();
        steque.pop();
    }
}
