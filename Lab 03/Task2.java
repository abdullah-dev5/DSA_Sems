
//Stack

public class Task2 {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            System.out.print("Stack is not empty");
        }

    }

}

class Stack {

    Node top;

    public void push(int value) {
        Node node = new Node(value);

        node.next = top;
        top = node;

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