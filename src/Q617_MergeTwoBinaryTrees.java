public class Q617_MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 != null || t2 != null) {
            if (t1 != null && t2 != null) {
                t1.val = t1.val + t2.val;
                t1.left = mergeTrees(t1.left, t2.left);
                t1.right = mergeTrees(t1.right, t2.right);
            } else if (t1 != null) {
                return t1;
            } else {
                return t2;
            }
            return t1;
        }
        return null;
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}