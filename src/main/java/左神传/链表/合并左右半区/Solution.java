package 左神传.链表.合并左右半区;

import 左神传.链表.公共工具.Node;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-16 21:15
 **/
public class Solution {

    public static Node merge(Node head) {
        if (head == null) {
            return head;
        }
        int len = 0;
        Node p = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        int rightStartIndex = len / 2;
        int i = 0;
        p = head;
        while (i < rightStartIndex - 1) {
            p = p.next;
            i++;
        }
        Node right = p.next;
        p.next = null;
        return merge(head, right);
    }
    public static Node merge(Node left, Node right) {
        Node dummy = new Node();
        dummy.next = left;
        Node p = dummy;
        while (left != null) {
            Node tmpLeft = left;
            left = left.next;
            tmpLeft.next = null;
            Node tmpRight = right;
            right = right.next;
            tmpRight.next = null;
            p.next = tmpLeft;
            p.next.next = tmpRight;
            p = tmpRight;
        }
        if (right != null) {
            p.next = right;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node merge = merge(Node.buildByRange(5));
        Node.print(merge);
    }
}
