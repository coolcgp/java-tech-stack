package com.guanniao.二叉树;


import java.util.Stack;

/**
 * 描述:
 * 非递归遍历二叉树
 *
 * @author chongguanpeng
 * @create 2019-12-06 22:33
 */
public class PreOrderNoRecursion {

    public void preOrderNoRecursion(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode curNode = stack.pop();
            System.out.println(curNode.val);
            // 根弹栈的同时，子节点压栈
            if (curNode.right != null) {
                stack.add(curNode.right);
            }
            if (curNode.left != null) {
                stack.add(curNode.left);
            }
        }
    }


    public static void main(String[] args) {

/**
 *        50
 *       /  \
 *     30   100
 *    / \   / \
 *   20 40 80 120
 */

        TreeNode node50 = new TreeNode(50);
        TreeNode node30 = new TreeNode(30);
        TreeNode node100 = new TreeNode(100);
        TreeNode node20 = new TreeNode(20);
        TreeNode node40 = new TreeNode(40);
        TreeNode node80 = new TreeNode(80);
        TreeNode node120 = new TreeNode(120);

        node50.left = node30;
        node50.right = node100;
        node30.left = node20;
        node30.right = node40;
        node100.left = node80;
        node100.right = node120;

        PreOrderNoRecursion solution = new PreOrderNoRecursion();
        solution.preOrderNoRecursion(node50);


    }
}
