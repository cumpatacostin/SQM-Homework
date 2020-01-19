import org.junit.Assert;
import org.junit.Test;

public class TestMasinaEngine {

    @Test
    public void areMotor() {
        MotorMasina engine = new MotorMasina(10001);

        Assert.assertTrue(engine.isBig());
    }
}
