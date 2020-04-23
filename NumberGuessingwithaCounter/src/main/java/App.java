import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("I have chosen a number between 1 and 10.  Try to guess it.\n");
        System.out.print("Your guess: ");

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int userInput = scan.nextInt();

        int randomNumber = 1 + rand.nextInt(10);

        int tries = 0;

        while (userInput != randomNumber){

            System.out.println("That is incorrect.  Guess again.");
            userInput = scan.nextInt();
            tries++;
        }

        System.out.println(tries);


    }

}
