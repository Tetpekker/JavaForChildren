package tetpekker.cars;

import java.util.Scanner;

public class Car {

    public static int distance;
    public void start(){
        System.out.println("Let's go!");
    }

    public void stop(){
        System.out.println("Let's have a break...");
    }

    public int drive(int howLong){

        distance = howLong*60;
        System.out.println("drive to the " + distance + " distance");
        return distance;
    }
}
