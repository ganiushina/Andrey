public class Motorcycle implements Vehicle {

    String brand;
    Model[] model;

    public Motorcycle(String brand, int n) {
        this.brand = brand;
        this.model = new Model[n];
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public Model[] getModel() {
        return model;
    }

    @Override
    public void setModel(Model[] model) {
        this.model = model;
    }
}
