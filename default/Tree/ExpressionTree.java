package Tree;

import Stack.ArrayStack;

import java.util.function.Consumer;

import static Tree.TreeNode.*;

public class ExpressionTree {
    public static TreeNode makeExpTree(char exp[]) {
        ArrayStack stack = new ArrayStack(20);
        TreeNode pnode;

        int explen = exp.length;

        for(int i = 0; i < explen; i++) {
            pnode = new TreeNode();

            if(Character.isDigit(exp[i])) {
                pnode.setData(exp[i] - '0');
            }
            else {
                pnode.makeLeftSubNode((TreeNode)stack.pop());
                pnode.makeRightSubTreeNode((TreeNode)stack.pop());
                pnode.setData(exp[i]);
            }
            stack.push(pnode);
        }
        return (TreeNode)stack.pop();
    }
    public static void ShowPrefixTypeExp(TreeNode node) {
        preOrder(node);
    }
    public static void ShowInfixTypeExp(TreeNode node) {
        inOrder(node);
    }
    public static void ShowPostfixTypeExp(TreeNode node) {
        postOrder(node);
    }
}