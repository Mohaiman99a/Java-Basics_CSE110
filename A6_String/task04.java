//Task 4
import java.util.Scanner;
public class Task4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String s1=sc.nextLine();
    int len= s1.length();
    int index=len-1;
    String temp="";
    
    for(int i=index; i>=0; i--){
      char a=s1.charAt(i);
      temp=temp+a;
    }
    
    System.out.print(temp);
  }
}
