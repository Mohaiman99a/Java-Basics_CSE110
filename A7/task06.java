//6
import java.util.Arrays;
import java.util.Scanner;

public class Task6{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter the length of the array: ");
    int length=sc.nextInt();
    double[] arr1= new double[length];
    
    for(int i=0; i<length; i++){
      System.out.println("Enter a number: ");
      arr1[i]=sc.nextDouble();
    }
    
    double max=arr1[0];
    int max_indx=0;
    
    double min=arr1[0];
    int min_indx=0;
    
    double sum=0.0;
    double average=0.0;
    
    
    
    for(int s=0;s<length; s+=1){
      
      if(arr1[s]>max){
        max_indx=s;
        max=arr1[s];
      }
      
      
      if(arr1[s]<min){
        min=arr1[s];
        min_indx=s;
      }
      
      
      sum=sum+arr1[s];
    
    }
    
    average=(sum/length);
    
    
    System.out.println("Maximum element " + max + " found at index " + max_indx);
    System.out.println("Minimum element " + min + " found at index " + min_indx);
    System.out.println("Summation: " + sum);
    System.out.println("Average: " + average);
    
    
  }
}
