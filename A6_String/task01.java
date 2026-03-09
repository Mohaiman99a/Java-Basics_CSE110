//Task 1
import java.util.Scanner;
public class Task1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter input: ");
    String low_case= sc.nextLine();
    int len= low_case.length();
    String temp= "";
    
    for(int i=0; i< len; i++){
      
      char a= low_case.charAt(i);
      
      if(a>='a' && a<='z'){
        char up_case= (char)(a-32);
        temp= temp +up_case;
      }
      else{
        temp= temp +a;
      }
      
    }
    
    System.out.println(temp);
    
  }
}
