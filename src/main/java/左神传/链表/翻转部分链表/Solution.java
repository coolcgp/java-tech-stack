package 左神传.链表.翻转部分链表;

import 左神传.链表.公共工具.Node;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: George   ChongVIP
 * @create: 2020-08-06 00:04
 **/
public class Solution {

    public static Node reverseSome(Node node, int n) {
        int i = 0;
        Node dummy = new Node();
        dummy.next = node;
        while (i < n && node.next != null) {
            Node next = node.next;
            node.next = node.next.next;
            next.next = dummy.next;
            dummy.next = next;
            i++;
        }
        return dummy.next;
    }

    public static Node reversePart(Node head, int from, int to) {
        if (head == null) {
            return null;
        }
        Node dummy = new Node();
        dummy.next = head;
        // 定位
        int i = 0;
        Node p = dummy;
        while (i < from - 1) {
            p = p.next;
            i++;
        }
        // 开始反转
        p.next = reverseSome(p.next, to - from);
        return dummy.next;
    }

    public static void main(String[] args) {
        Node.print(reversePart(Node.buildByRange(6), 2, 4));
    }
}
