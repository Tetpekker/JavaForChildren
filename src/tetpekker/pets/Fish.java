package tetpekker.pets;

public class Fish extends Pet {

    public static int currentDepth = 0;
    public int dive (int howDeep){
        currentDepth = currentDepth+howDeep;
        System.out.println("Diving to " + howDeep + " meters");
        System.out.println("I'm on the " + currentDepth + " meters depth");
        return currentDepth;
    }

    public String say(String smth){

        return "Don't you know fish does not speak?";
    }

}
