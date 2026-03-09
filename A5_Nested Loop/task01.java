//Task 1
import java.util.Scanner;
public class Task1{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Number of prime no: ");
    int n=sc.nextInt();
    int start=1;
    
    
    for(int a=1;a<=n; a++){
      counter=0;
      
     
      for(int i=1; i<=start;  i++){
        if(start%i==0){
          counter=counter+1;
        }
      }
      
      if(counter==2){
        System.out.println(start);
      }
      
      start++;
      
    }
  }
}
