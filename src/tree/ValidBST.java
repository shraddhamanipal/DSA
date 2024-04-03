package src.tree;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBSTHelper(TreeNode node, long minVal, long maxVal) {
        if (node == null) {
            return true;
        }
        if (node.data <= minVal || node.data >= maxVal) {
            return false;
        }
        return isValidBSTHelper(node.left, minVal, node.data) && isValidBSTHelper(node.right, node.data, maxVal);
    }
}
