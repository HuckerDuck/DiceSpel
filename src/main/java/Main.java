import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Skapa en scanner

        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();

        //Skapa spelare och lägg till en scanner

        Player player1 = new Player(scanner);
        Player player2 = new Player(scanner);

        //Rulla tärningar

        dice.rollPlayer1();
        dice.rollPlayer2();

        //Hämtar ut namn och tärning

        System.out.println();
        System.out.println(player1.getName() + " rullade: " + dice.getPlayer1dice());
        System.out.println(player1.getName() + " rullade: " + dice.getPlayer1dice2());

        System.out.println();

        System.out.println(player2.getName() + " rullade: " + dice.getPlayer2dice());
        System.out.println(player2.getName() + " rullade: " + dice.getPlayer2dice2());

        //Visa totalen för de både

        System.out.println();
        System.out.println(player1.getName() + " poäng: " + dice.player1TotalScore());
        System.out.println(player2.getName() + " poäng: " + dice.player2TotalScore());
        System.out.println();

        //If-sats

        if(dice.player1TotalScore() > dice.player2TotalScore()) {
            System.out.println("Spelare " + player1.getName() + " " + "Vann!!");
            System.out.println("Spelare " + player1.getName() + " " + "Vann!!");
            System.out.println("Spelare " + player1.getName() + " " + "Vann!!");
        }
        else if(dice.player1TotalScore() < dice.player2TotalScore()) {
            System.out.println("Spelare: " + player2.getName() + " " + "Vann!!");
            System.out.println("Spelare: " + player2.getName() + " " + "Vann!!");
            System.out.println("Spelare: " + player2.getName() + " " + "Vann!!");
        }else {
            System.out.println("Det blev oavgjort");

        }

        scanner.close();
    }
}
