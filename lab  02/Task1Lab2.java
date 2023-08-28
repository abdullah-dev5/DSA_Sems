public class Task1Lab2 {
    
public static void main(String[] args) {

DoubleLinkedList list = new DoubleLinkedList();

list.insertAtBeginning("aa");
list.insertAtBeginning("bb");
list.insertAtBeginning("cc");
list.insertAtBeginning("dd");
list.insertAtEnd("Ds");
list.printAll();
list.insertAtEnd("ee");
DoubleLinkedList.Node bold = new DoubleLinkedList.Node("tt");
list.insertAfterName("bb", bold);
list.printAll();

DoubleLinkedList.Node old = new DoubleLinkedList.Node("RR");
list.insertBeforeName("cc", old);
list.printAll();
list.makeCircular();

}
}


class DoubleLL {


}

class DoubleLinkedList {


static class Node {


Node next;
Node prev;
String data;

Node(String data) {
this.data = data;
this.next = null;
this.prev = null;

}
}


Node head;
int size;

// Add node with name in beginning of linkedlist, name as param
public void insertAtBeginning(String name) {


Node temp = new Node(name);

if (head == null) {
head = temp;
} else {
temp.next = head;
head.prev = temp;
head = temp;

}

size++;
}

// Add node in beginning of linedlist, node as param
public void insertAtBeginningNode(Node node) {
if (head == null) {
head = node;
} else {
node.next = head;
head.prev = node;
head = node;


}
size++;
}

// Add node in end of linedlist, name as param
public void insertAtEnd(String name) {

Node temp = new Node(name);


if (head == null) {
head = temp;

} else {
Node curr = head;
while (curr.next != null) {
curr = curr.next;
}
temp.prev = curr;
curr.next = temp;
}


size++;


}

// Add node in end of linedlist, node as param
public void insertAtEnd(Node node) {


if (head == null) {
head = node;

} else {
Node curr = head;
while (curr.next != null) {
curr = curr.next;
}
node.prev = curr;
curr.next = node;
}


size++;


}

// Add node after name which is provided as param , name and node as params
public void insertAfterName(String name, Node node) {

if (head == null) {
head = node;
} else {
Node temp = head;
while (!temp.data.equals(name)) {
temp = temp.next;

}


node.prev = temp;

node.next = temp.next;
temp.next = node;

}
size++;


}

// Add node before name which is provided as param , name and node as params
public void insertBeforeName(String name, Node node) {

if (head == null) {
node = head;
} else {
Node temp = head;

while (!(temp.data.equals(name))) {


temp = temp.next;

}

node.next = temp;
node.prev = temp.prev;
temp.prev.next = node;
temp.prev = node;


}

size++;
}

// Make double linkedlist as Circular Double LinkedList
public void makeCircular() {

Node temp = head;

while (temp.next != null) {
temp = temp.next;


}
System.out.println(" Last Node : " + temp.data);
head.prev = temp;
temp.next = head;
System.out.println("Circular : " + temp.next.data);


}





// Print all the nodes in linkedlist, make sure it works on circular double linkedl

public void printAll() {
Node temp = head;
while (temp.next != null) {
System.out.print(temp.data + " , ");
temp = temp.next;

}
System.out.print(temp.data);
System.out.println(" End ");
}
}


