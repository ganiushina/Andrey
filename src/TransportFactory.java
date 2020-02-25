public interface TransportFactory {

    public static Vehicle createInstance(String name, int size){
        Vehicle vehicle = new Vehicle() {
            @Override
            public String getBrand() {
                return null;
            }

            @Override
            public void setBrand(String brand) {

            }

            @Override
            public Double getModel(String name) {
                return null;
            }

            @Override
            public void setModel(Model[] model) {

            }
        };
        return vehicle ;
    }
}
