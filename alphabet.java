import java.util.*;
public class alphabet {
public static void main(String args[]) {
	Scanner scanner =new Scanner(System.in);
System.out.print("Enter charecter:");
char ch;
ch = scanner.next();
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
    System.out.println(ch + " is vowel");
else
    System.out.println(ch + " is consonant");

}
}
