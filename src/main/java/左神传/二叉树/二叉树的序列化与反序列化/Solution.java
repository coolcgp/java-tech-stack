package 左神传.二叉树.二叉树的序列化与反序列化;

import 左神传.二叉树.Node;
import 左神传.二叉树.BinaryTreeHelper;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    /**
     * 序列化
     *
     * @param head 头结点
     * @return 序列化字符串
     */
    public String serialByPreOrder(Node head) {
        if (head == null) {
            return "#^";
        }
        String res = head.value + "^";
        res += serialByPreOrder(head.left);
        res += serialByPreOrder(head.right);
        return res;
    }

    /**
     * 将一个先根遍历的队列转为一棵二叉树
     *
     * @param queue
     * @return
     */
    private Node reconPreOrder(Queue<String> queue) {
        String value = queue.poll();
        if (value.equals("#")) {
            return null;
        }
        Node head = new Node(Integer.parseInt(value));
        head.left = reconPreOrder(queue);
        head.right = reconPreOrder(queue);
        return head;
    }

    /**
     * 反序列化的入口，将字符串转为队列
     *
     * @param preStr
     * @return
     */
    public Node reconByPreString(String preStr) {
        String[] values = preStr.split("^");
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i < values.length; i++) {
            queue.offer(values[i]);
        }
        return reconPreOrder(queue);
    }

    public static void main(String[] args) {
        Node root = BinaryTreeHelper.constructATree();
        Solution solution = new Solution();
        String s = solution.serialByPreOrder(root);
        System.out.println(s);
        Node node = solution.reconByPreString(s);
        BinaryTreeHelper.print(node);
    }

}
