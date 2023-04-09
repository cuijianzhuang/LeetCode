import org.junit.Test;

import java.util.Arrays;


/**
 * @Title: ArrayTest
 * @Author cuijianzhuang
 * @Package PACKAGE_NAME
 * @Date 2023/4/8 14:04
 * @description: 单元测试
 */

public class ArrayTest {
    //测试类
    @Test
    public  void containsDuplicateTest(){
        int[] nums ={1,2,3,1};
        containsDuplicate containsDuplicate = new containsDuplicate();
        boolean b = containsDuplicate.containsDuplicate(nums);
        boolean c = containsDuplicate.containsDuplicateHash(nums);
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void maxSubArrayTest(){
        //nums = [-2,1,-3,4,-1,2,1,-5,4]
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray maxSubArray = new maxSubArray();
        int i = maxSubArray.maxSubArray(nums);
        System.out.println(i);
    }

    @Test
    public void rotateTest(){
        //输入: nums = [1,2,3,4,5,6,7], k = 3
        //输出: [5,6,7,1,2,3,4]
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        Array array = new Array();
        int[] rotate = array.rotate(nums, k);
        System.out.println(Arrays.toString(rotate));
    }

}
