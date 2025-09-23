import java.util.*;
public class primenumber7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num<1){
            System.out.println("Number is not prime");
        }
        int count=0;
        for(int i=2; i<num; i++){
           if(num%i==0)
           count=count+1;
        }
        if(count==0){
            System.out.println("Number is the prime number");
        }
        else{
            System.out.println("Number is not the Prime number");
        }
    }
    
}
