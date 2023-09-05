class QueueWithLL {

    // head = rear;
    private Node rear = null, front = null;

    public void enqueue(int item) {

        Node temp = new Node(item);
        temp.next = rear;
        rear = temp;
        if (front == null) {
            front = temp;
           // System.out.println("Value assigned when front null");
        }

    }

    public int dequeue() {
        int val;
        Node temp = rear;

        if (temp.next == null) {
            front = temp;
            val = front.data;
            front = null;
            rear = front;
            return val;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        val = front.data;

        front = temp;

        front.next = null;

        return val;
    }

    public boolean isEmpty() {
        return rear == null;
    }

    public void peek() {
        if (front == null) {
            System.out.println("Empty");
        }
        System.out.println(front.data);
    }

    void display() {

        Node temp = rear;
        if (temp == null) {
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;

        }

        System.out.println(" End ");

    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        // set the data in allocated node and return the node
        this.data = data;
        this.next = null;
    }
}

public class Task4 {

    public static void main(String[] args) {
        QueueWithLL q = new QueueWithLL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.peek();

        q.display();

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.display();

        if (q.isEmpty()) {
            System.out.print("Queue is empty");
        } else {
            System.out.print("Queue is not empty");
        }
    }

}
