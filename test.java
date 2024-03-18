
//                     wave print in row wise

import java.util.*;
public class test {

     
    public static void main(String[] args) {
   System.out.println("hi");

    }
    
}



//                         wave print in column wise


// import java.util.*;
// public class TwoDArray {

//      public static void matrix(int arr[][],int n,int m) {
        
//         for(int j=0;j<m;j++){
//             if(j%2==0){
//                 for(int i=0;i<n;i++){
//                     System.out.print(arr[j][i]);
//                 }
//             }
            
//             else{
//                 for(int i=n-1;i>=0;i--){
//                     System.out.print(arr[j][i]);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//     Scanner sc=new Scanner (System.in);
//     int n=sc.nextInt();
//     int m=sc.nextInt();
    
//     int arr[][]=new int[n][m];
//     // int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             arr[i][j]=sc.nextInt();
//         }
//     }
 
//     matrix(arr,n,m);

//     }
    
// }




// import java.util.*;
// public class TwoDArray{

//  public static boolean print(int arr[][],int n,int m,int key){

     
//      for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             if(arr[i][j]==key){
//                 System.out.println("Found at "+ i + "," +j);
//                 return true;
//                 //yaha hamne void nai use kiya kyuki found hone k baad jab loop se bahar niklega to wo not found ek baar print karega;
//             }
//         }
                  
//      }
//      System.out.println("Not Found");

//                return false;
//  }




//                                    spiral  print   in clockwise direction



// import java.util.*;
// public class TwoDArray{


//     public static void printSpiral(int arr[][],int n,int m){

//     int sr=0;
//     int sc=0;
//     int er=n-1;
//     int ec=m-1;

//      // j=col i=row

    
//      while(sr<=er && sc<=ec){
//          //top 
//          for(int j=sc;j<=ec;j++){
//             System.out.print(arr[sr][j]+" ");
//          }

//          //right
//          for(int i=sr+1;i<=er;i++){
//             System.out.print(arr[i][ec]+" ");
//          }

//          //bottom
//          for(int j=ec-1;j>=sc;j--){
//             System.out.print(arr[er][j]+" ");
//          }
//         //left
//          for(int i=er-1;i>sr;i--){
//             System.out.print(arr[i][sc]+" ");
//          }
//          sc++;
//          sr++;
//          ec--;
//          er--;
//      }

      
// System.out.println();

//     }
// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();
// int m=sc.nextInt();

// // int key=sc.nextInt();

// int arr[][]=new int[n][m];

// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         arr[i][j]=sc.nextInt();
//     }
// }

//  printSpiral(arr,n,m);
// }
// }




//                                        spiral print in anticlockwise direction



// import java.util.*;
// public class TwoDArray{


//     public static void printSpiral(int arr[][],int n,int m){

//     int sr=0;
//     int sc=0;
//     int er=n-1;
//     int ec=m-1;

//      // j=col i=row

    
//      while(sr<=er && sc<=ec){

//         for(int i=sr;i<=er;i++){
//             System.out.print(arr[i][sc]+" ");
//         }

//         for(int j=sc+1;j<=ec;j++){
//             System.out.print(arr[er][j]+" ");
//         }

//         for(int i=er-1;i>=sr;i--){
//             System.out.print(arr[i][ec]+" ");
//         }

//         for(int j=ec-1;j>sc;j--){
//             System.out.print(arr[sr][j]+" ");
//         }


//         sc++;
//         sr++;
//         er--;
//         ec--;

//      }
     

      
// System.out.println();

//     }
// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();
// int m=sc.nextInt();

// // int key=sc.nextInt();

// int arr[][]=new int[n][m];

// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         arr[i][j]=sc.nextInt();
//     }
// }

//  printSpiral(arr,n,m);



                                                    //   diagonal sum of matrix (O n^2)


// import java.util.*;
// public class TwoDArray{


//     public static int printSpiral(int arr[][],int n){
                   
//         int sum=0;

//         // for primary diagonal
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<=n;j++){
    //             if(i == j){
    //                 sum=sum+arr[i][j];
    //             }
    //             else if(i+j == n-1){
    //                 sum=sum+arr[i][j];
    //             }
    //         }
    //     }
    //     return sum;

    // }
// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();



// int arr[][]=new int[n][n];

// for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//         arr[i][j]=sc.nextInt();
//     }
// }

//  System.out.print(printSpiral(arr,n));


// }
// }


                                            // sum of diagonals of matrix method 2



// import java.util.*;
// public class TwoDArray{


//     public static int printSpiral(int arr[][],int n){
                   
//         int sum=0;
                    

//         for(int i=0;i<n;i++){
//             sum=sum+arr[i][i];

//             if(i !=n-1-i){
//                 sum=sum+arr[i][n-i-1];
//             }
//         }
       
//         return sum;

//     }
// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();



// int arr[][]=new int[n][n];

// for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//         arr[i][j]=sc.nextInt();
//     }
// }

//  System.out.print(printSpiral(arr,n));


// }
// }






//                                               search in sorted matrix





// import java.util.*;
// public class TwoDArray{


//     public static boolean printSpiral(int arr[][],int n,int m,int key){
                   
//         int i=0;
//         int j=n-1;

//         while(i<n && j>=0){
//             if(arr[i][j]==key){
//                 System.out.println("found at"+ i +" "+j);
//                 return true;
//             }

//             //agar hamara key array k element se chota hai to fir ham left jaayenge matlab column -- (j--)
//             else if(key<arr[i][j]){
//                 j--;
//             }
//             else{
//                 i++;
//             }
//         }
//         System.out.print("Not found");
//          return false;
//     }
// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();
// int m=sc.nextInt();

// int key=sc.nextInt();

// int arr[][]=new int[n][n];

// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         arr[i][j]=sc.nextInt();
//     }
// }

//  System.out.print(printSpiral(arr,n,m,key));


// }
// }




// import java.util.*;
// public class TwoDArray{


//     public static void printSpiral(int arr[][],int n,int m){
        
//            for(int i=0;i<n;i++){
//             for(int j=i+1;j<m;j++){
//                 int temp=arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//            }
        
//            for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                System.out.print(arr[i][j]);
//             }
//            }
          
//     }
        
    

    
// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();
// int m=sc.nextInt();

// // int key=sc.nextInt();

// int arr[][]=new int[n][m];

// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         arr[i][j]=sc.nextInt();
//     }
// }

//           printSpiral(arr,n,m);


// }
// }



// import java.util.*;
// public class TwoDArray{

// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();
// int m=sc.nextInt();

// // int key=sc.nextInt();

// int arr[][]=new int[n][m];

// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         arr[i][j]=sc.nextInt();
//     }
// }

         
// int sc1=0;
// int sr=0;
// int er=n-1;
// int ec=m-1;

// while(sr<=er && sc1<=ec){

// for(int i=sc1;i<=ec;i++){
//     System.out.print(arr[i][sr]);
// }

// for(int j=sr+1;j<=er;j++){
//     System.out.print(arr[ec][j]);
// }

// for(int i=ec-1;i<=sr;i--){
//     System.out.print(arr[i][er]);
// }

// for(int j=er-1;j>0;j--){
//     System.out.print(arr[er-1][j]);
// }

// sc1++;
// ec--;
// sr++;
// er--;


// }


// }
// }