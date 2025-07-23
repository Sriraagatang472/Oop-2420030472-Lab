import java.util.*;
public class studentinfo {
public static void main(String args[]){
String Name;
int StudentId;
int Age;
int Grade;
System.out.println("Enter name:");
Scanner sc= new Scanner(System.in);
Name= sc.next();
System.out.println("Enter ID:");
StudentId= sc.nextInt();
System.out.println("Enter Age:");
Age= sc.nextInt();
System.out.println("Enter Grade:");
Grade= sc.nextInt();

System.out.println("---Student details---");
System.out.println("Name :"+Name);
System.out.println("Student ID:"+StudentId);
System.out.println("Age:"+Age);
System.out.println("Grade:"+Grade);
}
}
