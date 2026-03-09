//3a
import java.util.Arrays;
import java.util.Scanner;

public class Task3a{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the length of the array: ");
    int n=sc.nextInt();
    int[] arr1=new int[n];
    int leng=arr1.length;
    
    for(int s=0; s<leng; s++){    
      System.out.println("Enter a number: ");
      int element=sc.nextInt();
      arr1[s]=element;
    }
    
       
  //using new array
    int[] newArr= new int[n];
    int last_indx=n-1;   //Arekta array banaile
    
    for(int i=0; i<n;i++){
      newArr[last_indx]=arr1[i];
      last_indx--;
    }
    
    System.out.println("Reversed using a new array: ");
    for(int k=0; k<arr1.length; k++){
      System.out.print(newArr[k] + " ");
    }   
    
  }
}








//3b
import java.util.Arrays;
import java.util.Scanner;

public class Task3b{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the length of the array: ");
    int n=sc.nextInt();
    int[] arr1=new int[n];
    int leng=arr1.length;
    
    for(int s=0; s<leng; s++){    
      System.out.println("Enter a number: ");
      int element=sc.nextInt();
      arr1[s]=element;
    }
    
    
    
    int i=0, j=leng-1, temp; //Index r value nibo i and j teh
    
    while(i<j){
      temp=arr1[i];
      arr1[i]= arr1[j];
      arr1[j]=temp;
      i=i+1;
      j=j-1;
    }
  
   
    
System.out.println("Reversed the original array: ");
    for(int k=0; k<arr1.length; k++){
      System.out.print(arr1[k] + " ");
    }   
    
  }
}
