package 左神传.链表.复制链表;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-10 22:29
 **/
class Node {

    public int value;

    public Node next;

    public Node random;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }
}


public class Solution {

    public static Node copy(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node p = head;
        while (p != null) {
            map.put(p, new Node(p.value));
            p = p.next;
        }
        Node cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node2.random = node3;

        Node head = copy(node1);
        System.out.println(head.value);
    }

}
