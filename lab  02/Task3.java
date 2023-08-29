public class Task2P2 {

    public static void main(String[] args) {
        LinkedlistTail lists = new LinkedlistTail();
        lists.addAtFirst(5);
        lists.addAtFirst(6);
        lists.addAtFirst(43);
        lists.addAtFirst(65);
        lists.addAtFirst(78);

        lists.addAtFirst(8);
        lists.addAtFirst(9);
        lists.addAtFirst(51);
        lists.display();
        lists.addLast(45);
        lists.display();
        lists.addAtMid(2, 34);
        lists.display();
        System.out.println(lists.sizeIs());
        lists.deleteFirst();
        lists.display();

        lists.deleteLast();
        lists.display();
        lists.deleteAtIndex(3);
        lists.display();
        System.out.println();
        lists.displayCycle();
    
    
    }


}

class LinkedlistTail {

    int size;
    Node head;
    Node tail;

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    boolean isEmpty() {

        return head == null;

    }

    int sizeIs() {

        return size;
    }

    void addAtFirst(int value) {

        Node temp = new Node(value);

        temp.next = head;
        head = temp;

        if (tail == null) {
            tail = temp;

        }
        size++;
    }

    void addLast(int value) {

        Node temp = new Node(value);

        if (tail == null) {
            addAtFirst(value);
            return;
        }

        tail.next = temp;
        tail = temp;

        size++;

    }

    void addAtMid(int index, int Value) {
        if (size < index) {
            System.out.println("Index not exist");
        }
        if (index == 0) {
            addAtFirst(Value);
            return;
        }
        if (index == size) {
            addLast(Value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {

            temp = temp.next;
        }

        Node node = new Node(Value);
        node.next = temp.next;
        temp.next = node;

        size++;
    }

    void deleteFirst() {
        if (isEmpty()) {
            tail = null;
        }
        head = head.next;

        size--;
    }

    void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node curr = head;
        for (int i = 0; i < size - 2; i++) {

            curr = curr.next;

        }
        tail = curr;
        tail.next = null;

        size--;

    }

    void deleteAtIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {

            curr = curr.next;

        }
        curr.next = curr.next.next;

    }

    void display() {

        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;

        }
        System.out.print(temp.data);
        System.out.println(" End ");

    }
    
    void displayCycle() {
        boolean flag= false;
        Node temp = head;
        while (temp != null) {
            flag = hasCycle(temp);
            temp = temp.next;

        }
        System.out.print(flag);
        System.out.println(" End ");

    }
 public boolean hasCycle(Node head)
    {

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow)
            {
                return true;
            }
        }

        return false;
    }}