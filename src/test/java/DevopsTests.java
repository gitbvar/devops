import org.testng.Assert;
import org.testng.annotations.Test;
public class DevopsTests {
    @Test
    public void testEtienne() {
        // Assert
        Assert.assertEquals(Calculatrice.addition(2,3), 5);
    }
    @Test
    public void testYann() {
        Assert.assertEquals(Calculatrice.addition(1, 7), 8); // 8
    }
    @Test
    public void testBrian() {
        Assert.assertEquals(Calculatrice.addition(0, 3), 3); // 3
    }
    @Test
    public void testML() {
        Assert.assertEquals(Calculatrice.addition(1,9), 10); // 10
    }
    @Test
    public void testLuis() {
        Assert.assertEquals(Calculatrice.addition(-5, -5), -10); // -10
    }
}

