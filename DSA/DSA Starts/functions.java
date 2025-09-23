/* import java.util.*;
 
public class functions{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();

        printMyName(name);
    }
} 


//  Que1) Make a function to add 2 numbers and return the sum.. 

import java.util.*;

public class functions{

public static int calculateSum(int a,int b){
    int Sum=a+b;
    return Sum;
}
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();

    int Sum=calculateSum(a,b);

    System.out.println("Sum of the numbers is: "+Sum);
 }
}


//  Que2) Make a function to multiply 2 numbers and return the product...


import java.util.*;

public class functions{
    public static int calculateProduct(int a,int b){
     int product=a*b;
     return product;
}
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number: ");
      int a=sc.nextInt();
      System.out.println("Enter the second number:");
      int b=sc.nextInt();
     
      int product=calculateProduct(a,b);
      System.out.println("The product of the given number is:"+product);
  }
}               */


//  Que3) Find the Factorial of any number.. 


import java.util.*;

public class functions{
    public static int calculateFactorial(int n){
       int fact=1;
     for(int i=1; i<=n; i++)
       fact=fact*i;
       {
        return fact;
    } 
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();

    int fact=calculateFactorial(n);
    System.out.println("The Factorial of the given number is:"+fact);
}
}