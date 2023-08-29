

public class Task4Lab1 {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst("AA");
        list.addFirst("BB");
        list.addFirst("CC");
        list.addFirst("DD");
        list.addFirst("EE");
        list.addFirst("FF");
        list.display();
        list.addLast("WW");
        list.addFirst("MM");
        list.addLast("QQ");
        list.display();

        list.addAtIndex("RR", 2);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAtIndex(3);
        list.display();

        System.out.println("After Duplicating : ");
        LinkedList copylist = list.duplicate();
        copylist.display();
    
    
    
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

    public void addAtIndex(Object value, int index) {
        if (index == 0) {
            addFirst(value);

            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {

            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;

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
        // System.out.println(curr.value);

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

       public LinkedList duplicate()
        {
            LinkedList copyList = new LinkedList();


                Node temp = head;
                Node copy = null;

                if(temp != null)
                {
                    copyList.head = new Node(temp.value);
                    copy = copyList.head;
                    temp = temp.next;
                }


                while(temp != null)
                {
                    copy.next = new Node(temp.value);
                    copy = copy.next;
                    temp = temp.next;
                }


                return copyList;

        }

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
