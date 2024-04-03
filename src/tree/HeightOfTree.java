package src.tree;

public class HeightOfTree {

    private static TreeNode root;
    public HeightOfTree() {
        root = null;
    }

    int height(TreeNode root) {
        if (root == null)
            return 0;
        else {
            // Compute  height of each subtree
            int lheight = height(root.left);
            int rheight = height(root.right);

            // use the larger one
            return Math.max(lheight, rheight) + 1;
        }
    }

    public static void main(String args[]) {
        HeightOfTree tree = new HeightOfTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Height: " + tree.height(root));
    }
}