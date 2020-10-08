package 左神传.栈与队列.滑动窗口最大值;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @program: arthmetic-basic-pro
 * @description: leetcode-239
 * @author: scl chongguanpeng coolcgp@163.com
 * @create: 2020-03-15 21:47
 **/
public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || nums.length < k) {
            return new int[] {};
        }
        LinkedList<Integer> qmax = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!qmax.isEmpty() && nums[qmax.peekLast()] <= nums[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (i + 1 - k > qmax.peekFirst()) {
                qmax.pollFirst();
            }
            if (i >= k - 1) {
                res[index++] = nums[qmax.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 5, 4, 3, 3, 6, 7};
        int k = 3;
        Solution solution = new Solution();
        int[] result = solution.maxSlidingWindow(nums, k);
        Arrays.stream(result).forEach(System.out::println);
    }

}
