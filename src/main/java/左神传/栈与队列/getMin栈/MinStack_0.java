package 左神传.栈与队列.getMin栈;

import java.util.Stack;

/**
 * @program: java-tech-stack
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2021-03-17 00:13
 **/
public class MinStack_0 {

    /**
     * 数据栈
     */
    private Stack<Integer> dataStack;

    /**
     * 最小栈
     */
    private Stack<Integer> minStack;

    public MinStack_0() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        if (!minStack.isEmpty() && minStack.peek() < x) {
            return;
        }
        minStack.push(x);
    }

    public void pop() {
        int ele = dataStack.pop();
        if (!minStack.isEmpty() && minStack.peek().equals(ele)) {
            minStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack_0 minStack0 = new MinStack_0();
        minStack0.push(-2);
        minStack0.push(0);
        minStack0.push(-3);
        System.out.println("" + minStack0.getMin());   //--> 返回 -3.
        minStack0.pop();
        System.out.println("" + minStack0.top());      //--> 返回 0.
        System.out.println("" + minStack0.getMin());   //--> 返回 -2.

    }
}
