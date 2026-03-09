//11
import java.util.Scanner;
public class Task10{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter first side: ");
  int s1 = sc.nextInt();
  System.out.println("Enter second side: ");
  int s2 = sc.nextInt();
  System.out.println("Enter third side: ");
  int s3 = sc.nextInt();
  
  if(s1==s2 && s2==s3){
    System.out.println("This is a Equilateral triangle");
  }
  
  else if(s1==s2 || s2==s3 || s1==s3){
    System.out.println("This is a Isosceles triangle");
  }
  
  else{
    System.out.println("This is a Scalene triangle");
   }
  }
}
