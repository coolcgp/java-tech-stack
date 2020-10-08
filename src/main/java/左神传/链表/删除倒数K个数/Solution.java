package 左神传.链表.删除倒数K个数;

import 左神传.链表.公共工具.Node;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-05 23:24
 **/
public class Solution {

    /**
     * 删除链表的倒数第K个元素，其实就是删除链表的第1个元素是个小陷阱
     * @param node
     * @param k
     * @return
     */
    public static Node removeK(Node node, int k) {
        int num = 0;
        Node p = node;
        while (p != null) {
            num++;
            p = p.next;
        }
        int n = num - (k % num == 0 ? num : k % num);
        int i = 1;
        Node pre = new Node();
        pre.next = node;
        Node dummy = new Node();
        dummy = pre;
        while (i <= n) {
            pre = pre.next;
            i++;
        }
        pre.next = pre.next == null ? null : pre.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node.print(removeK(Node.buildByRange(4), 1));
    }
}
