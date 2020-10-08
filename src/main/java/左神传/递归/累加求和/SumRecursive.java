package 左神传.递归.累加求和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: arthmetic-basic-pro
 * @description: 搜索优化求和
 * @author: scl chongguanpeng coolcgp@163.com
 * @create: 2020-03-15 19:04
 **/
public class SumRecursive {

    private int[] memory;

    public SumRecursive() {
        this.memory = new int[100000];
        Arrays.fill(this.memory, -1);
    }

    public int count(int n) {
        if (n <= 0) {
            return 0;
        }
        if (this.memory[n - 1] == -1) {
            this.memory[n - 1] = n + this.count(n - 1);
        }
        return this.memory[n - 1];
    }

    public static void main(String[] args) {
        SumRecursive sumRecursive = new SumRecursive();
        System.out.println(sumRecursive.count(8000));
    }
}
