package tetpekker.pets;

public class Pet {

   int age;
   float weight;
   float height;
   String color;

   public static void sleep(){
       System.out.println("Good night! See you tomorrow...");
   }

   public static void eat(){
       System.out.println("I'm hungry... let's snack cheeps:)");
   }

   public String say(String aWord){
       String petResponse = "Ah okay!! " + aWord;
       return petResponse;
   }
}
