import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestCode {
    @Test
    public void testMultiply() throws Exception {
        float value = Main.Multiply(8,4);
        Assert.assertEquals(32.0, value, 0.0002);
    }

    @Test
    public void testDivide() throws Exception {
        float value = Main.Divide(8,4);
        Assert.assertEquals(2.0, value, 0.0002);
    }

    @Test
    public void testSubtract() throws Exception {
        float value = Main.Subtract(8,4);
        Assert.assertEquals(4.0, value, 0.0002);
    }

    @Test
    public void testAdd() throws Exception {
        float value = Main.Add(8,4);
        Assert.assertEquals(12.0, value, 0.0002);
    }
}
