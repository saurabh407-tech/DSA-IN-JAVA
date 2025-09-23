// These are the Exercise questions to solve them using function

// Que1) Enter 3 numbers from the user & make a function to print their average...
 
/*  import java.util.Scanner;

public class functExercise {

   public static float calculateAverage(float a, float b, float c) {
      float average = (a + b + c)/3;
      return average;
   }

   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first number: ");
      float a = sc.nextInt();
      System.out.println("Enter the second number: ");
      float b = sc.nextInt();
      System.out.println("Enter the third number: ");
      float c = sc.nextInt();
      float average = calculateAverage(a,b,c);
      System.out.println("The average of the given numbers is: " +average);
   }
}


// Que2) Write a function to print the sum of all odd numbers from 1 to n..
 
import java.util.*;

public class functExercise{
    public static int oddSum(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            if(i%2!=0)
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int sum=oddSum(n);
        System.out.println("Sum of the odd integers is:"+sum);
    }
}


// Que3) Write a function which takes in 2 numbers and returns the greater of those two...

import java.util.*;

public class functExercise{
    public static void greaterOfTwo(int a,int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
         greaterOfTwo(a,b);
    }
}


// Que4)Write a function that takes in the radius as input and returns the circumference of a circle.


import java.util.*;

public class functExercise{
    public static double calculateCircumference(int r){
        double circumference=2 * 3.14 * r;
                return circumference ;
                  
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r=sc.nextInt();
        double circumference=calculateCircumference(r);
        System.out.println("Circumference of the circle of radius " + circumference + " is:");
    }
}


// Que5) Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote...

import java.util.*;

public class functExercise{
    public static void eligibleForVote(int age){
        if(age>18){
            System.out.println("Eligible for voting");
        }
        else if(age<0){
            System.out.println("You entered invalid age please enter valid age.. ");

        }
        else{
            System.out.println("Not eligible for voting");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
         eligibleForVote(age);
    }
}

// Que6) Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered...

import java.util.*;

public class functExercise{
        public static void main(String[] args){
        int num=1;
        int zero=0;
        int positive=0;
        int negative=0;
        Scanner sc=new Scanner(System.in);
        while(num==1){ 
                  System.out.println("Enter the number...");
                  int number=sc.nextInt();
                  if(number==0){
                            zero+=1;
                  }
                  else if(number>0){
                    positive+=1;
                  }
                  else if(number<0){
                    negative+=1;
                  }
                  System.out.println("Enter 0 to stop and 1 to continue");
                   num=sc.nextInt();
        }
        
        
          System.out.println("Count of Zeroes is:"+zero);
          System.out.println("Count of positive numbers is:"+positive);
          System.out.println("Count of negative numbers is:"+negative);
          
       
    }
}


// Que7) Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn...

import java.util.*;

public class functExercise{
    public static int calculatePower(int x,int n){
        int p=(int)Math.pow(x,n);
        return p;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=sc.nextInt();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int p=calculatePower(x,n);
        System.out.println("The value of x ki power n is:"+p);

    }
}                                                    */

// Que8) Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

import java.util.*;

public class functExercise{
    public static int calculateGCD(int num1,int num2){
        int GCD=1;
      for(int i=1; i<num1; i++){
      if(num1%i==0 && num2%i==0){
         GCD=i;
      }  
    }
    return GCD;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the value of num2:");
        int num2=sc.nextInt();
        int gcd=calculateGCD(num1,num2);
        System.out.println("The GCD of " +num1+ " and " +num2+ " is:"+gcd);

    }
}