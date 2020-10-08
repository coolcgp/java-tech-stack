package 左神传.链表.环形链表;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-09-13 23:01
 **/
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        boolean rst = false;
        while (dummy.next != null) {
            if (set.contains(dummy.next)) {
                rst = true;
                break;
            }
            set.add(dummy.next);
            dummy = dummy.next;

        }
        return rst;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        Solution solution = new Solution();
        boolean rst = solution.hasCycle(node1);
        System.out.println(rst);
    }

}