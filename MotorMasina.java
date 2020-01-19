public class MotorMasina {

    private int volume;

    public MotorMasina(int volume) {
        this.volume = volume;
    }

    public boolean isBig() {
        return volume > 10000;
    }
}
