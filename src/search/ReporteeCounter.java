package src.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode {
    String name;
    int count;
    List<TreeNode> children;

    TreeNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
}

public class ReporteeCounter {
    public void countReportees(TreeNode root) {
        dfs(root);
    }

    private int dfs(TreeNode node) {
        if (node == null)
            return 0;

        int count = 0;
        for (TreeNode child : node.children) {
            count += dfs(child);
        }
        node.count = count+1; // Update reportee count for the current node
        return node.count; // Add 1 to include the current node
    }

    public static void main(String[] args) {
        // Sample organizational structure
        TreeNode ceo = new TreeNode("CEO");
        TreeNode manager1 = new TreeNode("M1");
        TreeNode manager2 = new TreeNode("M2");
        TreeNode manager3 = new TreeNode("M3");
        TreeNode employee1 = new TreeNode("E1");
        TreeNode employee2 = new TreeNode("E2");
        TreeNode employee3 = new TreeNode("E3");
        TreeNode employee4 = new TreeNode("E4");

        ceo.children.addAll(Arrays.asList(manager1, manager2, manager3));
        manager1.children.addAll(Arrays.asList(employee1, employee2));
        manager2.children.add(employee3);
        manager3.children.add(employee4);

        ReporteeCounter counter = new ReporteeCounter();
        counter.countReportees(ceo);

        // Print reportee count for each employee
        printReporteeCount(ceo);
    }

    private static void printReporteeCount(TreeNode node) {
        System.out.println("Node " + node.name + " has " + node.count + " reportee(s).");
        for (TreeNode child : node.children) {
            printReporteeCount(child);
        }
    }
}
