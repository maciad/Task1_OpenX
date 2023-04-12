import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

public class NumberOfLeavesTest {

    @Test
    public void testNumberOfLeaves1() {

        //      5
        //     / \
        //    3   7
        //   / \ / \
        //  2  5 1  0
        //         / \
        //        2   8
        //             \
        //              5

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

        assertEquals(5, BinaryTree.numberOfLeaves(tree));
    }

    @Test
    public void testNumberOfLeaves2() {

        //            5
        //           / \
        //          3   7
        //         /
        //        2
        //       /
        //      5
        //     /
        //    13


        BinaryTree tree = new BinaryTree(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(2);
        tree.root.left.left.left = new Node(5);
        tree.root.left.left.left.left = new Node(13);

        assertEquals(2, BinaryTree.numberOfLeaves(tree));
    }

    @Test
    public void testNumberOfLeavesWithSingleNode() {
        BinaryTree tree = new BinaryTree(8);

        assertEquals(1, BinaryTree.numberOfLeaves(tree));
    }
}
