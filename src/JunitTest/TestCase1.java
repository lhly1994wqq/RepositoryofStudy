package JunitTest;

import org.junit.*;

public class TestCase1 {

    @Before
    public void before(){
        System.out.println("测试之前做的事");
    }

    @After
    public void after(){
        System.out.println("测试之后做的事");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("在测试之前的之前需要做的事");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("在测试之后的之后需要做的事");
    }

    @Test
    public void testSum1(){
        System.out.println("TestCase1测试testSum1");
        int result = SumUtil.sum1(1,2);
        Assert.assertEquals(result,3);
    }

    @Test
    public void testSum2(){
        System.out.println("TestCase1测试testSum1");
        int result = SumUtil.sum2(1,2,3);
        Assert.assertEquals(result,6);
    }
}
