package task2;
import java.util.*;
public class alphabet {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String ch = scanner.next();

        if (ch.length() != 1 || !Character.isLetter(ch.charAt(0))) {
            System.out.println("Please enter a single alphabet character.");
        } else {
            char c = Character.toLowerCase(ch.charAt(0));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                System.out.println(ch + " is a vowel");
            else
                System.out.println(ch + " is a consonant");
        }

        scanner.close();
    }
}
