import java.util.*;

public class sphere {
public static void main(String args[]){
int r;
float pi = 3.14f;
double vol;
System.out.println("Enter value of r:");
Scanner sc= new Scanner(System.in);
r=sc.nextInt();
vol=4/3*pi*r*r;
System.out.println("VOLUME ="+vol);
}
}