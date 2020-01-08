package tetpekker.lessonTwo;

public class Players {

    public static String[] players = new String[4];

    public static int totalPlayers = players.length;

    public static void main(String[] args) {

        players[0] = "David";
        players[1] = "Daniel";
        players[2] = "Anna";
        players[3] = "Gregory";

        System.out.println("Total quantity of lessonTwo is " + totalPlayers);
        congratPlayer1();
        congratPlayer2();

    }

    public static void congratPlayer1(){
        int counter;

        for(counter = 0; counter < totalPlayers; counter++){
            String thePlayer = players[counter];
            System.out.println("Congrats, " + thePlayer + "!");
        }

    }

    public static void congratPlayer2() {

        int counter = 0;

        while (counter < totalPlayers) {
            String thePlayer = players[counter];
            System.out.println("Congrats, " + thePlayer + "!");
            counter++;
        }
    }

}
