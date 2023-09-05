

public class Task1 {
    public static void main(String[] args) {
        StackWithArray stack = new StackWithArray(5);
        stack.push(1);
        stack.push(2);
        System.out.println("Stack size is " + stack.size());

        stack.pop();
        stack.pop();
        stack.push(3);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is " + stack.size());

        stack.pop(); // removing the top 3

        // check if stack is empty
        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else {
            System.out.println("Stack Is Not Empty");
        }

    }

}

class StackWithArray {

    private int arr[];
    private int top;
    private int capacity;

    // Initializing a stack
    StackWithArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is Already full");
            return;
        }
        arr[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Already Empty");
            return -1;
        }

        return arr[top--];

    }

    public int size() {
        return top + 1;
    }

    public int peek() {

        return arr[top];
    }

}
