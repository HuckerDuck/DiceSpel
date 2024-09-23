import java.util.Random;

public class Dice {
    //Skapa en random klass och metod

    private Random random;
    private int player1dice;
    private int player2dice;

    public void rollPlayer1(){player1dice = diceRoll();}
    public void rollPlayer2(){player2dice = diceRoll();}
    public int getPlayer1dice() {return player1dice;}
    public int getPlayer2dice() {return player2dice;}

    public Dice() {
        random = new Random();
    }

    //Rullar en slumpmässig siffra mellan 1-6
    public int diceRoll(){
        int roll = random.nextInt(6) + 1;
        return roll;
    }
}
