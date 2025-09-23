import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the button");

        int Button=sc.nextInt();
        switch(Button){
            case 1:
            System.out.println("Addition of Num1 & Num2 is:"+(num1+num2));
            break;
            case 2:
            System.out.println("Substraction of the given number is: "+(num1-num2));
            break;
            case 3:
            System.out.println("Multiplication of the given numbers is: "+(num1*num2));
            break;
            case 4:
            System.out.println("Division of given numbers is: "+(num1/num2));
            case 5:
            System.out.println("Remainder after divion of the numbers is: "+(num1%num2));
            default:
            System.out.println("Please Enter the valid case...! Thank You "); 
            
        }
    }

    
}
