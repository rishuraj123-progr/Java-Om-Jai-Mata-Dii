// // import java.util.*;
// // public class PatternsPractice {


// //     public static void print(int n){

// //         for(int i=n;i>0;i--){

// //           for(int space=n;space>n-i;space--){
// //             System.out.print(" ");
// //           }

// //             for(int j=1;j<=i;j++){
// //                System.out.print("*");
// //             }
// //             System.out.println();
// //         }
        
// //     }
// //     public static void main(String[] args) {
// // Scanner sc=new Scanner (System.in);

// // int n=sc.nextInt();

// // print(n);
// //     }
// // }



// import java.util.*;
// public class PatternsPractice {


//     public static void print(int n){
           
//         for(int i=1;i<=n;i++){

//             for(int space=1;space<=n-i;space++){
//                 System.out.print(" ");
//             }
//             for(int star=1;star<=i;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
       
//     public static void main(String[] args) {
// Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();

// print(n);
//     }
// }



// import java.util.*;
// public class PatternsPractice {


//     public static void print(int n){

//         for(int i=1;i<=n;i++){

//         //  for star
//         for(int star1=1;star1<=i;star1++){
//             System.out.print("*");
//         }

//         for(int space=1;space<=2*(n-i);space++){
//                System.out.print(" ");
//         }

//         for(int star=1;star<=i;star++){
//             System.out.print("*");
//         }

//         System.out.println();
//         }
        
         
//     for(int i=n;i>0;i--){

//         //  for star
//         for(int star1=1;star1<=i;star1++){
//             System.out.print("*");
//         }

//         for(int space=1;space<=2*(n-i);space++){
//                System.out.print(" ");
//         }

//         for(int star=1;star<=i;star++){
//             System.out.print("*");
//         }

//         System.out.println();
//         }
    
//     }
    
    
   
//     public static void main(String[] args) {
// Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();

// print(n);
//     }
// }





// import java.util.*;
// public class PatternsPractice {


//     public static void print(int n){

//        for(int i=1;i<=n;i++){

//         for(int space=1;space<=i-1;space++){
//            System.out.print(" ");
//         }

//         for(int j=i;j<=n;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//        }
//     }
   
//     public static void main(String[] args) {
// Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();

// print(n);
//     }
// }



//  diamond print

// import java.util.*;
// public class PatternsPractice {


//     public static void print(int n){

//         // first half
//        for(int i=1;i<=n;i++){

//         for(int space=1;space<=n-i;space++){
//             System.out.print(" ");
//         }

//         for(int star=1;star<=(2*i)-1;star++){
//             System.out.print("*");
//         }

//         System.out.println();
//        }


//     //    second half

//     for(int i=n;i>0;i--){

//         for(int space=1;space<=n-i;space++){
//             System.out.print(" ");
//         }

//         for(int star=1;star<=(2*i)-1;star++){
//             System.out.print("*");
//         }

//         System.out.println();
//        }
//     }
   
//     public static void main(String[] args) {
// Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();

// print(n);
//     }
// }




// import java.util.*;
// public class PatternsPractice{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();
// // int m=sc.nextInt();

// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// }
// }


// import java.util.*;
// public class PatternsPractice{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();
// int m=sc.nextInt();

// for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//         if(i==n || i==1 || j==m || j==1){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }

// }
// }


// import java.util.*;
// public class PatternsPractice{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();

//  for(int i=1;i<=n;i++){

//     // for space

//     for(int space=1;space<=n-i;space++){
//         System.out.print(" ");
//     }

//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//  }

// }
// }





// import java.util.*;
// public class PatternsPractice{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();

//  for(int i=1;i<=n;i++){
    
//     for(int j=1;j<=n;j++){

//         if(i==j || n+1==i+j){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }

//     }
//     System.out.println();
//  }

// }
// }


// import java.util.*;
// public class PatternsPractice{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();

// for(int i=1;i<=n;i++){

//     //for space

//     for(int space=1;space<=n-i;space++){
//         System.out.print(" ");
//     }

//     for(int star=1;star<=i;star++){
//         System.out.print("*"+" ");
//     }

//     System.out.println();

// }

// }
// }





// import java.util.*;
// public class PatternsPractice{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();

// for(int i=1;i<=n;i++){
//     //for space

//     for(int space=1;space<=n-i;space++){
//         System.out.print(" ");
//     }
    
// // int val=1;
   
//     for(int val=1;val<=i;val++){
//        System.out.print(val);
//        val++;
//     }

//     System.out.println();

// }

// }
// }








