package 左神传.链表.合并两个有序链表;

import 左神传.链表.公共工具.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-14 23:07
 **/
public class Solution {


    public static Node merge(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }
        Node dummy = new Node();
        Node p = dummy;
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                p.next = new Node(head1.value);
                p = p.next;
                head1 = head1.next;
            } else if (head1.value > head2.value) {
                p.next = new Node(head2.value);
                p = p.next;
                head2 = head2.next;
            } else {
                p.next = new Node(head1.value);
                p = p.next;
                head1 = head1.next;
                p.next = new Node(head2.value);
                p = p.next;
                head2 = head2.next;
            }
        }
        p.next = head1 == null ? head2 : head1;
        return dummy.next;
    }

    public static void main(String[] args) {
        List<Integer> list1 = IntStream.rangeClosed(1, 4).boxed().collect(Collectors.toList());
        List<Integer> list2 = IntStream.rangeClosed(2, 5).boxed().collect(Collectors.toList());
        Node head1 = Node.buildByList(list1);
        Node head2 = Node.buildByList(list2);
        Node merge = merge(head1, head2);
        Node.print(merge);
    }
}
