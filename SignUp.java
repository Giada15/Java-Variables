import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();

        System.out.println("\nWhat is your last name?");
        scanner.nextLine();
        String lastName = scanner.nextLine();

        System.out.println("\nHow old are you?");
        scanner.nextLine();
        String age = scanner.nextLine();

        System.out.println("\nMake a username");
        scanner.nextLine();
        String username = scanner.nextLine();

        System.err.println("\nWhat city do you live in?");
        scanner.nextLine(); 
        String city = scanner.nextLine();


        System.err.println("\nWhat country is that?");
        scanner.nextLine();
        String country = scanner.nextLine(); 
        
}
}
