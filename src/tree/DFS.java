package src.tree;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    private static TreeNode root;
    public DFS() {
        root = null;
    }
    List<Integer> res = new ArrayList<>();
    public static void main(String[] args) {
        DFS tree = new DFS();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("PreOrder");
        tree.preOrderTraversal(root);
        System.out.println();
        System.out.println("DFS");
        List<Integer> dfs = tree.dfs(root);
        for(Integer i : dfs) {
            System.out.print(i + " ");
        }
        System.out.println("InOrder");
        tree.inOrderTraversal(root);
        System.out.println("PostOrder");
        tree.postOrderTraversal(root);
    }

    public List<Integer> dfs(TreeNode node) {
        if(node == null)
            return res;
        res.add(node.data);
        dfs(node.left);
        dfs(node.right);
        return res;
    }

    public void preOrderTraversal(TreeNode node) {
        if(node == null)
            return;
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(TreeNode node) {
        if(node == null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public void inOrderTraversal(TreeNode node) {
        if(node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }
}

