import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Skapa en scanner

        Scanner scanner = new Scanner(System.in);

        //Skapa en tärning

        Dice dice = new Dice();

        //Skapa spelare och lägg till en scanner

        Player player1 = new Player(scanner);
        Player player2 = new Player(scanner);

        //Rulla tärningar

        dice.rollPlayer1();
        dice.rollPlayer2();

        //Hämtar ut namn och tärning

        System.out.println(player1.getName() + " rullade: " + dice.getPlayer1dice());
        System.out.println(player2.getName() + " rullade: " + dice.getPlayer2dice());

        //If-sats

        if(dice.getPlayer1dice() > dice.getPlayer2dice()) {
            System.out.println("Spelare " + player1.getName() + " Vann!!");
        }
        else if(dice.getPlayer1dice() < dice.getPlayer2dice()) {
            System.out.println("Spelare: " + player2.getName() + "Vann!!");
        }else {
            System.out.println("Det blev oavgjort");
        }
    }
}
