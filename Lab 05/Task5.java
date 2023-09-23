public class Task5 {
    public static void main(String[] args) {

        LinkedLists list = new LinkedLists();

        list.addFirst("AA");
        list.addFirst("BB");
        list.addFirst("CC");
        list.addFirst("DD");
        list.addFirst("EE");
        list.addFirst("FF");
        list.display();
        list.reverse();
        list.display();
    }

}

class LinkedLists {

    private Node head;
    private int size;

    public void addFirst(Object value) {
        Node node = new Node(value);

        node.next = head;
        head = node;

        size++;
    }

    public void deleteFirst() {

        head = head.next;

        size--;

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

    Node fetchhead() {
        return head;
    }

    // make a recurrsive reverse list
    void reverseRecurrsive(Node temp)

    {

    }
    // print recurrsive list

    public void reverse() {
        Node prev = null;
        Node temp = head;
        Node next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        head = prev;
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