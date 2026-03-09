//Task 6
import java.util.Scanner;
public class Task6{
  public static void main( String[] args){
    Scanner sc= new Scanner(System.in);
    
    
    System.out.print("Height= ");
    int h=sc.nextInt();
    
    
    for(int i=1; i<=h; i++){
      
      
      for(int j=1; j<=(h-i); j++){
        System.out.print(" ");
         }

      
        for(int q=1; q<=i; q++){
          System.out.print(q);
        }
        
        System.out.println();
    }
  }
}

