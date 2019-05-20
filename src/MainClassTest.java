import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test
    public void test()
    {
        MainClass a = new MainClass();
        Assert.assertTrue("getLocalNumber is not equal 14", a.getLocalNumber() == 14);
    }
}
