// Recursion Questions 

// Tower Of Henoi...

import java.util.*;
public class Recursion2 {
    public static void towerOfHenoi(int n,String Src,String Help,String Dest){
       if(n==1){
        System.out.println(" Transfer Disk "+n+" from "+Src+" to "+Dest);
        return;
       }
       towerOfHenoi(n-1,Src,Dest,Help); 
       System.out.println(" Transfer Disk "+n+" from "+Src+" to "+Dest);
       towerOfHenoi (n-1,Help,Src,Dest);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Disk: ");
        int n=sc.nextInt();
        towerOfHenoi(n,"S","H","D");

    }
    
}


// Print the string in Reverse order... TIME COMPLEXITY(O(n)); where n is the length of string

/* import java.util.*;
public class Recursion2{
    public static void printReverseString(String str,int indx){
      if(indx<0){
        return;
      }
      System.out.print(str.charAt(indx));
      printReverseString(str,indx-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String you want to reverse:");
        String str=sc.next();
        int indx=str.length()-1;
        System.out.println("Reverse String is: "+" ");
        printReverseString(str,indx);


    }
}


// Find the first and the last occurence of an element in String..

import java.util.*;

public class Recursion2{
    public static void calculateOccurenceIndx(String str,int indx,int first,int last,char ele){    // Also if you want you cannot declare first & last as parameter you can assign value outside the function
        if(indx==str.length()){
        System.out.println("The last index of element is:"+last);
         System.out.println("The first index of element is:"+first);
            return;
        }
        else if(ele==str.charAt(indx) && first==-1){
            first=indx;
        }
        else if(ele==str.charAt(indx) && first!=-1){
            last=indx;
        }
        calculateOccurenceIndx(str,indx+1,first,last,ele);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();
        System.out.println("Enter the character you want to check indices..");
        char ele=sc.next().charAt(0);
        calculateOccurenceIndx(str,0,-1,-1,ele);
      
    }
}



// check if an Array is Sorted(Strictly increasing)

import java.util.*;

public class Recursion2{
    public static void isSorted(int arr[],int i,int size){
        if(arr[i]<arr[i+1]){
            if(i==size-2){
                System.out.println("Array is sorted in ascending order.."); 
                return;  
            }
        }
        else{
            System.out.println("Array is not sorted in Ascending order..");
            return;
        }
        isSorted(arr,i+1,size);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[size];
        for(int j=0; j<size; j++){
             arr[j]=sc.nextInt();
        }
        isSorted(arr,0,size);
    }
}


//mov all the x to the end of the string

import java.util.*;

public class Recursion2{
    public static void moveX(String str,int indx,int count,String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }
        if(str.charAt(indx)=='x'){
            count++;
        }
        else{
            newString=newString+str.charAt(indx);
        }
        for(int i=0; i<count; count++){
            newString=newString+'x';
        }
           moveX(str,indx+1,count,newString);
    }
    public static void main(String[] args){
        String str="sauxraxxbxh";  // if you want you can take the String from the user end as well...
        moveX(str,0,0,"");
        
    }
}


//Remove the Duplicates elements in the string..

import java.util.*;

public class Recursion2{
    public static boolean[] map=new boolean[26];
    public static void removeDuplicate(String str,int indx,String newString){
        if(indx==str.length()){
            System.out.println("new string is : "+newString);
            return;
        }    // saurabh
        char currChar=str.charAt(indx);
        if(map[currChar-'a']){
           removeDuplicate(str,indx+1,newString);
        }
        else{ 
            newString+=currChar;
            map [currChar-'a']=true;
              removeDuplicate(str,indx+1,newString);
           }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String whoes duplicate element you want to remove:");
        String str=sc.next();
        removeDuplicate(str,0,"");
    }
}



//Write all Subsequences of string...

import java.util.*;

public class Recursion2{
 public static void subSequences(String str,int indx,String newString){
    if(indx==str.length()){
        System.out.println(newString);
        return;
    }
    char currChar=str.charAt(indx);

    //be in the newstring
    subSequences(str,indx+1,newString+currChar);

    //not to be in newstring
    subSequences(str,indx+1,newString);
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String whoes Subsequences you want: ");
    String str=sc.next();
    subSequences(str,0,"");
}
}



// Print all Unique subSequences of string..

import java.util.*;
import java.util.HashSet;
public class Recursion2{
 public static void subSequences(String str,int indx,String newString, HashSet<String>set){
    if(indx==str.length()){
        if(set.contains(newString)){
            return;
        }
        else{
            System.out.println(newString);
            set.add(newString);
            return;
        }
    }
    char currChar=str.charAt(indx);

    //be in the newstring
    subSequences(str,indx+1,newString+currChar,set);

    //not to be in newstring
    subSequences(str,indx+1,newString,set);
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String whoes Subsequences you want: ");
    String str=sc.next();
    HashSet<String> set=new HashSet<>();
    subSequences(str,0,"",set);
}
}

*/

