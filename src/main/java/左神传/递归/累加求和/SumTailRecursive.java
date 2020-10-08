package 左神传.递归.累加求和;

/**
 * @program: arthmetic-basic-pro
 * @description: 累加
 * @author: scl chongguanpeng coolcgp@163.com
 * @create: 2020-03-15 19:04
 **/
public class SumTailRecursive {

    /**
     * 尾递归
     *
     * @param n
     * @param sum
     * @return
     */
    public int count(int n, int sum) {
        if (n <= 0) {
            return sum;
        }
        sum += n;
        return count(n - 1, sum);
    }

    public static void main(String[] args) {
        SumTailRecursive sumRecursive = new SumTailRecursive();
        int num = 100;
        int sum = 0;
        System.out.println(sumRecursive.count(num, sum));
    }
}
