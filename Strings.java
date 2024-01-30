// import java.util.*;
// public class Strings{
//     public static void main (String args[]){
    
//         char arr[]={'a','b','c','d'};
//         String str="abcd";
//         String str2=new String("xyz");

//          //strings in java are immutable

//     }
    
// }





//  taking input in string and finding length of string





// import java.util.*;
// public class Strings{
//     public static void main (String args[]){
    
//         Scanner sc=new Scanner(System.in);
//         String str;
//         str=sc.nextLine();
//         System.out.println(str);
//         System.out.println(str.length());
         
//     }
    
// }



//                                           concatenation of string


// import java.util.*;
// public class Strings{
//     public static void main (String args[]){
    
//        String str1="Rishu";
//        String str2="Raj";
//        String str3=str1+ " " +str2;

//        System.out.print(str3);
         
//     }
    
// }


//                finding character at specific position


// import java.util.*;
// public class Strings{
//     public static void main (String args[]){
    
//        String str1="Rishu";
//        String str2="Raj";
//        String str3=str1+ " " +str2;

//        for(int i=0;i<str3.length();i++){
//         System.out.println(str1.charAt(i));
//        }
         
//     }
    
// }



//  qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq



//                       check whether palindrome or not 


// import java.util.*;
// public class Strings{

    // public static boolean checkPalin(String str){

    //     for(int i=0;i<str.length()/2;i++){
    //         if(str.charAt(i)!=str.charAt(str.length()-i-1)){
    //                 return false;
    //         }
    //   }

    //   return true;

    // }


//     public static void main (String args[]){
    
//        Scanner sc=new Scanner(System.in);
       
//        String str=sc.nextLine();

//        System.out.print(checkPalin(str));
       


//     }
    
// }


//                       check whether palindrome or not (using void)



// import java.util.*;
// public class Strings{

//     public static void checkPalin(String str){

//         for(int i=0;i<str.length()/2;i++){
//             if(str.charAt(i)!=str.charAt(str.length()-i-1)){
//                 System.out.print("no");
//             }
//       }

// System.out.print("yes");
//     }


//     public static void main (String args[]){
    
//        Scanner sc=new Scanner(System.in);
       
//        String str=sc.nextLine();

//        checkPalin(str);
       


//     }
    
// }



//              given a route containing 4 directions (E,W,N,S) , find the shortest path to reach destination ("WNEENESENNN")

// import java.util.*;
// public class Strings{

//     public static float findDistance(String str){

//      int x=0,y=0;  //means we are on the origin initially

//      for(int i=0;i<str.length();i++){
//         char dir=str.charAt(i);
// WNEENESENNN
//         //south
//         if(dir=='S'){
//             y--;
//         }
//         //North   
//         else if(dir=='N'){
//             y++;
//         }
        
//         //west
//         else if(dir=='W'){
//             x--;
//         }

//         //east
//         else{
//             x++;
//         }

//      }

//          int x2=x*x;
//          int y2=y*y;

//          return (float)Math.sqrt(x2+y2);

//     }


//     public static void main (String args[]){
    
//        Scanner sc=new Scanner(System.in);
       
//        String str=sc.nextLine();

//        System.out.print(findDistance(str));
       


//     }
    
// }


//                                        comparing strings 



// import java.util.*;
// public class Strings{

//     public static void cmpString(String str1,String str2,String str3){

//      if(str1==str2){
//         System.out.println("Strings are equal");
//      }
//      else{
//         System.out.println("Strings are not equal");
//      }

//      if(str1==str3){
//         System.out.println("Strings are equal");
//      }
//      else{
//         System.out.println("Strings are not equal");
//      }


//     }


//     public static void main (String args[]){
    
//        Scanner sc=new Scanner(System.in);
       
//         //  String str1="Tony";
//         //  String str2="Tony";

//        String str1=sc.next();
//        String str2=sc.next();
//        String str3=new String("Tony");

//        cmpString(str1,str2,str3);
       


//     }
    
// }


// this is second method that uses inbuilt function called str1.equals(str3) and it just checks the value or say equality of strings

// import java.util.*;
// public class Strings{

//     public static void cmpString(String str1,String str2,String str3){

//      if(str1.equals(str2)){
//         System.out.println("Strings are equal");
//      }
//      else{
//         System.out.println("Strings are not equal");
//      }

//      if(str1.equals(str3)){
//         System.out.println("Strings are equal");
//      }
//      else{
//         System.out.println("Strings are not equal");
//      }


//     }


//     public static void main (String args[]){
    
//        Scanner sc=new Scanner(System.in);
       
//         //  String str1="Tony";
//         //  String str2="Tony";

//        String str1=sc.next();
//        String str2=sc.next();
//        String str3=new String("Tony");

//        cmpString(str1,str2,str3);
       


//     }
    
// }





//                                   print substring between the given indexes(Ending index excluding)





// import java.util.*;
// public class Strings{

//     public static String subString(String str1,int start,int end){

//         String subString="";

//         for(int i=start;i<end;i++){
//              subString=subString+str1.charAt(i);
//         }
     
//        return subString;
//     }


//     public static void main (String args[]){
    
//        Scanner sc=new Scanner(System.in);
    
//        String str1=sc.next();
//        int start=sc.nextInt();
//        int end=sc.nextInt();

//        System.out.print(subString(str1,start,end));
       


//     }
    
// }






//                               method 2 for finding substring (using inbuilt functions)     




// import java.util.*;
// public class Strings{

//     public static void main (String args[]){
    
//        Scanner sc=new Scanner(System.in);
    
//        String str1=sc.next();

//        System.out.print(str1.substring(1,5));
       


//     }
    
// }




//   print the largest string lexicographically (A=a)






// import java.util.*;
// public class Strings{

//     public static void main (String args[]){
    
//        Scanner sc=new Scanner(System.in);
    
//        String fruits[]={"apple","mango","banana"};

//        String largest=fruits[0];

//        for(int i=1;i<fruits.length;i++){
//         if(largest.compareTo(fruits[i])<0){
//             //largest sirf usi time update hoga jab str1=fruits[1] > str2=fruits[0] 
//             largest=fruits[i];
//         }
//        }
//        System.out.println(largest);

//     }
    
// }





                                                         // String builder 





// public class Strings{
// public static void main (String args[]){
         
//    StringBuilder sb=new StringBuilder("");
//    for(char ch='a';ch<='z';ch++){
//       sb.append(ch);
//    }//abcdefghijklmnopqrstuvwxyz
//    System.out.println(sb);
//    System.out.println(sb.length());

// }
// }






//                           convert lower case of every first word to upper case




// using void


// import java.util.*;
// class Strings {
    
//     public static void toUpper(String str){
        
//         System.out.print(Character.toUpperCase(str.charAt(0)));
        
//         StringBuilder sc=new StringBuilder();
        
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==' ' && i<str.length()-1){
//                 sc.append(str.charAt(i));
//                 i++;
                
//                 sc.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sc.append(str.charAt(i));
//             }
            
//         }
        
//         System.out.print(sc);
        
//     }
    
//     public static void main(String[] args) {
//           Scanner sc=new Scanner (System.in);
//           String str=sc.nextLine();
        
//         toUpper(str);
       
//     }
// }


                                                            //method 2




// import java.util.*;
// public class Strings{
   
//    public static String  toUpper(String str){

//     StringBuilder sb=new StringBuilder("");

//        //apne sentence ka pahla letter to capital hi rahega 
//     char ch=Character.toUpperCase((str.charAt(0)));

//     //fir jo v wo first letter hoga use append kardenge apne string builder me
//     sb.append(ch);

//     for(int i=1;i<str.length();i++){
//       if(str.charAt(i)== ' ' && i<str.length()-1){
        
//          // ye space ko append kar raha hai string me
//          sb.append(str.charAt(i));
         
//          // fir i ko badha diya
//          i++;

//          //ab us lower letter ko capital kar k append kiya 
//          sb.append(Character.toUpperCase(str.charAt(i)));
//       }
//       else{
//          sb.append(str.charAt(i));
//       }
//     }
//      return sb.toString();
//    }

//    public static void main (String args[]){
            
//       Scanner sc=new Scanner(System.in);
//       String str=sc.nextLine();

//       System.out.print(toUpper(str));
   
//    }
//    }



//                                                           compresss string aaabbcccdd == a3b2c3d2


// import java.util.*;
// public class Strings{

//    public static String compress(String str){
       
//       int n=str.length();
//       String newStr="";
          
//       for(int i=0;i<n;i++){
    //             using integer kyuki baad me int ko jaake string me convert karna hoga
//          Integer count=1;
//          while(i<n-1 && str.charAt(i) == str.charAt(i+1)){
//              count++;
//              i++;
//          }
//          newStr=newStr+str.charAt(i);
//          if(count>1){
//             newStr=newStr+count.toString();
//          }
//       }
//           return newStr;
//    }
//    public static void main (String args[]){
            
//      Scanner sc=new Scanner(System.in);
//      String str=sc.next();
     
//      System.out.print(compress(str));

//    }
//    }






//                         count of substrings of this string which are palindromes
//                             eg - abc == count=3







import java.util.Scanner;
import java.util.*;
public class Strings {
    
	public static void print(String str){
		
		int count=0;

		for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isPalindrome(str.substring(i, j+1))) {
                    count++; 
                }
            }
        }
		System.out.print(count);
	}

	    public static boolean isPalindrome(String str){

			for(int i=0;i<str.length()/2;i++){
				if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                        return false;
				}
			}
			return true;
		}

    public static void main(String args[]) {

    Scanner sc=new Scanner (System.in);
	String str=sc.nextLine();

     print(str);

    }
}





                              //to find all the substring of a string






// import java.util.Scanner;

// public class Strings{
// public static void main (String args[]){
     
//     Scanner sc=new Scanner (System.in);
//     String str=sc.next();

//     for(int i=0;i<str.length();i++){
//         for(int j=i;j<str.length();j++){
//             System.out.println(str.substring(i,j+1));
//         }
//     }
// }
// }



  //                             convert upperr case to lower and lower case to upper






// import java.util.*;
// public class Strings {

//     public static void main(String args[]) {
         
// 		 Scanner sc=new Scanner (System.in);
// 		 String str=sc.nextLine();

// 		 for(int i=0;i<str.length();i++){
// 			if(str.charAt(i)>=65 && str.charAt(i)<97 ){
// 				System.out.print((char)(str.charAt(i)+32));

// 			}
// 			else{
// 				System.out.print((char)(str.charAt(i)-32));

// 			}
// 		 }
         
        


//     }
// }



//







               //         difference in the ASCII eg= acb ans=a2c-1b


// import java.util.*;
// public class Strings {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner (System.in);
// 		String str=sc.nextLine();
		
//         for(int i=0;i<str.length()-1;i++){
// 			System.out.print(str.charAt(i));
// 			System.out.print(str.charAt(i+1)-str.charAt(i));
// 		}

// 		System.out.print(str.charAt(str.length()-1));
//     }
// }






                                                   // string remove duplicate aabbcca --> abca
                                       
// import java.util.*;
// public class Strings{
// public static void main (String args[]){
     
   
// 		 Scanner sc=new Scanner (System.in);
// 		 String str=sc.nextLine();

// System.out.print(str.charAt(0));

//      for(int i=0;i<str.length();i++){
//       if(str.charAt(i)!=str.charAt(i+2)){
//         System.out.print(str.charAt(i+1));
//       }
//      }




// }
// }






// import java.util.*;
// public class Strings{
// public static void main (String args[]){

//   Scanner sc=new Scanner(System.in);
//   String str=sc.nextLine();

//   String str2="";

//   for(int i=str.length()-1;i>=0;i--){
//     System.out.print(str.charAt(i));
//   }
// }
// }