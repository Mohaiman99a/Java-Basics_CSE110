//7   

import java.util.Arrays;
import java.util.Scanner;

public class Task7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    int arr1 [] = {23,100,23,56,100};
    int len=arr1.length;
    
    
    //1st array
      System.out.println("Input array: ");
      for(int k=0; k<arr1.length; k++){
        System.out.print(arr1[k] + " ");
      }   
     



    //Replace with zero → Find size of array
    int count=0;
    for(int i=0; i<len; i++){
      for(int j=i+1; j<len; j++){
        if(arr1[i] == arr1[j]){
          arr1[j]=0;
        }
      }
    }
      
      for(int k=0; k<len; k++){
        if(arr1[k]!=0){
          count++;
        }
      }




      int[] arr3=new int[count];
      int indx=0;
      
      for(int s=0; s<arr1.length; s++){    
        if(arr1[s]!=0){
          arr3[indx]=arr1[s];
          indx+=1;
        }
      }
      
      System.out.println(" ");
      System.out.println("New array: ");
      for(int k=0; k<arr3.length; k++){
        System.out.print(arr3[k] + " ");
      }  
      
      
      
      //2nd array
      
      int arr2 [] = {-5,10,-7,-5};
      int count2=0;
      
      System.out.println(" ");
      System.out.println("Input array: ");
      for(int a=0; a<arr2.length; a++){
        System.out.print(arr2[a] + " ");
      }   
     
    
    for(int b=0; b<arr2.length; b++){
      for(int c=b+1; c<arr2.length; c++){
        if(arr2[b] == arr2[c]){
          arr2[c]=0;
        }
      }
    }
      
      for(int d=0; d<arr2.length; d++){
        if(arr2[d]!=0){
          count2++;
        }
      }

      int[] arr4=new int[count2];
      int indx2=0;
      
      for(int r=0; r<arr2.length; r++){    
        if(arr2[r]!=0){
          arr4[indx2]=arr2[r];
          indx2+=1;
        }
      }
      
      System.out.println(" ");
      System.out.println("New array: ");
      for(int z=0; z<arr4.length; z++){
        System.out.print(arr4[z] + " ");
      }  
    }
  }
