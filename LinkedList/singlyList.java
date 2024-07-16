package LinkedList;

// import java.util.*;

class singlyList {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding element

    // Add element at first Postion
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add element at last postion
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Add element at given position
    public void addAtPosition(int pos, int data) {
        Node newNode = new Node(data);
        if (pos == 1) {
            if (head != null) {
                newNode.next = head;
            }
            head = newNode;
        } else {
            Node curr = head;
            for (int i = 1; i < pos - 2; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    // Deleting element

    // deleting at first Postion
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = head.next;
    }

    // deleting at last Postion
    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondNode = secondNode.next;
            lastNode = lastNode.next;
        }
        secondNode.next = null;
    }

    // delete the node from given index
    public void deleteAtPos(int pos) {
        if (pos == 1) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 1; i < pos - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
    }

    // reverse a list

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseListRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
 
 
        Node newHead = reverseListRecursive(head.next);
       
        head.next.next = head;
        head.next = null;
        return newHead;
    }
 

    // Remove duplicates from sorted linked list
    public void removeDuplicates() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // size
    public void getSize() {
        int size = 0;
        Node currNode = head;
        while (currNode!= null) {
            size++;
            currNode = currNode.next;
        }
        System.out.println(size);
    }


    // Printing a list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        singlyList list = new singlyList();
        list.addFirst(1);
        list.addFirst(2);
        list.printList();
        list.addLast(3);
        list.printList();
        list.getSize();
        // list.reverseList();
        list.head = list.reverseListRecursive(list.head);
        list.printList();
        // try (Scanner scanner = new Scanner(System.in)) {
        //     int n = scanner.nextInt();
        //     // int pos = scanner.nextInt();
        //     // int da = scanner.nextInt();
        //     for (int i = 0; i < n; i++) {
        //         int data = scanner.nextInt();
        //         list.addLast(data);
        //     }
        //     list.printList();
        //     list.removeDuplicates();
        //     list.printList();
        //     // list.deleteLast();
        //     // list.printList();
        //     // list.deleteAtPos(2);
        //     // list.printList();
        // }
    }
}
