//8
  import java.util.Scanner;
  public class Task8{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter student id: ");
      int student_id=sc.nextInt();
      
      int year= student_id/1000000;
      int s1= student_id/100000;
      int session= s1%10;
      
      if(session==1){
        System.out.println("Student Joined BRAC in Spring "+ year);
      }
      
      else if(session==3){
        System.out.println("Student Joined BRAC in Summer "+ year);
      }
      
      else if(session==2){
        System.out.println("Student Joined BRAC in Fall "+ year);
      }
      
    }
  }
