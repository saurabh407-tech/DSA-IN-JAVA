// All Sorting methods of java

// Bubble sort 

import java.util.*;
public class sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        for(int j=size-1;j>0; j--){
             for(int i=0;i<j; i++){
            if(arr[i]>arr[i+1]){
               int temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
            }
        }
    }
    System.out.println("THe Sorted array are:");
    for(int i=0; i<size; i++){
        System.out.print(arr[i]+" ");
        
    }
    }
    
}

// Selection Sort 

/* 
import java.util.*;
public class sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size-1; i++){
            int smallest=i;
            for(int j=i+1; j<size; j++){
                if(arr[smallest]>arr[j]){
                  smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    System.out.println("THe Sorted array are:");
    for(int i=0; i<size; i++){
        System.out.print(arr[i]+" ");
    }
}
    }




// Insertion sort..


import java.util.*;
public class sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       System.out.println("THe Sorted array are:");
    for(int i=0; i<size; i++){
         System.out.print(arr[i]+" "); 
    }
}
}
  */
    
    



