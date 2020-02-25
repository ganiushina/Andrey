public class VehicleFactory {

    static TransportFactory factory = new AutoFactory(new Car("BMW", 3));

    static Vehicle vehicle;


    public static void createInstance(String name, int size){
        createInstance(name, size);
    }

}
