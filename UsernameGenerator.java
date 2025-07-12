UsernameGenerator.java
import java.util.Scanner;
import java.util.Random;

public class UsernameGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine().toLowerCase();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine().toLowerCase();

        int number = rand.nextInt(1000);

        String username = firstName.charAt(0) + lastName + number;

        System.out.println("Your generated username is: " + username);
    }
}

