package src.tree;

import java.util.ArrayList;
import java.util.List;

public class LeftViewBinaryTree {
    static List<Integer> res = new ArrayList<>();
    static int maxLevel = 0;

    public static List<Integer> leftView(TreeNode root, int level) {
        if (root == null)
            return res;

        if (level > maxLevel) {
            res.add(root.data);
            maxLevel = level;
        }

        leftView(root.left, level + 1);
        leftView(root.right, level + 1);
        return res;
    }

    public static void main(String[] args) {
        /*
         * Constructing below binary tree
         *
         *         1
         *        / \
         *       2   3
         *      / \   \
         *     4   5   6
         *        /
         *       7
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);

        System.out.println("Left view of the binary tree:");
        leftView(root, 1);
        for(int i: res)
            System.out.println(i);
    }
}