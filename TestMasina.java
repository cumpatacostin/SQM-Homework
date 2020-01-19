import org.junit.Assert;
import org.junit.Test;


public class TestMasina {

    @Test
    public void testSetName() {
        String expectedName = "Raketa";
        Masina masina = new Masina("Another Name", 30000d);

        masina.setName(expectedName);
        Assert.assertEquals(expectedName, masina.getName());
    }

    @Test
    public void testSetPrice() {
        double expectedPrice = 100d;
        Masina masina = new Masina("Masina", 30000d);

        masina.setPrice(expectedPrice);
        Assert.assertEquals(masina.getPrice(), expectedPrice, 0);
    }

    @Test
    public void testConstructor() {
        String expectedName = "Tesla";
        double expectedPrice = 3000d;

        Masina masina = new Masina(expectedName, expectedPrice);

        Assert.assertEquals(masina.getName(), expectedName);
        Assert.assertEquals(masina.getPrice(), expectedPrice, 0);
    }
}
