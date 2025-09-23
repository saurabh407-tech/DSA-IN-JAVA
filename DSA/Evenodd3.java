import java.util.*;
public class Evenodd3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Number is the even Number");
        }
        else{
            System.out.println("The number is the odd number");
        }

    }
}