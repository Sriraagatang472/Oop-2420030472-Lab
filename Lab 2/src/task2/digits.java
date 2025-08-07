package task2;
import java.util.*;
public class digits{
public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter number:");
	int number=scanner.nextInt();
		
	int sum=0;
	int temp=number;
	
	while(temp!=0) {
		int digit=temp%10;
		sum+=digit;
		temp/=10;
		
	}
	System.out.print(sum);
}
}