package academy.learnprogramming.jokeapp;

import academy.learnprogramming.jokeserver.JokeServer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ServiceLoader;


public class Main {

	public static void main(String [] args) {
        Map<String, JokeServer> servers = new HashMap<>();

        ServiceLoader<JokeServer> loader = ServiceLoader.load(JokeServer.class);

        int key = 1;
        for (JokeServer server : loader) {
            servers.put(String.valueOf(key++), server);
        }

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {

            System.out.print("\n(Q to quit) : ");
            choice = scanner.nextLine().trim().toUpperCase();

            if (servers.containsKey(choice)) {
                System.out.println(servers.get(choice).getJoke());
            } else if (!choice.equals("Q")) {
                System.out.println("Sorry, try again");
            }
        } while (!choice.equals("Q"));

        System.out.println("Thanks! I hope you laughed!!");

    }
}