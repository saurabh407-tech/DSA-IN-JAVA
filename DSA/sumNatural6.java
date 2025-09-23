import java.util.*;
public class sumNatural6 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1; i<n; i++){
        int c=sum+i;
        sum=c;
    }
    System.out.println(sum);
}

}
