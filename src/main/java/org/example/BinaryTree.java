package org.example;

import static java.lang.Math.max;

public class BinaryTree {

    public final Node root;

    public BinaryTree(int value){
        this.root = new Node(value);
    }


    public static int maxDepth(BinaryTree tree){
        return maxDepth(tree.root);
    }

    private static int maxDepth(Node root){
        if(root == null)
            return -1;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return max(leftDepth, rightDepth) + 1;
    }



    public static int numberOfLeaves(BinaryTree tree){
        return numberOfLeaves(tree.root);
    }

    private static int numberOfLeaves(Node root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        return numberOfLeaves(root.left) + numberOfLeaves(root.right);
    }


    public boolean isEqual(BinaryTree other){
        return isEqual(root, other.root);
    }

    private boolean isEqual(Node root1, Node root2){
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.getValue() != root2.getValue())
            return false;
        return isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right);
    }

}






