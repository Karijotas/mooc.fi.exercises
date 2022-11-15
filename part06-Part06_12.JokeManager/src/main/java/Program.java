
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        manager.addJoke("Just joking 1");
        manager.addJoke("Just joking 2");
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
