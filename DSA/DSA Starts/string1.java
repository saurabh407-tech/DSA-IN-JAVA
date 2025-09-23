// String in java 

// Que1)Take an array of Strings input from the user & find the cumulative (combined) length of all those strings..

import java.util.*;
public class string1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the Array:");
        int size=sc.nextInt();
        String arr3[]=new String[size];
        System.out.println("Enter the Elements of the array:"); 
        for(int i=0; i<size; i++){
            arr3[i]=sc.next();
        }
        int totalLength=0;
        for(int i=0; i<size; i++){
             totalLength+=arr3[i].length();
        }
        System.out.println("The total length of string is :"+totalLength);


    }
    
}




// Que2) Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
//Example : 
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”

// import java.util.*;
// public class string1{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String str=sc.next();
//         String result="";
//         for(int i=0; i<str.length(); i++){
//             char ch=str.charAt(i);
//             if(ch=='e'){
//                result+='i';
//             }
//             else{
//                 result+=ch;
//             }
//         }
    
//         System.out.println("the string is: "+result);

//     }
// }

