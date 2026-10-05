import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a whole number: ");

        while (!scan.hasNextInt()) {
            System.out.println("Error: Please enter a whole number.");
            scan.next();

            System.out.print("Enter a whole number: ");
        }

        int number = scan.nextInt();

        System.out.println("You entered: " + number);
    }
}