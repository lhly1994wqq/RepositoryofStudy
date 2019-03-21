package JunitTest;

import org.junit.Assert;
import org.junit.Test;

public class TestCase2 {

    @Test
    public void testSum1(){
        System.out.println("TestCase2测试testSum1");
        int result = SumUtil.sum1(1,2);
        Assert.assertEquals(result,3);
    }

    @Test
    public void testSum2(){
        System.out.println("TestCase2测试testSum1");
        int result = SumUtil.sum2(1,2,3);
        Assert.assertEquals(result,6);
    }

}
