
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
public class TextUI {

    private Scanner scanner = new Scanner(System.in);
    private SimpleDictionary dictionary = new SimpleDictionary();

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String searchedFor = scanner.nextLine();
                if (dictionary.translate(searchedFor) != null) {
                    System.out.println("Translation: " + dictionary.translate(searchedFor));

                } else {
                    System.out.println("Word " + searchedFor + " was not found");
                }
            } else {
                System.out.println("Unknown command");
                continue;
            }

        }
    }
}
