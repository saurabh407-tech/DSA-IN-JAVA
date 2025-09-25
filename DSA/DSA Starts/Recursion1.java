
// Recursion in Java

//From Recursion to print numbers from n to 1

import java.util.*;
public class Recursion1 {
    public static void printNum(int n){
        if(n==0){
        return;
    }

         System.out.println(n);
         printNum(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
       int n=sc.nextInt();
        printNum(n);

    }
}


// Print numbers from 1 to n from Recursion

/*  import java.util.*;
public class Recursion1{
    public static void printNumb(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printNumb(n);
    }
}


//Print Sum of n natural numbers by Recursion


import java.util.*;
public class Recursion1{
    public static void printSum(int i,int n,int sum){
        if(i==n){
        sum+=i;
        System.out.println(sum);
        return;
        }
        
         sum+=i;
         printSum(i+1,n,sum);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int n=sc.nextInt();
        System.out.println("enter the starting number: ");
        int i=sc.nextInt();
        printSum(i,n,0);

    }

}


// Factorial of any number n...

import java.util.*;

public class Recursion1{
    public static void calculateFact(int n,int fact){
        if(n==1){
          fact*=n;
          System.out.println("Factorial is:"+fact);
          return;
        }
        fact*=n;
       calculateFact(n-1,fact); 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whoes factorial you want to print: ");
        int n=sc.nextInt();
          calculateFact(n,1);
    }
}


//Program to print Fabonacci series by Recursion..

import java.util.*;

public class Recursion1{
    public static void printFabonacci(int a,int b,int n){
        {
          if(n==0){
            return;
          }
        }
       int c=a+b;
       System.out.print(c+" ");
       printFabonacci(b,c,n-1);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        printFabonacci(0,1,n-2);
    }
}

//Fibonacci series simple program

import java.util.*;
public class Recursion1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for( int i=0; i<n-2; i++){
        int c=a+b;
         a=b;
         b=c;
         System.out.print(c+ " ");
        }


    }
}



// Print the power of x as n (Stack height n);

import java.util.*;

public class Recursion1{
  public static int calcPower(int x,int n){
    if(n==0){
      return 1;     //base case 1
    }
    if(x==0){
      return 0;     //base case 2
    }
    int xPownm1=calcPower(x,n-1);
    int xPown=x*xPownm1;
    return xPown; 
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    int x=sc.nextInt();
    System.out.println("enter the value of n:");
    int n=sc.nextInt();
    int ans=calcPower(x,n);
    System.out.println("Power of x of n is :"+ans);
    
  }

}


// Que) print the x ki power n...(Stack height= log n)

import java.util.*;

public class Recursion1{
  public static int calcPower(int x,int n){
    if(n==0){
      return 1;     //base case 1
    }
    if(x==0){
      return 0;     //base case 2
    }
    if(n%2==0){
      return calcPower(x,n/2)*calcPower(x,n/2);

    }
    else{
      return calcPower(x,n/2)*calcPower(x,n/2)*x;
    }

  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    int x=sc.nextInt();
    System.out.println("enter the value of n:");
    int n=sc.nextInt();
    int ans=calcPower(x,n);
    System.out.println("Power of x of n is :"+ans);
  }
}
          */

