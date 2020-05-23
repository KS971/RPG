package Tree;

import java.util.function.Consumer;

public class TreeNode<T> {
    private T data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }
    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return this.data;
    }
    public void makeLeftSubNode(TreeNode node) {
        if (this.left != null) {
            this.left = null;
        }
        this.left = node;
    }
    public void makeRightSubTreeNode(TreeNode node) {
        if (this.right != null) {
            this.right = null;
        }
        this.right = node;
    }
    public TreeNode getLeftSubTreeNode(TreeNode node) {
        return node.left;
    }

    public TreeNode getRightSubTreeNode(TreeNode node) {
        return node.right;
    }
    public static void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + "\t");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public static void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.getData() + "\t");
            inOrder(node.right);
        }
    }
    public static void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.getData() + "\t");
        }
    }
}