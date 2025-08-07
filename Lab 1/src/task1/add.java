package task1;
import java.util.*;
public class add {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("morningShiftEarnings :");
		int morningShiftEarnings =sc.nextInt();
		System.out.print("eveningShiftEarnings:");
		int eveningShiftEarnings=sc.nextInt();
		int c=morningShiftEarnings+eveningShiftEarnings;
		System.out.println("totalDailyEarnings:" +c);
}
}


