package datastructures;


class Node {
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}


class Main {

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void swap(Node root) {
        if (root == null) {
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }


    public static void invertBinaryTree(Node root) {

        if (root == null)
            return;
        swap(root);

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        invertBinaryTree(root);
        preorder(root);
    }
}