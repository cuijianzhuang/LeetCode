import java.util.HashMap;

/**
 * @Title: twoSum
 * @Author cuijianzhuang
 * @Package PACKAGE_NAME
 * @Date 2023/4/9 22:39
 * @description: 两数之和
 */
public class twoSum {

    /**
     * 1.两数之和
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     */
    //方法一 暴力枚举
    public int[] twoSumBao(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }


    //方法二 哈希表法
    public int[] twoSumHash(int[] nums, int target) throws IllegalAccessException {
        int length = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>(length - 1);
        hashMap.put(nums[0], 0);
        for (int i = 1; i < length; i++) {
            int another = target - nums[i];
            if (hashMap.containsKey(another)) {
                return new int[]{i, hashMap.get(another)};
            }
            hashMap.put(nums[i], i);
        }
        throw new IllegalAccessException("No two sum");
    }
}