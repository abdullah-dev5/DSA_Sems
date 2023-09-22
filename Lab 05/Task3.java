public class Task3 {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst("AA");
        list.addFirst("BB");
        list.addFirst("CC");
        list.addFirst("DD");
        list.addFirst("EE");
        list.addFirst("FF");

        System.out.println("Using recurrsion ");
        long startRec = System.nanoTime();
        list.displayrec(list.fetchHead());

        long endRec = System.nanoTime();

        long totalRec = endRec - startRec;
        long startiterate = System.nanoTime();
        list.display();

        long enditerate = System.nanoTime();
        long totalIterate = enditerate - startiterate;
        System.out.println();
        System.out.println(totalRec);
        System.out.println(totalIterate);
        if (totalRec < totalIterate) {
            System.out.println("Recurrsion take less time");
        } else {
            System.out.println("iterative take less time");
        }

    }

}

class LinkedList {

    private Node head;
    private int size;

    public void addFirst(Object value) {
        Node node = new Node(value);

        node.next = head;
        head = node;

        size++;
    }

    public void addLast(Object value) {

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;

        }
        Node node = new Node(value);

        curr.next = node;

        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;

    }

    public void deleteFirst() {

        head = head.next;

        size--;

    }

    public void deleteLast() {

        if (size <= 1) {
            deleteFirst();
        }

        Node curr = head;

        while (curr.next.next != null) {

            curr = curr.next;

        }
        curr.next = null;

        size--;
    }

    Node fetchHead() {
        return head;
    }

    // Using Recurrsions printAll Nodes
    void displayrec(Node temp) {

        if (temp == null) {
            return;
        }
        System.out.print(temp.value + " , ");
        displayrec(temp.next);

    }

    void display() {

        Node temp = head;

        while (temp.next != null) {
            System.out.print(temp.value + " ,");
            temp = temp.next;

        }
        System.out.print(temp.value);
        System.out.println("  End  ");

    }

    private class Node {

        Object value;

        Node next;

        public Node(Object value) {

            this.value = value;
            this.next = null;
        }

    }

}
