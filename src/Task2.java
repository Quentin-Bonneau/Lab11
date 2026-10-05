import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Hello Quentin!");

            System.out.print("Play again (yes/no)? ");
            answer = scan.nextLine();

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing.");
    }
}