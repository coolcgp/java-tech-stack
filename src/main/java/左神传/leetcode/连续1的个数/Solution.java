package 左神传.leetcode.连续1的个数;

/**
 * @program: arthmetic-basic-pro
 * @description:
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-08-05 00:21
 **/
class Solution {


    public int longestOnes(int[] A, int K) {
        int left = 0;
        int right = 0;
        int max = 0;
        for (right = 0; right < A.length; right++) {
            if (A[right] == 0) {
                if (K == 0) {
                    while (A[left] == 1) {
                        left++;
                    }
                    left++;
                } else {
                    K--;
                }
            }
            max = Math.max(right - left + 1, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int K = 3;
        Solution solution = new Solution();
        int rst = solution.longestOnes(A, K);
        System.out.println(rst);
    }
}
