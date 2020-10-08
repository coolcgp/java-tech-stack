package 左神传.栈与队列.翻转栈;

import java.util.Stack;
import java.util.stream.IntStream;

/**
 * @program: arthmetic-basic-pro
 * @description: 翻转栈
 * @author: scl chongguanpeng coolcgp@163.com
 * @create: 2020-02-25 23:57
 **/
public class Solution {

    public Integer removeStackBottomEle(Stack<Integer> stack) {
        Integer top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        } else {
            Integer ele = this.removeStackBottomEle(stack);
            stack.push(top);
            return ele;
        }
    }

    /**
     * 高，实在是高！倒拿正打
     * @param stack
     */
    public void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()){
            return;
        }
        Integer bottomEle = this.removeStackBottomEle(stack);
        this.reverse(stack);
        stack.push(bottomEle);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        IntStream.rangeClosed(1, 5).forEach(stack::push);
        stack.forEach(System.out::print);
        System.out.println();
        Solution solution = new Solution();
        solution.reverse(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
