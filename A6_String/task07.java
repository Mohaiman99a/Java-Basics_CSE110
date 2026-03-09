//7
import java.util.Scanner;
public class Task7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String a=sc.nextLine();
    String b=sc.nextLine();
    String temp= "";
    boolean flag= false;
    String temp_2="";
    
    
    //Checking first input
    for(int i=0; i<a.length(); i++){
      
      for(int j= 0; j<b.length(); j++){
        if(a.charAt(i)==b.charAt(j)){
          flag  =  true;
        }
      }          //end string r shob element r shathe compare tai shesh korbo
      
           if(flag  ==   false){
             temp=temp+a.charAt(i);
           }
           flag=false;
           }
    
    
    //Checking second input
     for(int p=0; p<b.length(); p++){
       
      for(int q= 0; q<a.length(); q++){
        if(b.charAt(p)==a.charAt(q)){
          flag  =  true;
        }
      }
      
           if(flag  ==   false){
             temp=temp+b.charAt(p);
           }
           flag=false;
           }   
    
     
     //Upper case transformation
     int m=0;
      while(m<= (temp.length() -1)){
        char up_case= (char)(temp.charAt(m)-32);
         temp_2= temp_2 +up_case;
         m++;
   }
      
    System.out.println(temp_2); 
  }
}
