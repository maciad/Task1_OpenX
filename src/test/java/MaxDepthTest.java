import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

public class MaxDepthTest {

    @Test
    public void testMaxDepth1() {
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

        assertEquals(4, BinaryTree.maxDepth(tree));
    }

    @Test
    public void testMaxDepth2() {
        BinaryTree tree = new BinaryTree(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(2);
        tree.root.left.left.left = new Node(5);
        tree.root.left.left.left.left = new Node(5);
        tree.root.left.left.left.left.left = new Node(13);

        assertEquals(5, BinaryTree.maxDepth(tree));
    }


    @Test
    public void testMaxDepthWithSingleNode() {
        BinaryTree tree = new BinaryTree(8);

        assertEquals(0, BinaryTree.maxDepth(tree));
    }
}
