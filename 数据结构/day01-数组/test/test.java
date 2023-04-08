import org.junit.Test;


/**
 * @Title: test
 * @Author cuijianzhuang
 * @Package PACKAGE_NAME
 * @Date 2023/4/8 14:04
 * @description:
 */

public class test {
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

}
