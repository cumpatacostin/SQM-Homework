public class Masina {
    private String name;
    private MotorMasina motorMasina;
    private double price;

    public MotorMasina getMotorMasina() {
        return motorMasina;
    }
    public void setName(String name) { //todo
        this.name = name;
    }
    public String getName() {return name;}
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Masina(){
        this.motorMasina = new MotorMasina(1000);
        this.name ="MyRocket";
        this.price = 10000;
    }

    public Masina(String name, double price) { //todo
        super();
        this.name = name;
        this.price = price;
    }
}