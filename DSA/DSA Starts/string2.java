//StringBuider in java

// import java.util.*;
// public class string2 {
//     public static void main(String[] args){
//         StringBuilder sb=new StringBuilder("Tony");
//         System.out.println(sb);
//         System.out.println(sb.charAt(0));
//         sb.setCharAt(0,'P');   // this will replace T by P
//         System.out.println(sb);
//         sb.insert(0,'S');
//         System.out.println(sb);  //  SPony
//         sb.delete(0,1);
//         System.out.println(sb);  // this will print the Pony again by deleting S of index 0
//     }
    
// }


//append case in java

// public class string2{
//     public static void main(String[] args){
//         StringBuilder sb=new StringBuilder("h");
//         sb.append("e");
//         sb.append("l");
//         sb.append("l");
//         sb.append("o");
//         System.out.println(sb);  //output is hello
//     }
// }


//Concept to reverse a string 

// import java.util.*;
// public class string2{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the string you want to reverse: ");
//         String str=sc.nextLine();
//         StringBuilder sb=new StringBuilder(str);
//         for(int i=0; i<str.length()/2; i++){
//             int front =i;
//             int back=sb.length()-1-i;
//             char frontPos=sb.charAt(front);
//             char backPos=sb.charAt(back);
//             sb.setCharAt(front,backPos);
//             sb.setCharAt(back,frontPos);


//         }
//       System.out.println(sb);

//     }
// }


// reverse the vowels you get in the string

import java .util.*;

public class string2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
             char sys=sb.charAt(i);
             if(sys=='a' || sys=='e' || sys=='i' || sys=='o' || sys=='u'){
                int front=i;
                int back=str.length()-1-i;
                char frontPos=sb.charAt(front);
                char backPos=sb.charAt(back);
                sb.setCharAt(front,backPos);
                sb.setCharAt(back,frontPos);

             }
        }
        System.out.println(sb);
    }
}