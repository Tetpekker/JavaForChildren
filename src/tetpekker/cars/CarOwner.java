package tetpekker.cars;

public class CarOwner {

    public static void main(String[] args){

        Car myCar = new Car();
        JamesBondCar jbc = new JamesBondCar();
        myCar.start();
        myCar.drive(10);
        jbc.drive(20);
        myCar.stop();
    }
}
