package 左神传.链表.删除指定处节点;

import 左神传.链表.公共工具.Node;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-07 00:01
 **/
public class Solution {

    /**
     * 删除第a/b处的节点
     *
     * @param head
     * @param a
     * @param b
     * @return
     */
    public static Node removeByRatio(Node head, int a, int b) {
        if (a < 1 || a > b) {
            return head;
        }
        int len = 0;
        Node p = head;
        while (p != null) {
            p = p.next;
            len++;
        }
        // 确定位置，先乘再除
        int pos = (int) Math.ceil((double) (a * len) / (double) b);
        if (pos == 1) {
            head = head.next;
        }
        p = head;
        int i = 1;
        while (i < pos - 1) {
            p = p.next;
            i++;
        }
        p.next = p.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node.print(removeByRatio(Node.buildByRange(6), 1, 2));
    }
}
