package 左神传.链表.删除指定元素的链表;

import 左神传.链表.公共工具.Node;

import java.util.Arrays;
import java.util.List;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-14 23:07
 **/
public class Solution {

    /**
     * @param head
     * @param n
     * @return
     */
    public static Node delete(Node head, int n) {
        Node dummy = new Node();
        dummy.next = head;
        Node p = dummy;
        while (p.next != null) {
            // d -> 1 -> 2 -> 3 -> 3
            while (p.next.value == n) {
                p.next = p.next.next;
                if (p.next == null) {
                    break;
                }
            }
            if (p.next != null) {
                p = p.next;
            } else {
                break;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 2, 1);
        Node.print(delete(Node.buildByList(list), 3));
    }
}
