package 左神传.栈与队列.窗口最大值;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @program: arthmetic-basic-pro
 * @description: 获取最大值
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-07-31 22:31
 **/
public class GetMaxNum {

    /**
     * 滑动窗口取最大值
     * {3, 2, 5, 4, 7, 8, 6} -> 3,3,5,5,7,8,8
     * @param array
     * @param winSize
     * @return
     */
    public static Integer[] getMaxNum(int[] array, int winSize) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> rstList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            while (!queue.isEmpty() && array[queue.peek()] <= array[i]) {
                queue.poll();
            }
            queue.add(i);
            if (!queue.isEmpty() && queue.peek() == i - winSize) {
                rstList.add(array[queue.poll()]);
            } else if (!queue.isEmpty() && queue.peek() > i - winSize) {
                rstList.add(array[queue.peek()]);
            }
        }
        return rstList.toArray(new Integer[rstList.size()]);
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 4, 7, 8, 6};
        int winSize = 3;
        Integer[] maxNum = getMaxNum(array, winSize);
        System.out.println(Arrays.stream(maxNum).map(String::valueOf).collect(Collectors.joining(",")));
    }
}
