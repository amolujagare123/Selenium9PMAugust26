package TestNG.Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTwo {

    @Test
    public void ClassTwoTest1() {
        System.out.println("ClassTwoTest1");
    }

    @Test
    public void ClassTwoTest2() {
        System.out.println("ClassTwoTest2");
        Assert.assertEquals(true,false ,"this is failed");
    }

    @Test
    public void ClassTwoTest3() {
        System.out.println("ClassTwoTest3");
    }
}
