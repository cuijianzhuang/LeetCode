/**
 * @Title: Array
 * @Author cuijianzhuang
 * @Package PACKAGE_NAME
 * @Date 2023/4/8 22:16
 * @description: 数组
 */
public class Array {

    /**
     * 189
     * 转轮数组：
     * 题目：给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
     */

    public int[] rotate(int[] nums, int k) {
            int n = nums.length;
            int[] newArr = new int[n];
            for (int i = 0; i < n; ++i) {
                newArr[(i + k) % n] = nums[i];
            }
            System.arraycopy(newArr, 0, nums, 0, n);
            return newArr;
        }


    /**
     *
     */

}
