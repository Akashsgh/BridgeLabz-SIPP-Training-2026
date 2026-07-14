package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class InsertAfterTrack {

    public static void insertAfter(Node current, int trackId) {
        if (current == null) {
            return;
        }

        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before Insertion:");
        printList(head);

        insertAfter(head.next, 25);

        System.out.println("After Insertion:");
        printList(head);
    }
}