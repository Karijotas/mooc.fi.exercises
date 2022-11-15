
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mantas
 */
public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private JokeManager joker = new JokeManager();

    public UserInterface(JokeManager joker, Scanner scanner) {
        this.scanner = scanner;
        this.joker = joker;
    }

    public void start() {
        System.out.println("Commands:");
        while (true) {

            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }else if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                joker.addJoke(joke);
                continue;
            }else if (command.equals("2")) {
                System.out.println(joker.drawJoke());
                continue;

            }else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                joker.printJokes();
                continue;
            }
        }
    }

}
