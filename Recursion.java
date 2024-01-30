

// //                                increasing order 1 to n



// import java.util.*;
// public class Recursion {
    
//     public static void printg(int n){
      
//          if(n==1){
//             System.out.print(n);
//             return;
//          }
//          printg(n-1);
//         System.out.print(n);

//     }

// public static void main (String args[]){
    
//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();
    
//     printg(n);


// }
// }



//                                                factorial of a number




// import java.util.*;
// public class Recursion {
    
//     public static int factorial(int n){
      
//         if(n==0 || n==1){
//              return 1;
//         }
                

//         return n*factorial(n-1);



//     }

// public static void main (String args[]){
    
//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();
    
//     System.out.print(factorial(n));


// }
// }





//                                       power of a number

// import java.util.Scanner;

// public class Recursion{

//     public static int power(int n,int k){
        
//         if (k==0){
//             return 1;
//         }

//         int j=(n*power(n,k-1));	
//         return j;

//     }
// public static void main (String args[]){
          
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int k=sc.nextInt();


//     System.out.print(power(n,k));

// }
// }




// nth fibonaccci number

// import java.util.Scanner;

// public class Recursion{
    
//     public static void fibo(int n,int a,int b){


//        for(int i=2;i<n;i++){
        
        
//         int c=a+b;
//         System.out.print(c);
//         a=b;
//         b=c;

        
//        }
       





//     }

// public static void main (String args[]){

     
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int a=0;
//     int b=1;

//     System.out.print("0");
// System.out.print("1");
//     fibo(n,0,1);

// }
// }




//                                            first occurence of key in an array

// import java.util.*;
// public class Recursion{

//     public static int firstOccurence(int i,int arr[],int key){

//         //agar array me element nai hai to -1
//         if(i==arr.length){
//             return -1;
//         }
        
//         //agar array me element mil gaya to i
//         if(arr[i]==key){
//             return i;
//         }
       
//         //agar pichele index me element nai mila to i ko badha diya
//        return firstOccurence(i+1, arr, key);

//     }
// public static void main (String args[]){

    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();

    // int arr[]=new int[n];

    // for(int i=0;i<n;i++){
    //     arr[i]=sc.nextInt();
    // }

    // int key=sc.nextInt();


    // System.out.print(firstOccurence(0,arr,key));
// }
// }




 //                                           last occurence


// import java.util.*;
//  public class Recursion{

//     public static int lastOccurence(int i,int arr[],int key){
        
//         if(i==arr.length){
//             return -1;
//         }

//         int isFound=lastOccurence(i+1, arr, key);

//         //lastoccurrence hame bata dega ki baad me key exist karti hai ya nai 
//         if(isFound==-1 && arr[i]==key){ 
//             return i;
//         }
//         return isFound;
//     }
//  public static void main (String args[]){
             
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     int key=sc.nextInt();


//     System.out.print(lastOccurence(0,arr,key));

//  }
//  }



//                                      tiling problem

// import java.util.Scanner;

// public class Recursion{

//     public static int tiles(int n){

//         if(n==0 || n==1){
//             return 1;
//         }

//         //vertical choice
//         int verticalways=tiles(n-1);

//         //horizontal choice
//         int horizontalways=tiles(n-2);

//         int totalways=horizontalways+verticalways;

//         return totalways;

//     }
// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);
//     int n=sc.nextInt();

//     System.out.print(tiles(n));
// }
// }




 //                                              remove duplicate elements

// import java.util.Scanner;

// public class Recursion{

//  public static void duplicate(String str,int index,StringBuilder newStr,boolean map[]){

//    if(index==str.length()){
//     System.out.print(newStr);
//     return;
//     }
      
//     //current character pata kar liya
//     char currChar=str.charAt(index);


//     if(map[currChar-'a']==true){//map ka index nikal gaya
//         duplicate(str, index+1, newStr, map);
//     }
    
//     else{
//         map[currChar-'a']=true;
//         duplicate(str, index+1, newStr.append(currChar), map);
//     }


//  }

//  public static void main (String args[]){
 
//    Scanner sc=new Scanner(System.in);
//    String str=sc.next();
   
//    //made a stringbuilder so that we can update or append
//    StringBuilder sb=new StringBuilder("");
   
//    //make an array of boolean
//    boolean arr[]=new boolean[26];
//    duplicate(str,0,sb,arr);

//  }
//  }


                              // method 2 (to remove duplicate from string)


// import java.util.*;
// public class Recursion {
  
//   public static void removeDuplicates(String s, int n)
//   {
//       String ans="";
//       int i,j;
//       for(i=0;i<n;i++){
//           for(j=0;j<i;j++){
//               if(s.charAt(i)==s.charAt(j)){
//                   break;     // We are breaking here because this caharacter is already
//               }              // added to our answer because it was found earlier
                             
//           }
//           if(j==i){          // The loop ends without breaking, it means this 
//               ans+=s.charAt(j);     // is the first occurence of this character in the string 
//           }                  // so we add this character to our answer
//       }
//       System.out.print(ans);
//   }
//   public static void main(String[] args)
//   {
//      Scanner sc=new Scanner (System.in);
     
//      String s=sc.nextLine();

//      int n=s.length();
//       removeDuplicates(s, n);
//   }
// }




//                                                             method 3 


// public class Recursion{
//   public static void main (String args[]){
  
//     String str="aapna";
//          StringBuilder sb1=new StringBuilder();
//        str.chars().distinct().forEach(c -> sb1.append((char)c));
  
//        System.out.println(sb1);
//   }
//   }



  //                                                        method 4


  // 1) pahle current character find karlo
  // 2) fir uske baad indexOf k help se find karo ki same character aur exist karta hai ya nai
  // 3) agar karta hai to ignore and move to next element 
  // 4) aggar nai karta hai to use sb me append karte jaoo

// public class Recursion{
//   public static void main (String args[]){
  
//     String str="programming";
        //  StringBuilder sb1=new StringBuilder();           
        
        //  for(int i=0;i<str.length()-1;i++){
        //   char currChar=str.charAt(i);

        //   int index=str.indexOf(currChar,i+1); //indexOf() method returns the position of the first occurrence of the specified character
        //                                       // but yaha pe indexOf(currChar,i+1) i+1 k baad ka character batayaega
        //                                       // eg--aaabababa    if(a,1)  then  ans = a jo ki 3rd index pe hoga 

        //   if(index==-1){ // -1 means ki curreChar ka koi duplicate mila ni
        //     sb1.append(currChar); // sb1 me insert kardo currChar ka value 
        //   }

        //  }

        //  System.out.print(sb1);  // print kardo
//   }
//   }


// import java.util.*;
// public class Recursion{

// public static int friendsPairing(int n){
   
//       if(n==1 || n==2){
//         return n;
//       }
      
//       // single choice
//       int fnm1=friendsPairing(n-1);

//       //pair choices
//       int fnm2=(n-1)*friendsPairing(n-2);
      
//       int totalways=fnm1+fnm2;

//       return totalways;


// }
// public static void main (String args[]){
//         Scanner sc=new  Scanner (System.in);
//         int n=sc.nextInt();

//         System.out.print(friendsPairing(n));

// }
// }





//                                             binary strings problem



import java.util.*;
public class Recursion{

public static void printBinString(int n,int lastPlace,String str){


      if(n==0){
        System.out.println(str);
        return;
      }




  if(lastPlace==0){
    printBinString(n-1,0,str+"0");
    printBinString(n-1,1,str+"1");
  }

  else{
    printBinString(n-1,0,str+"0");
  }
   
      


}
public static void main (String args[]){
        Scanner sc=new  Scanner (System.in);
        int n=sc.nextInt();
        int lastPlace=0;
    
        printBinString(n,1,"");

}            
}






