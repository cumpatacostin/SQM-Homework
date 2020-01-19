public class SuperMasina extends Masina {
    private int flySpeed = 1000;

    public SuperMasina(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public boolean shouldFlyFast() {
        return flySpeed > 300;
    }
}
