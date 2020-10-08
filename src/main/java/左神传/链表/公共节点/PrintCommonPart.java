package 左神传.链表.公共节点;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-03 23:01
 **/

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

public class PrintCommonPart {

    /**
     * 打印公共链表
     *
     * @param head1
     * @param head2
     */
    public static void PrintCommon(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.value == head2.value) {
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.value < head2.value) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node1_1 = new Node(1);
        Node node1_2 = new Node(2);
        Node node1_3 = new Node(3);
        Node node1_4 = new Node(4);
        node1_1.next = node1_2;
        node1_2.next = node1_3;
        node1_3.next = node1_4;

        Node node2_1 = new Node(0);
        Node node2_2 = new Node(2);
        Node node2_3 = new Node(3);
        Node node2_4 = new Node(4);
        node2_1.next = node2_2;
        node2_2.next = node2_3;
        node2_3.next = node2_4;

        PrintCommon(node1_1, node2_1);

    }

}
