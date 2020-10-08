package 左神传.链表.翻转链表;

import 左神传.链表.公共工具.Node;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-04 23:22
 **/
public class ReverseSingleNodeList {

    /**
     * 反转单链表
     * @param head
     * @return
     */
    public static Node reverse(Node head) {
        Node dummy = new Node();
        dummy.next = head;
        Node p = dummy.next;
        // p -> 1 -> 2 -> 3 -> 4
        // p -> 2 -> 1 -> 3 -> 4
        // p -> 3 -> 2 -> 1 -> 4
        while (p.next != null) {
            Node curNode = p.next;
            p.next = p.next.next;
            curNode.next = dummy.next;
            dummy.next = curNode;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node node1_1 = new Node(1);
        Node node1_2 = new Node(2);
        Node node1_3 = new Node(3);
        Node node1_4 = new Node(4);
        node1_1.next = node1_2;
        node1_2.next = node1_3;
        node1_3.next = node1_4;
        Node head = reverse(node1_1);
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

}
