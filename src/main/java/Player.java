import java.util.Scanner;

public class Player {

    //Attribut på allt som kommer att användas

    private String name;

    public Player(Scanner scanner){
        System.out.println("Ange namn: ");
        name = scanner.next();
    }

    //Getter och setter för allt

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
