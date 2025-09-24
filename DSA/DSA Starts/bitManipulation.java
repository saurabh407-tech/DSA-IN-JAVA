// Bit Manipulation in Java (notes is in copy)

//1) Git Bit 

public class bitManipulation {
    public static void main(String[] args){
        int n=5;
        int pos=3;
        int bitMask=1<<pos;
        if((n & bitMask)==0){
            System.out.println("The bit at position "+pos+" is: 0");

        }
        else{
            System.out.println("The bit at the" +pos+"is: 1");
        }
    }
    
}

// 2) Set bit

/* public class bitManipulation{
    public static void main(String[] args){
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int newNum=(bitMask|n);
        System.out.println(newNum);
    }
}


// 3) Get bit

public class bitManipulation{
    public static void main(String[] args){
        int n=5;
        int pos=2;
        int gitMask=~(1<<pos);
        int newNum1=(gitMask&n);
        System.out.println(newNum1);

    }
}


// 4) Update Bit 

import java.util.*;
public class bitManipulation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the what operation you want to perform:");
        int ope=sc.nextInt();
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        System.out.println("The new number will be:");
        if(ope==0){
           int newNum1=(bitMask|n);
           System.out.println(newNum1);

        }
        else{
            int newBitMask=~(bitMask);
            int newNum2=(newBitMask & n);
            System.out.println(newNum2);
        }

    }
}                  */