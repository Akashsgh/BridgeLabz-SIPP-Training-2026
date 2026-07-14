package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeLogStreams {

    public static Node mergeLogStreams(Node a, Node b) {

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }

        return dummy.next;
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

        // First Sorted List
        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);
        a.next.next.next = new Node(7);

        // Second Sorted List
        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);
        b.next.next.next = new Node(8);

        System.out.println("First Log Stream:");
        printList(a);

        System.out.println("Second Log Stream:");
        printList(b);

        Node merged = mergeLogStreams(a, b);

        System.out.println("Merged Log Stream:");
        printList(merged);
    }
}