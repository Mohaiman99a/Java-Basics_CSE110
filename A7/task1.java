//Task 1a
import java.util.Arrays;
import java.util.Scanner;

public class Task1a{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("N = ");
    int n=sc.nextInt();
    int[] arr1=new int[n];
    
    for(int i=0; i<n; i++){
      
      System.out.println("Enter a number: ");
      int element=sc.nextInt();
      arr1[i]=element;
      
      
    }
    
    System.out.println("The elements of the array are: ");
    
    for(int j=0; j<arr1.length; j++){
      System.out.println(j+ ": "+ arr1[j]);
    }
    
  }
}











//1b
import java.util.Arrays;
import java.util.Scanner;
public class Task1b{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("N = ");
    int size=sc.nextInt();
    int[] arr1=new int[size];
    
    for(int i=0; i<size; i++){
      
      System.out.println("Enter a number: ");
      int element=sc.nextInt();
      arr1[i]=element;
    }

    
    
    int[] arr2= new int[size+1];
    System.out.println("Enter another number: ");
    int b= sc.nextInt();
    arr2[size] = b;
    
    for(int i=0; i<size; i++){
      arr2[i] = arr1[i];  //bracket r bahire thakle ekta equal sign
    }
    
    
    System.out.println("The elements of the array are: ");
    for(int j=0; j<arr1.length; j++){
      System.out.println(j+ ": "+ arr1[j]);
    }
    
    System.out.println("After resizing the array: ");
    for(int k=0; k<arr2.length; k++){
      System.out.print(arr2[k] + " ");
    }
    
    
  }
}
