package 左神传.栈与队列.窗口最大值;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-01 22:28
 **/
public class GetPairNum {

    /**
     * 最大值减去最小值小于或等于num的子数组数量
     * https://www.nowcoder.com/questionTerminal/5fe02eb175974e18b9a546812a17428e
     */
    public static int countPairNum(int[] array, int num) {
        Queue<Integer> maxQueue = new LinkedList<>();
        Queue<Integer> minQueue = new LinkedList<>();
        int rst = 0, j = 0;
        for (int i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                while (!maxQueue.isEmpty() && array[maxQueue.peek()] <= array[i]) {
                    maxQueue.poll();
                }
                maxQueue.add(i);
                while (!minQueue.isEmpty() && array[minQueue.peek()] >= array[i]) {
                    minQueue.poll();
                }
                minQueue.add(i);
                if (!maxQueue.isEmpty() && !minQueue.isEmpty() && array[maxQueue.peek()] - array[minQueue.peek()] > num) {
                    break;
                }
                j++;
            }
            rst += (j - i);
            if (!maxQueue.isEmpty() && maxQueue.peek() == i) {
                maxQueue.poll();
            }
            if (!minQueue.isEmpty() && minQueue.peek() == i) {
                minQueue.poll();
            }
            i++;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int num = 2;
        int rst = countPairNum(array, num);
        System.out.println(rst);
    }

}
