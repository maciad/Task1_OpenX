package org.example;

import static java.lang.Math.max;

public class BinaryTree {

    private final Node root;

    public BinaryTree(int value){
        this.root = new Node(value);
    }

    public static int maxDepth(Node root){
        if(root == null){
            return -1;
        }
        else{
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            return max(leftDepth, rightDepth) + 1;
        }
    }

    public static int numberOfLeaves(Node root){
        if(root == null){
            return 0;
        }
        else if(root.left == null && root.right == null){
            return 1;
        }
        else{
            return numberOfLeaves(root.left) + numberOfLeaves(root.right);
        }
    }

    public static boolean equals(Node root1, Node root2){
        if (root1 == null && root2 == null){
            return true;
        }
        else if (root1 == null || root2 == null){
            return false;
        }
        else if (root1.getValue() != root2.getValue()){
            return false;
        }
        return equals(root1.left, root2.left) && equals(root1.right, root2.right);
    }

}






