package 左神传.栈与队列.getMin栈;

import java.util.Stack;

/**
 * @program: java-tech-stack
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2021-03-17 23:22
 **/
public class MinStack {

    private Stack<Integer> minStack;

    private Stack<Integer> dataStack;

    public MinStack() {
        this.minStack = new Stack<>();
        this.dataStack = new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        } else if (this.getMin() <= x) {
            minStack.push(this.getMin());
        } else {
            minStack.push(x);
        }
    }

    public void pop() {
        this.dataStack.pop();
        this.minStack.pop();
    }

    public int top() {
        return this.dataStack.peek();
    }

    public int getMin() {
        return this.minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack0 = new MinStack();
        minStack0.push(-2);
        minStack0.push(0);
        minStack0.push(-3);
        System.out.println("" + minStack0.getMin());   //--> 返回 -3.
        minStack0.pop();
        System.out.println("" + minStack0.top());      //--> 返回 0.
        System.out.println("" + minStack0.getMin());   //--> 返回 -2
    }

}
