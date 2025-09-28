// Recursion Advance Level questions

// Que) Print all the permutation of a string

import java.util.*;
public class Recursion3 {
    public static void printPermutation(String str, String permutation){
     if(str.length()==0){
        System.out.println(permutation);
        return;
     }
     for(int i=0; i<str.length(); i++){
        char currChar=str.charAt(i);
        String newStr=str.substring(0,i)+str.substring(i+1);
        printPermutation(newStr,permutation+currChar); 

     }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();
        printPermutation(str,"");
    }
    
}



// Find total paths in a maze to move from (0,0) to (n,m)...(you can move downword and right side )..
/* 

import java.util.*;
public class Recursion3{
    public static int countPath(int i,int j,int m,int n){
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        int downPath=countPath(i+1,j,m,n);
        int rightPath=countPath(i,j+1,m,n);
        return downPath+rightPath;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of colums: ");
        int n=sc.nextInt();
        int totalPaths=countPath(0,0,n,m);
        System.out.println("The number of paths is : "+totalPaths);
    }
}


// Place the tiles of size 1xm in a floor of size nxm...

import java.util.*;
public class Recursion3{
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertPlaced=placeTiles(n-m,m);
        int horiPlaced=placeTiles(n-1,m);
        return vertPlaced+horiPlaced;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the rows: ");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m=sc.nextInt();
        int totalWayPlace=placeTiles(n,m);
        System.out.println("The total number of ways to place the tiles: "+totalWayPlace);

    }
}


// Find the number of ways you in which you can invite n people to your party single or in pairs...

import java.util.*;
public class Recursion3{
    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
       int ways1=callGuests(n-1);
       int ways2=(n-1)*callGuests(n-2);
       return ways1+ways2; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int n=sc.nextInt();
        int totalWays=callGuests(n);
        System.out.println("Number of ways :"+totalWays);
    }
}

*/