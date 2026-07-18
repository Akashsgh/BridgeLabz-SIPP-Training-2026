package Collection_DSA.Bst_Practice;

public class SearchUsernameBST {

    // Node class
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    // Search function
    public static boolean search(Node root, int target) {
        Node current = root;

        while (current != null) {

            if (target == current.val) {
                return true;
            }

            if (target < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        /*
                  50
                 /  \
               30    70
              / \    / \
            20  40  60  80
        */

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int target1 = 60;
        int target2 = 25;

        System.out.println("Search " + target1 + ": " + search(root, target1));
        System.out.println("Search " + target2 + ": " + search(root, target2));
    }
}