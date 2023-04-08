import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Title: containsDuplicate
 * @Author cuijianzhuang
 * @Package PACKAGE_NAME
 * @Date 2023/4/8 14:02
 * @description:
 */
public class containsDuplicate {
    /**
     * 217. 存在重复元素
     * 题目
     * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
     */

    //方法一：排序 首先从小到大排序，让后比较相邻两个元素是否相等
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }



    //方法二：哈希表
    //对于数组中每个元素，我们将它插入到哈希表中。如果插入一个元素时发现该元素已经存在于哈希表中，则说明存在重复的元素。
    public boolean containsDuplicateHash(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
