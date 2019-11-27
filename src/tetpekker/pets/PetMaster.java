package tetpekker.pets;

import tetpekker.pets.Pet;

public class PetMaster {

    public static void main(String[] args){

        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Cheek! Chereek!");
        System.out.println(petReaction);
        myPet.sleep();
    }
}
