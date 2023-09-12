public class Task9 {

    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(4);
        obj.push(5);
        obj.push(2);
        obj.push(7);
        obj.push(6);
        obj.push(90);
        obj.push(120);

        System.out.println(obj.getMin());

    }

}

class MinStack {

    // Stack

    private Node top;
    private Node getMin = null;

    public void push(int value) {
        Node node = new Node(value);

        node.next = top;
        top = node;
        if (getMin == null) {
            getMin = top;
        } else if (getMin.data > top.data) {
            getMin = top;
        }

    }

    int getMin() {
        return getMin.data;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Already Empty ");
            return;
        }
        top = top.next;

    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
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
}