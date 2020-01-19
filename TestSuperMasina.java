import org.junit.Assert;
import org.junit.Test;

public class TestSuperMasina {

    @Test
    public void shouldGoFast() {
        SuperMasina superMasina = new SuperMasina(500);

        Assert.assertTrue(superMasina.shouldFlyFast());
    }
}
