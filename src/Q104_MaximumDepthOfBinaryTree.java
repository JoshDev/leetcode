import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepthDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> heights = new Stack<>();
        int max = 0;
        nodes.push(root);
        heights.push(1);
        while (!nodes.isEmpty()) {
            TreeNode node= nodes.pop();
            Integer height = heights.pop();
            max = Math.max(height, max);
            if (node.left != null) {
                nodes.push(node.left);
                heights.push(height + 1);
            }
            if (node.right != null) {
                nodes.push(node.right);
                heights.push(height + 1);
            }
        }
        return max;
    }

    public int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> qq = new LinkedList<>();
        int max = 0;
        qq.offer(root);
        while (!qq.isEmpty()) {
            int size = qq.size();
            while (size-- > 0) {
                TreeNode node = qq.remove();
                if (node.left != null) {
                    qq.offer(node.left);
                }
                if (node.right != null) {
                    qq.offer(node.right);
                }
            }
            max++;
        }
        return max;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
