package 左神传.链表.公共工具;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-05 23:25
 **/
public class Node {
    public Integer value;
    public Node next;

    public Node() {
        value = null;
        next = null;
    }

    public Node(Integer value) {
        this.value = value;
    }

    public static Node random(int n) {

        List<Node> nodeList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Node node = new Node((int) (Math.random() * n));
            nodeList.add(node);
            if (i > 0) {
                nodeList.get(i - 1).next = node;
            }
        }
        return nodeList.get(0);
    }

    public static Node buildByRange(int n) {

        List<Node> nodeList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Node node = new Node(i + 1);
            nodeList.add(node);
            if (i > 0) {
                nodeList.get(i - 1).next = node;
            }
        }
        return nodeList.get(0);
    }

    public static Node randomPlalindrome(int n, boolean even) {

        List<Node> nodeList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Node node = new Node(i + 1);
            nodeList.add(node);
        }
        List<Node> allNodeList = new ArrayList<>(nodeList);
        int num = even ? 0 : 1;
        for (int i = nodeList.size() - 1 - num; i >= 0; i--) {
            allNodeList.add(new Node(nodeList.get(i).value));
        }
        for (int i = 0; i < allNodeList.size() - 1; i++) {
            allNodeList.get(i).next = allNodeList.get(i + 1);
        }
        return allNodeList.get(0);
    }

    public static Node buildByList(List<Integer> list) {
        Node head = new Node();
        Node p = head;
        for (Integer value : list) {
            Node node = new Node(value);
            p.next = node;
            p = p.next;
        }
        return head.next;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
