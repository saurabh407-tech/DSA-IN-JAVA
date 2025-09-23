//Array 2D with questions

import java.util.*;
public class array2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the number of the colums");
        int colums=sc.nextInt();
        int arr[][]=new int[rows][colums];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the 2D array are: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
    }
}
}


// Que1) Take a matrix as input from the user.Search for the given number x and print the indice at which it occurs...

/* 

import java.util.*;

public class array2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of colums:");
        int colums=sc.nextInt();
        int arr[][]=new int[rows][colums];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element which want to search:");
        int x=sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
             if(arr[i][j]==x){
                System.out.println("The index of the x is row & column is: "+(i+","+j));
             }
            }
        }
    }
}




// Que2) For a given matrix of N x M, print its transpose..


 import java.util.*;

public class array2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of colums:");
        int colums=sc.nextInt();
        int arr[][]=new int[rows][colums];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Let's print the Transpose of the matrix");

        for(int i=0; i<colums; i++){
            for(int j=0; j<rows; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}

*/




