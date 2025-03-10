package LINKEDLIST.LinkedList11;

public class Main {

    Node head;

    Main() {
        this.head = null;
    }

    class Node {
        Node next;
        String data;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    void display() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("Null");
    }

    void addFirst(String s) {
        Node newNode = new Node(s);
        newNode.next = head;
        head = newNode;
    }

    void addLast(String s) {
        Node newNode = new Node(s);
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;

    }

    public static void main(String args[]) {
        Main main = new Main();

        main.add("Red");
        main.add("Green");
        main.add("Black");

        main.addFirst("White");
        main.addLast("Pink");

        main.display();

    }
}
