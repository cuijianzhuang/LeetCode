import org.junit.Test;

import java.util.Arrays;

/**
 * @Title: test
 * @Author cuijianzhuang
 * @Package PACKAGE_NAME
 * @Date 2023/4/9 22:39
 * @description: 单元测试
 */
public class test {

    @Test
    public void twoSumHashTest() throws IllegalAccessException {
        //输入：nums = [2,7,11,15], target = 9
        int nums[] ={2,7,11,15};
        int target = 17;
        twoSum twoSum = new twoSum();
        int[] ints = twoSum.twoSumHash(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void twoSumBao() {
        int nums[] ={2,7,11,15};
        int target = 9;
        int[] ints = new twoSum().twoSumBao(nums, target);
        System.out.println(Arrays.toString(ints));
    }
}
