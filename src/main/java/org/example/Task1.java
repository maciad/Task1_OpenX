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
        tree2.root.left = new Node(13);
        tree2.root.right = new Node(8);
        tree2.root.left.left = new Node(2);
        tree2.root.left.right = new Node(6);
        tree2.root.right.right = new Node(1);
        tree2.root.right.right.right = new Node(20);


        System.out.println("Number of leaves: " + BinaryTree.numberOfLeaves(tree));
        System.out.println("Tree depth: " + BinaryTree.maxDepth(tree));
        System.out.println("Are trees equal: " + tree.isEqual(tree2));

    }
}