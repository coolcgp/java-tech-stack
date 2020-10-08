package 左神传.栈与队列.栈排序;

import java.util.Stack;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-02 23:38
 **/
public class StackSort {

    /**
     * 通过一个栈翻转另一个栈
     * @param stack
     */
    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            while (!help.isEmpty() && help.peek() > pop) {
                stack.push(help.pop());
            }
            help.push(pop);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        sort(stack);
        System.out.println("123");
    }
}
