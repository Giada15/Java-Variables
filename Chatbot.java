import java.util.Scanner;

/**
 * Chatbot
 */
public class Chatbot {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();

        System.out.println("\nHi "+name+"! Where are you from?");
        String city = scanner.nextLine();

        System.out.println("\nI hear it's beautiful at "+city+"! I'm from a place called Oracle! How old are you?");
        int age = scanner.nextInt();

        System.out.println("\nSo you're "+age+", cool! I'm 400 years old.\nThis means I'm "+(400/age)+" times older than you.\nEnough about me. What's your faourite langague? (just don't say Python)");
        scanner.nextLine();
        String language = scanner.nextLine();

        System.out.println(language+ ", that's great! Nice chatting with you "+name+". I have to log off now. See ya!");


    }
    
}