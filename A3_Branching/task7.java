//7
  import java.util.Scanner;
  public class Task7{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter number: ");
      int x=sc.nextInt();
      
      if(x<0){
        int y=2*x;
       System.out.println("output: " + y); 
      }
      
      else if(x>=0 && x<2){
       int  y=x+1;
       System.out.println("output: " + y); 
      }
      
      else if(x>=2 && x<5){
       int  y=(x*x)-1;
       System.out.println("output: " + y); 
      }
      
      else if(x>=5){
       int  y=3*(x*x)+2;
       System.out.println("output: " + y); 
      }
      
    }
  }
