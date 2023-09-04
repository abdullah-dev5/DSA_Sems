
public class Task3 {
    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(7);

        if (q.isFull()) {
            System.out.println("Full Queue");
        } else {
            System.out.println("not Full");
        }
        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());

        System.out.println("Queue size is " + q.size());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        if (q.isEmpty())
            System.out.println("Emptyy Queue");
        else {
            System.out.println("Not Empty ");
        }

    }
}

class Queue {

    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public int dequeue() {
        int var = arr[front];

        front = (front + 1) % capacity;

        count--;
        return var;

    }

    public void enqueue(int item) {

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int size() {
        return count;
    }

    public int peek() {
        if (isEmpty()) {
            return 1;
        }

        return arr[front];

    }

    public boolean isEmpty() {

        return (count == 0);

    }

    public boolean isFull() {
        return count == capacity;
    }

    void printAll() {
        for (int i = 0; i < capacity; i++) {
            System.out.println(arr[i]);
        }

    }
}