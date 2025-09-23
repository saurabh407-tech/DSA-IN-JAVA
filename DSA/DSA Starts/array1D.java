// Array 1D with questions

import java.util.*;

public class array1D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int  size=sc.nextInt();
        int marks[] = new int[size];
         System.out.println("Enter the elements of the array");
         for(int i=0; i<size; i++)
         {
             marks[i]=sc.nextInt();
         }
         System.out.println("The Array elements are: ");
        for(int j=0; j<size; j++)
        {
            System.out.println(marks[j]);
        }
       
    }
    
    }



// Que) Take an array as an input from the user.Search for the given number of x and print tha address of x...
  
/*  import java.util.*;

 public class array1D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to search");
        int x=sc.nextInt();
        for(int j=0; j<size; j++){
            if(arr[j]==x){
                System.out.println("The index of x is: "+j);
            }
        }
    }
 }


// Que2) Take an array of names as input from the user and print them on the screen.

import java.util.*;

public class array1D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        String name[]=new String[size];
        System.out.println("Enter the names as the array elements: ");
        for(int i=0; i<size; i++){
             name[i]=sc.next();
        }
        System.out.println("Names are : ");
        for(int j=0; j<size; j++){
            System.out.println(name[j]);
        }

    }
}

// Que3) Find the maximum & minimum number in an array of integers..

import java.util.*;

public class array1D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
           arr1[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int j=0; j<size; j++){
            if(arr1[j]>max){
                max=arr1[j];
            }
        }
        System.out.println("Maximum element of the array is: "+max);

        for(int j=0; j<size; j++){
            if(arr1[j]<min){
                min=arr1[j];
            }
        }
        System.out.println("The Minimum element of the array is : "+min);
    }
}


// Que4)Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.*;
public class array1D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
           arr1[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0; i<size-1; i++){
            if(arr1[i]>arr1[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("The array is in the ascending order");
        }
        else{
            System.out.println("The array is not in the ascending order");
        }
    }
}
    */