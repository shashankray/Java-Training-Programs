public class program2 {

    public static void main(String[] args){

        Car car = new ferrari();
        Carrepair carrepair = new Carrepair();

        carrepair.repaircar(car);

        car = new audi();
        carrepair.repaircar(car);

    }
}
