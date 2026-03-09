//10
import java.util.Scanner;
public class Task10{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number: ");
    int n=sc.nextInt();
    int p=n;
    int a;
    int counter=0;
    
    while(p!=0){
        p=p/10;
        counter=counter+1;
      }
    
    int x=counter*10;

    while(true){
      if(n!=0){
        a= n/x;
        n=n%x;
        x=x/10;
        System.out.println(n + ", ");
        continue;
      }
      
      else{
        break;
      }
    }
  }
}
