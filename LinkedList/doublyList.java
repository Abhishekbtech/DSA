package LinkedList;

import java.util.Scanner;
class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class doublyList {
    Node head;
    Node tail;

    doublyList() {
        this.head = null;
        this.tail = null;
    }

    // Adding element

    // Add element at first Postion
    public void addFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    // Add element at last postion
    public void insertAtEnd(int data) {
        Node temp = new Node(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    // Add element at given position
    public void insertAtPosition(int data, int position) {
        Node temp = new Node(data);
        if (position == 1) {
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        } else {
            Node current = head;
            int currPosition = 1;
            while (current != null && currPosition < position) {
                current = current.next;
                currPosition++;
            }
            if (current == null) {
                insertAtEnd(data);
            } else {
                temp.next = current;
                temp.prev = current.prev;
                current.prev.next = temp;
                current.prev = temp;
            }
        }
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void palindrome() {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        Node left = head, right = curr;
        boolean ans = true;
        while (right.next != left && right != left) {
            if (left.data != right.data) {
                ans = false;
                break;
            }
            left = left.next;
            right = right.prev;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        doublyList dll = new doublyList();
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                int value = scanner.nextInt();
                dll.addFirst(value);
            }
        }
        dll.print();
    }
}
