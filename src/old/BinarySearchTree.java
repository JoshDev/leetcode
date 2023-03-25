package old;

import java.util.Arrays;

public class BinarySearchTree {

    TreeNode head;
    BinarySearchTree(int val) {
        this.head = new TreeNode(val);
    }

    public TreeNode insert(int value) {
        return insert(head, value);
    }

    private TreeNode insert(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        } else if (value <= node.val){
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void inOrder() {
        inOrder(head);
    }

    private void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.val + " ");
            inOrder(node.right);
        }
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

    public static void main(String[] args) {
        int[] arr = {65, 68, 82, 42, 10, 75, 25, 47, 32, 72};
        System.out.println("Original array - " + Arrays.toString(arr));
        // start creating tree with element at index 0 as root node
        BinarySearchTree bst = new BinarySearchTree(arr[0]);
        for(int num : arr){
            bst.insert(num);
        }
        System.out.print("Sorted Array after Tree sort - ");
        bst.inOrder();
        System.out.println();
    }

}
