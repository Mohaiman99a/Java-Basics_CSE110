//9
import java.util.Scanner;
public class Task8{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number: ");
    int n=sc.nextInt();
    int counter=0;
    
    while(n!=0){
        n=n/10;
        counter=counter+1;
      }
      
    System.out.println("Total digits = " + counter);
  }
}
