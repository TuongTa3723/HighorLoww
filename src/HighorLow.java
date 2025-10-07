import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        int secret = gen.nextInt(10) + 1; // 1..10
        int guess = 0;
        boolean ok = false;
        String trash;

        do {
            System.out.print("Guess a number from 1 to 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    ok = true;
                } else {
                    System.out.println("Your guess must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!ok);

        System.out.println("Secret was: " + secret);
        if (guess < secret) {
            System.out.println("Your guess was LOW.");
        } else if (guess > secret) {
            System.out.println("Your guess was HIGH.");
        } else {
            System.out.println("On the money!");
        }
    }
}