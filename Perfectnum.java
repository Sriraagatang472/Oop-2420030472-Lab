import java.util.*;
public class Perfectnum {
public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter num to check:");
		int number= scanner.nextInt();
		int sumofdivisors=0;
		for (int i=1;i<=number/2;i++) {
			if(number%i==0) {
				sumofdivisors= sumofdivisors+i;
			}
		}
		if(sumofdivisors==number) {
			System.out.print("Perfect number");
		}
		else {
			System.out.print("Not a Perfect number");
			}
}
}
