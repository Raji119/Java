package DataStructures.Trees;

import java.util.Scanner;

public class Trees {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
        tree.treeDisplay();
    }

}

class BinaryTree {

    private Node root;

    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void populate(Scanner sc) {
        System.out.println("Enter root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);

    }

    public void populate(Scanner sc, Node node) {
        System.out.println("Do you want Left Node?");
        boolean isLeft = sc.nextBoolean();
        if (isLeft) {
            System.out.println("Enter Value:");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want Right Node?");
        boolean isRight = sc.nextBoolean();
        if (isRight) {
            System.out.println("Enter Value:");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }

    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String s) {
        if (node == null) {
            return;
        }
        System.out.println(s + node.data);
        display(node.left, s + "\t");
        display(node.right, s + "\t");

    }

    public void treeDisplay() {
        treeDisplay(root, 0);
    }

    private void treeDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        treeDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------->" + node.data);
        } else {
            System.out.println(node.data);
        }
        treeDisplay(node.left, level + 1);
    }

}
