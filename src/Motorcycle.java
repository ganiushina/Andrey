public class Motorcycle implements Vehicle {

    String brand;
    Model[] models;

    public Motorcycle(String brand, int n) {
        this.brand = brand;
        this.models = new Model[n];
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
    public Double getModel(String name) {
        Double modelPrice = null;
        for (int i = 0; i <models.length ; i++) {
            if (models[i].name == name)
                modelPrice = models[i].price;
        }
        return modelPrice;
    }



    @Override
    public void setModel(Model[] models) {
        this.models = models;
    }
}
