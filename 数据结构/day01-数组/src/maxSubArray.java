/**
 * @Title: maxSubArray
 * @Author cuijianzhuang
 * @Package PACKAGE_NAME
 * @Date 2023/4/8 15:08
 * @description: 最大子数组和
 */

/**
 * 题目：给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 */

//方法一：动态规划
public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


    //todo-方法二待学习
}
