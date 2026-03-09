//1
import java.util.Scanner;
public class Task1{
  public static void main(String[] args){
   
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter first number:");
  int n1=sc.nextInt();
  System.out.println(n1);
  
  System.out.println("Enter second number:");
  int n2=sc.nextInt();
  System.out.println(n2);
  
  System.out.println("Enter third number:");
  int n3=sc.nextInt();
  System.out.println(n3);
  
  int n_max;
  if(n1>n2){
    n_max=n1;
   }
  else{
    n_max=n2;
   }
  
  if(n3>n_max){
    n_max=n3;
   }
  System.out.println("largest number:" +n_max);
  
  } 
}
