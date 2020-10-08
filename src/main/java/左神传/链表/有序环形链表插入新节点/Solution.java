package 左神传.链表.有序环形链表插入新节点;

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
     * @param num
     * @return
     */
    public static Node insertIntoCircleLinkedList(Node head, int num) {
        Node dummy = new Node();
        dummy.next = head;
        Node p = dummy;
        // d -> 10 -> 20 -> 20 -> 30 -> 40 -> 10
        while (p == dummy || p.next != head) {
            if (num < p.next.value) {
                Node node = new Node(num);
                node.next = p.next;
                p.next = node;
                break;
            }
            p = p.next;
        }
        if (num > p.value) {
            Node node = new Node(num);
            node.next = p.next;
            p.next = node;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 20, 30, 40);
        Node head = Node.buildByList(list);
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = head;
        Node node = insertIntoCircleLinkedList(head, 50);
        System.out.println(node.value);
    }
}
