package 左神传.栈与队列.栈排序另一个栈;

import java.util.Stack;
import java.util.stream.IntStream;

/**
 * @program: arthmetic-basic-pro
 * @description: 排序
 * @author: scl chongguanpeng coolcgp@163.com
 * @create: 2020-03-02 22:33
 **/
public class Solution {

    /**
     * 排序
     *
     * @param stack
     */
    public void sort(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            Integer top = stack.pop();
            while (!help.isEmpty() && help.peek() > top) {
                stack.push(help.pop());
            }
            help.push(top);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        IntStream.of(2, 3, 1, 5, 4).forEach(stack::push);
        Solution solution = new Solution();
        solution.sort(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
