import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

public class TreeEqualTest {

    @Test
    public void testTreeEqualTrue() {
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
        tree2.root.left = new Node(3);
        tree2.root.right = new Node(7);
        tree2.root.left.left = new Node(2);
        tree2.root.left.right = new Node(5);
        tree2.root.right.left = new Node(1);
        tree2.root.right.right = new Node(0);
        tree2.root.right.right.left = new Node(2);
        tree2.root.right.right.right = new Node(8);
        tree2.root.right.right.right.right = new Node(5);

        assertTrue(tree.isEqual(tree2));
    }

    @Test
    public void testTreeEqualDifferentValue() {

        //              5
        //            /   \
        //           3     7
        //          / \   / \
        //         2   5 1   0
        //                  / \
        //                 2   8
        //                      \
        //                       5
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

        //              5
        //            /   \
        //           3     7
        //          / \   / \
        //         2   5 1   0
        //                  / \
        //                 2   8
        //                      \
        //                       6
        BinaryTree tree2 = new BinaryTree(5);
        tree2.root.left = new Node(3);
        tree2.root.right = new Node(7);
        tree2.root.left.left = new Node(2);
        tree2.root.left.right = new Node(5);
        tree2.root.right.left = new Node(1);
        tree2.root.right.right = new Node(0);
        tree2.root.right.right.left = new Node(2);
        tree2.root.right.right.right = new Node(8);
        tree2.root.right.right.right.right = new Node(6);

        assertFalse(tree.isEqual(tree2));
    }

    @Test
    public void testTreeEqualSubtree() {

        //              5
        //            /   \
        //           3     7
        //          /
        //         2
        BinaryTree tree = new BinaryTree(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(2);

        //              5
        //            /   \
        //           3     7
        //          / \
        //         2   5
        BinaryTree tree2 = new BinaryTree(5);
        tree2.root.left = new Node(3);
        tree2.root.right = new Node(7);
        tree2.root.left.left = new Node(2);
        tree2.root.left.right = new Node(5);

        assertFalse(tree.isEqual(tree2));
    }

    @Test
    public void testTreeEqualFalse() {

        //              5
        //            /   \
        //           3     7
        //            \
        //             2
        BinaryTree tree = new BinaryTree(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.right = new Node(2);

        //              5
        //            /   \
        //           3     7
        //          /
        //         2
        BinaryTree tree2 = new BinaryTree(5);
        tree2.root.left = new Node(3);
        tree2.root.right = new Node(7);
        tree2.root.right.left = new Node(2);

        assertFalse(tree.isEqual(tree2));

    }
}
