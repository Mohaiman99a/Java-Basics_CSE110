//3
import java.util.Scanner;
public class Task3{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    while(true){
      System.out.println("Enter Number: ");
      int a=sc.nextInt();
      if(a<0){
        break;
      }
      else{
        int b=a*a;
        System.out.println(a +" ^ 2 = " + b);
      }
      
    }
  }
}
