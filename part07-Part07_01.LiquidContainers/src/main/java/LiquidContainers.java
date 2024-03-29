
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("first: " + first + "/100");
            System.out.println("second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                }
                if (amount + first > 100) {
                    first = 100;
                }
                if (amount + first < 100) {
                    first += amount;
                }
                continue;
            }
            if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                }
                if (amount > first) {
                    second += first;
                    first = 0;
                } else if (amount + second < 100) {
                    second += amount;
                    first -= amount;
                } else if (amount + second > 100) {
                    second = 100;
                    first = 0;
                }
                continue;
            }
            if (command.equals("remove")) {
                if (amount > second) {
                    second = 0;
                } else {
                    second -= amount;
                }

            }
        }
    }
}
