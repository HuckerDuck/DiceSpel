import java.util.Random;

public class Dice {
    //Skapa en random klass och metod

    private Random random;

    private int player1dice;
    private int player1dice2;

    private int player2dice;
    private int player2dice2;

    public void rollPlayer1(){
        player1dice = diceRoll();
        player1dice2 = diceRoll();
    }

    public void rollPlayer2(){
        player2dice = diceRoll();
        player2dice2 = diceRoll();
    }

    public int player1TotalScore(){
        int sum = 0;
        sum += player1dice;
        sum += player1dice2;
        return sum;
    }

    public int player2TotalScore(){
        int sum = 0;
        sum += player2dice;
        sum += player2dice2;
        return sum;
    }

    public int getPlayer1dice() {
        return player1dice;}

    public int getPlayer1dice2() {
        return player1dice2;
    }
    public int getPlayer2dice() {
        return player2dice;}

    public int getPlayer2dice2() {
        return player2dice2;
    }

    public Dice() {
        random = new Random();
    }

    //Rullar en slumpmässig siffra mellan 1-6
    public int diceRoll(){
        int roll = random.nextInt(6) + 1;
        return roll;
    }
}
