package org.example;

public class Node{
    private final int value;
    public Node left;
    public Node right;

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return this.value;
    }

}
