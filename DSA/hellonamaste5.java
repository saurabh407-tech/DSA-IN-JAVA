import java.util.*;
public class hellonamaste5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int button=sc.nextInt();
//         if(num1==1){
//             System.out.println("Hello");
//         }
//         else if(num1==2){
//             System.out.println("Namaste");
//         }
//         else if(num1==3){
//             System.out.println("Bounjour");
//         }
//         else{
//            System.out.println("Not a valid number");

//          }



//     }
    
// }

//  By switch case 

switch(button){
case 1:
    System.out.println("Hello");
    break;
case 2:
    System.out.println("Namaste");
    break;
case 3:
    System.out.println("Bounjour");
    break;
default:
System.out.println("Not a valid number");
}
    }
}

