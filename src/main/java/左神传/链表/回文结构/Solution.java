package 左神传.链表.回文结构;

import 左神传.链表.公共工具.Node;

import java.util.Stack;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-09 22:14
 **/
public class Solution {

    public static boolean isPlalindrome(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        int len = 0;
        Node p = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        p = head;
        for (int i = 0; i < len / 2; i++) {
            p = p.next;
        }
        if (len % 2 == 1) {
            p = p.next;
        }
        Stack<Node> stack = new Stack<>();
        while (p != null) {
            stack.push(p);
            p = p.next;
        }
        for (int i = 0; i < len / 2; i++) {
            Node cur = stack.pop();
            if (head.value != cur.value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPlalindrome(Node.randomPlalindrome(3, true)));
    }


}
