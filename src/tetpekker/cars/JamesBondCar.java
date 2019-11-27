package tetpekker.cars;

public class JamesBondCar extends Car {

    public int drive(int howLong){
        distance = howLong*180;
        System.out.println("I'm f@cking speedy! I'm driving to the " + distance + " distance!");
        return distance;
    }
}
