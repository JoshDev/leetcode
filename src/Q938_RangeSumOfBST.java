public class Q938_RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        } else if (root.val < low || root.val > high) {
            return 0 + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        } else {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
