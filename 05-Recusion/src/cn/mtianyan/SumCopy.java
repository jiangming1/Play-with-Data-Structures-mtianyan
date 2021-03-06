package cn.mtianyan;

/**
 * 该类为mtianyan个人注释版。
 */
public class SumCopy {
    /**
     * 面向用户的sum函数，不需要感知内部实现
     *
     * @param arr
     * @return
     */
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    /**
     * 语义为求arr[l...n)的和
     *
     * @param arr
     * @param l
     * @return
     */
    private static int sum(int[] arr, int l) {
        // 求解最基本问题
        if (l == arr.length) {
            return 0;
        }
        // 问题不断更小化
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(arr));
    }
}
