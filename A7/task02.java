//2
import java.util.Arrays;
import java.util.Scanner;
public class Task2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr [] = {9, -5, 7, 9, -5, 5, 7};
    int len=arr.length;
    
    System.out.println("Before removing duplicates:");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    
    System.out.println();
    
    for(int j=0; j<len; j++){
      for(int match=j+1; match<len; match++){   //Min Max 1 loop. Compare elements of same array 2 loop 🥲
        if(arr[j] == arr[match]){
          arr[match]=0;
        }
      }    
      
    }
    
    
    System.out.println("After replacing duplicates with 0:");
    for(int k=0; k<arr.length; k++){
      System.out.print(arr[k]+" ");
    }
    
  }
}
