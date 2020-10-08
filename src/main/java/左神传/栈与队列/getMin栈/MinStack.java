package 左神传.栈与队列.getMin栈;

import java.util.Stack;

/**
 * @program: arthmetic-basic-pro
 * @description: 最小栈
 * 核心解题思路，两个栈如
 * @author: scl chongguanpeng coolcgp@163.com
 * @create: 2020-02-21 09:46
 **/
class MinStack {

    private Stack<Integer> dataStack;

    private Stack<Integer> minStack;

    public MinStack() {
        this.dataStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int x) {
        this.dataStack.push(x);
        if (this.minStack.isEmpty()) {
            this.minStack.push(x);
        } else {
            Integer top = this.minStack.peek();
            if (top <= x) {
                this.minStack.push(top);
            } else {
                this.minStack.push(x);
            }
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
        MinStack minStack1 = new MinStack();
        minStack1.push(-2);
        minStack1.push(0);
        minStack1.push(-3);
        System.out.println(minStack1.getMin());   //--> 返回 -3.
        minStack1.pop();
        System.out.println(minStack1.top());      //--> 返回 0.
        System.out.println(minStack1.getMin());   //--> 返回 -2.
    }
}
