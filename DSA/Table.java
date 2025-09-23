import java.util.*;
public class Table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table you want to print");
        int num=sc.nextInt();
        for(int i=1; i<=10; i++){
            int p=num*i;
            System.out.println(num+"X"+i+"="+p);
        }

    }
    
}
