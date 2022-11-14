
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
    
    private TodoList list;
    private Scanner scanner = new Scanner(System.in);
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String toadd = scanner.nextLine();
                list.add(toadd);
                continue;
            }
            if (command.equals("list")) {
                list.print();
                continue;
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                String removed = scanner.nextLine();
                list.remove(Integer.valueOf(removed));
            }
            
        }
    }
    
}
