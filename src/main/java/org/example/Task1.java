package org.example;

public class Task1 {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(0);
        tree.root.right.right.left = new Node(2);
        tree.root.right.right.right = new Node(8);
        tree.root.right.right.right.right = new Node(5);

        BinaryTree tree2 = new BinaryTree(5);

        System.out.println("Number of leaves: " + BinaryTree.numberOfLeaves(tree.root));
        System.out.println("Tree depth: " + BinaryTree.maxDepth(tree.root));
        System.out.println("Are trees equal: " + BinaryTree.equals(tree.root, tree2.root));

    }
}