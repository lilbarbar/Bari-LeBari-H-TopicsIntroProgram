
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Tester {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String option;

        do {
            System.out.println("Would you like to fill out your superhero's information? Type yes or no ");
            option = keyboard.nextLine();
        } while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no"));

        Hero hero;

        if (option.equalsIgnoreCase("yes")) {
            String heroName, heroPower;
            int heroAge;
            System.out.print("Enter your hero's name: ");
            heroName = keyboard.nextLine();
            System.out.print("Enter your hero's power: ");
            heroPower = keyboard.nextLine();
            try {
                System.out.print("Enter your hero's age: ");
                heroAge = keyboard.nextInt();
            } catch (Exception e) {
                System.out.println("\n\n");
                System.out.println(e);
                System.out.println("\n\n");
                heroAge = 20;
            }

            hero = new Hero(heroName, heroPower, heroAge);
        } else {
            hero = new Hero();
        }

        System.out.println(hero);

    }
}
