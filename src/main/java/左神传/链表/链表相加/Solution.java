package 左神传.链表.链表相加;

import 左神传.链表.公共工具.Node;

import java.util.Stack;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-11 22:38
 **/
public class Solution {


    public static Node add(Node node1, Node node2) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Stack<Node> rstStack = new Stack<>();
        Node p1 = node1;
        Node p2 = node2;
        while (p1 != null) {
            stack1.add(p1);
            p1 = p1.next;
        }
        while (p2 != null) {
            stack2.add(p2);
            p2 = p2.next;
        }
        int n1 = 0;
        int n2 = 0;
        int rst = 0;
        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            n1 = stack1.isEmpty() ? 0 : stack1.pop().value;
            n2 = stack2.isEmpty() ? 0 : stack2.pop().value;
            rst = (n1 + n2 + carry) % 10;
            rstStack.add(new Node(rst));
            carry = (n1 + n2 + carry) / 10;
        }
        if (carry == 1) {
            rstStack.add(new Node(1));
        }
        Node p = new Node();
        Node head = p;
        while (!rstStack.isEmpty()) {
            p.next = rstStack.pop();
            p = p.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Node node1 = Node.buildByRange(3);
        Node node2 = Node.buildByRange(3);
        Node.print(add(node1, node2));
    }

}
