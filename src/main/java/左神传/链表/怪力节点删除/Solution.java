package 左神传.链表.怪力节点删除;

import 左神传.链表.公共工具.Node;

import java.util.Arrays;
import java.util.List;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-15 05:49
 **/
public class Solution {

    /**
     * 怪力节点删除
     *
     * @param node
     * @return
     */
    public static Node delete(Node node) {
        Node dummy = new Node();
        dummy.next = node;
        dummy.next = node.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Node node = Node.buildByList(list);
        node.next = delete(node.next);
        Node.print(node);
    }
}
