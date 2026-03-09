//Task 3
import java.util.Scanner;
public class Task3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String s1=sc.nextLine();
    String s2= sc.next();
    char ch= s2.charAt(0);
    String temp="";
    
    for(int i=0; i<s1.length(); i++){
      char a=s1.charAt(i);
      
//Double equal 
      if(a==ch){
        System.out.println(temp);
        temp="";
      }
      
      else{
        temp=temp+a;
      }
    }
    System.out.println(temp);
  }
}
