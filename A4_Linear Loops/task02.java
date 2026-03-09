//2
import java.util.Scanner;
public class Task2{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    int sum=0;
    double avg= sum/n;

    System.out.print("Enter N= ");
    int n=sc.nextInt();
    
    for(int start=1; start<=n;start+=1){
      sum=sum+start;
    }
    
    System.out.println("The sum of "+ n + " no is: " + sum);
    System.out.println("The Average is: " + avg);
    
  }
}
