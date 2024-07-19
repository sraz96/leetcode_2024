import java.util.Scanner;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    private static class Node {
        int data;
        int count;  
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.count = 1;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            current.count++;
        }

        return current;
    }

    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }

        if (data == current.data) {
            return true;
        }

        if (data < current.data) {
            return searchRecursive(current.left, data);
        } else {
            return searchRecursive(current.right, data);
        }
        
    }

    public void inorder() {
        inorderRecursive(root);
    }

    private void inorderRecursive(Node current) {
        if (current != null) {
            inorderRecursive(current.left);
            System.out.print(current.data + "(" + current.count + ") ");
            inorderRecursive(current.right);
        }
    }

    public void preorder() {
        preorderRecursive(root);
    }

    private void preorderRecursive(Node current) {
        if (current != null) {
            System.out.print(current.data + "(" + current.count + ") ");
            preorderRecursive(current.left);
            preorderRecursive(current.right);
        }
    }

    public void postorder() {
        postorderRecursive(root);
    }

    private void postorderRecursive(Node current) {
        if (current != null) {
            postorderRecursive(current.left);
            postorderRecursive(current.right);
            System.out.print(current.data + "(" + current.count + ") ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements to be inserted:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            bst.insert(data);
        }

        System.out.println("Inorder traversal:");
        bst.inorder();

        System.out.println("\nPreorder traversal:");
        bst.preorder();

        System.out.println("\nPostorder traversal:");
        bst.postorder();

        System.out.println("\nEnter the element to search:");
        int searchData = scanner.nextInt();
        boolean found = bst.search(searchData);
        if (found) {
            System.out.println("Element " + searchData + " is present in the BST.");
        } else {
            System.out.println("Element " + searchData + " is not present in the BST.");
        }
    }
}
