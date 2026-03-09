 //9
 import java.util.Scanner;
  public class Task9{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter payment: ");
      int payment=sc.nextInt();
      
      System.out.println("Enter age: ");
      int age=sc.nextInt();
      
      if(payment<10000 && age>=18) {
       System.out.println("Your tax amounts in 0 Tk"); 
      }
      
      else if(payment>=10000 && payment<=20000 && age>=18){
        double y= 0.05*payment;
        System.out.println("Your tax amounts in " + y + "Tk"); 
      }
      
       else if(payment>=20000 && age>=18){
        double y= 0.1*payment;
        System.out.println("Your tax amounts in " + y + "Tk"); 
      }
       
       else if(age<18) {
       System.out.println("Your tax amounts in 0 Tk"); 
      }
       
   }
}
