//5
import java.util.Scanner;
public class Task5{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int non_neg=0;
    int neg=0;
    int n=1;
    int a=0;
    
    System.out.println("Enter an integer: ");
    int p=sc.nextInt();
    
    for(n=1; n<=p; n+=1){
      System.out.println("Enter number " + n + ": ");
      a=sc.nextInt();
      
      if(a>=0){
        non_neg+=1;
      }
      else{
        neg+=1;
    }
  }
    
    System.out.println(non_neg + " Non-negative Numbers");
    System.out.println(neg + " Negative Numbers");
  }
}
