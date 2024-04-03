package src.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    // Root of the Binary Tree
    private static TreeNode root;

    public BFS() {
        root = null;
    }

    // Function to print level order traversal of tree
    void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
    }

    public static void main(String args[]) {
        BFS tree = new BFS();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("BFS: ");
        tree.levelOrderTraversal(root);
    }
}