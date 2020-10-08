package 左神传.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树辅助类
 *
 * @author chongguanpeng
 * @version 1.0
 * create on 2020-02-17 22:23
 */
public class BinaryTreeHelper {

    /**
     * 构建一棵二叉树
     *
     * @return 二叉树的根节点
     */
    public static Node constructATree() {
        Node node50 = new Node(50);
        Node node30 = new Node(30);
        Node node100 = new Node(100);
        Node node20 = new Node(20);
        Node node40 = new Node(40);
        Node node80 = new Node(80);
        Node node120 = new Node(120);

        node50.left = node30;
        node50.right = node100;
        node30.left = node20;
        node30.right = node40;
        node100.left = node80;
        node100.right = node120;
        return node50;
    }


    /**
     * 层次遍历一棵二叉树
     */
    public static void print(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node node;
        while (!queue.isEmpty()) {
            node = queue.poll();
            System.out.println(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

}
