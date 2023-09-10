
import java.util.Stack;

//Another way to do 
// Insertion O(n).
// Removing   O(1)

public class Task5 {

    public static void main(String[] args) {

        int[] keys = { 1, 2, 3, 4, 5 };
        QueueUsingStackss q = new QueueUsingStackss();

        // insert above keys
        for (int key : keys) {
            q.enqueue(key);
        }

        System.out.println(q.dequeue()); // print 1
        System.out.println(q.dequeue()); // print 2

    }

}

class QueueUsingStackss {

    private Stack first; // Main stack. use as queue.
    private Stack second; // Helpers tack

    public QueueUsingStackss() {

        first = new Stack();
        second = new Stack();

    }

    public void enqueue(int item) {

        while (!first.empty()) {

            second.push(first.pop());

        }

        second.push(item);
        while (!second.empty()) {

            first.push(second.pop());

        }

    }

    public int dequeue() { // base condition !true
        return (int) first.pop();
    }

    public boolean isEmpty() {
        return first.empty();
    }

    public int peek() throws Exception {

        return (int) first.peek();
    }

}
