package 左神传.链表.翻转指定长度;

import 左神传.链表.公共工具.Node;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-14 22:17
 **/
public class Solution {

    public static Node reverseSpecialInterval(Node head, int n) {
        if (head == null || n == 1) {
            return head;
        }
        Deque<Node> queue = new ArrayDeque<>();
        Node dummy = new Node();
        Node p = dummy;
        while (head != null) {
            if (queue.size() == n) {
                while (!queue.isEmpty()) {
                    p.next = new Node(queue.removeLast().value);
                    p = p.next;
                }
            }
            queue.add(head);
            head = head.next;
        }
        while (!queue.isEmpty()) {
            p.next = new Node(queue.removeFirst().value);
            p = p.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node.print(reverseSpecialInterval(Node.buildByRange(12), 5));
    }

}
