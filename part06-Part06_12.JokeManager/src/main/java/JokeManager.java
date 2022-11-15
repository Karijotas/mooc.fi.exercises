
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mantas
 */
public class JokeManager {

    private ArrayList<String> jokes = new ArrayList<>();

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());

            return jokes.get(index);

        }
    }

    public void printJokes() {
        for (String element : jokes) {
            System.out.println(element);
        }
    }

}
