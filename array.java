
                                                 // taking input of an array


// import java.util.*;
// public class array {
    

//     public static void main(String[] args) {
   
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
         
//         int arr[]=new int[50];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("elements are");
        
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]);
//         }

//     }


// }
 
                                            //    Linear Search


// import java.util.*;
// public class array {
    
//     public static int LinearSearch(int arr[],int n,int key){

//         for(int i=0;i<=n;i++){
//             if(arr[i]==key){
//                return i;
//             }
//         }
//         return -1;

//     } 

//     public static void main(String[] args) {
   
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int key=sc.nextInt(); 
//         int arr[]=new int[50];

//         for(int i=1;i<=n;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.print(LinearSearch(arr,n,key));
        


//     }


// }




                                        // method 2




// import java.util.*;
// public class array {
    
//     public static int LinearSearch(int arr[],int n,int key){

//         for(int i=0;i<=n;i++){
//             if(arr[i]==key){
//                return i;
//             }
//         }
//         return -1;

//     } 

//     public static void main(String[] args) {
   
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int key=sc.nextInt(); 
//         int arr[]=new int[50];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int ans=LinearSearch(arr,n,key);
        
//         if(ans==-1){
//             System.out.print("Not found");
//         }
        
//         else{
//             System.out.print("found at " + ans);
//         }

//     }


// }






//          largest and smallest element in the array


// import java.util.*;
// public class array {
    
//     public static int LargestElement(int arr[],int n){

//         int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<=n;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
            
//             if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
          
//         System.out.print(min);
//         return max;
        

//     } 

//     public static void main(String[] args) {
   
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[50];

//         for(int i=1;i<=n;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.print(LargestElement(arr,n));
        


//     }


// }





//                                      binary search 


// import java.util.*;
// public class array {
    
//     public static int BinarySearch(int arr[],int n,int key){

       
//         int start=0;
//         int end=n-1;
         
//         while(start<=end){

//             int mid=(start+end)/2;

//            if(arr[mid]==key){
//             return mid;
//            }

//            else if(arr[mid]<key){
//             start=mid+1;
//            }

//            else if(arr[mid]>key){
//             end=mid-1; 
//            }

//         }
//        return -1;
//     } 

//     public static void main(String[] args) {
   
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int key=sc.nextInt();
//         int arr[]=new int[50];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.print(BinarySearch(arr,n,key));
        


//     }


// }




//                  Reverse an arrrrrrrrray




// import java.util.*;
// public class array {
    
//     public static void ReverseArray(int arr[],int n){

       
//         int start=0;
//         int end=n-1;
         
//         while(start<=end){

//          int temp=arr[end];
//          arr[end]=arr[start];
//          arr[start]=temp;

//          start++;
//          end--;

        
//         } 
//     }
//     public static void main(String[] args) {
   
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         // int key=sc.nextInt();
//         int arr[]=new int[50];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//             ReverseArray(arr,n);
         

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+ " ");
//         }


//     }


// }




// find all the pairs and total no of unique pairs


// import java.util.*;
// public class array {
    
//     public static void pairs(int arr[],int n){

//         int pairs=0;
//        for(int i=0;i<n;i++){

//         for(int j=i+1;j<n;j++){
//             System.out.print("("+ arr[i] + "," + arr[j] + ")");
//             pairs++;
//         }
//         System.out.println();
//        }
//         System.out.print(pairs);
         
//     }
//     public static void main(String[] args) {
   
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         // int key=sc.nextInt();
//         int arr[]=new int[50];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//             pairs(arr,n);
        


//     }


// }


//                                               find all subarrays 



// import java.util.*;
// public class array {
    
//     public static void subarrays(int arr[],int n){
         
//         int total=0;
//         for(int i=0;i<n;i++){
//             int start=i;
//             for(int j=i;j<n;j++){
//                 int end=j;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(arr[k]+" "); 
//                 }
//                     total++;

//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.print(total);

//     }
//     public static void main(String[] args) {
   
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         // int key=sc.nextInt();
//         int arr[]=new int[50];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//             subarrays(arr,n);
        
//     }

// }


//                                          maximum subarray sum method 1

// import java.util.*;
// class array {
    
//     public static void subarray(int arr[],int n){
        
//         int currSum=0;
//         int max=Integer.MIN_VALUE;

//         for(int i=0;i<=n;i++){
//             for(int j=i;j<=n;j++){
//                 currSum=0;
//                 for(int k=i;k<=j;k++){
//                     currSum=currSum+arr[k];
//                 }
//                 // System.out.println(currSum);
//                 if(currSum>max){
//                     max=currSum;
//                 }
//             }
//         }
//             System.out.print("maximum is "+max);
//     }
    
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
        
//         int arr[]=new int[50];
        
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
        
//         subarray(arr,n);
        
//     }
// }




//                                         maximum subarray sum method 2(kadane's algorithm)


// import java.util.*;
// class array {
    
//     public static void subarray(int arr[],int n){
        
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
         
//         for(int i=1;i<n;i++){
//            currSum=currSum+arr[i];
        
// // kadane says ki agar current sum k avalue is less than 0 then current sum ko 0 hi rahne do

//            if(currSum<0){
//             currSum=0;
//         }
         
//         maxSum=Math.max(currSum,maxSum);
//         }

//         System.out.println("max subarray sum is "+maxSum);


//     }
    
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
        
//         int arr[]=new int[50];
        
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
        
//         subarray(arr,n);
        
//     }
// }





//                                               rainwater trapping 


// import java.util.*;
// class array {
    
//     public static int trappedRainwater(int arr[],int n){
        
//         // calculate left max boundary = array

//         int leftMax[]=new int[n];
//         leftMax[0]=arr[0];

//         for(int i=1;i<n;i++){
//             leftMax[i]=Math.max(arr[i],leftMax[i-1]);
//         }

//         // calculate right max boundary = array
//         int rightMax[]=new int[n];
//         rightMax[n-1]=arr[n-1];

//         for(int i=n-2;i>=0;i--){
//             rightMax[i]=Math.max(arr[i],rightMax[i+1]);
//         }
  
//         //    loop
         
//         int trappedWater=0;
//         for(int i=0;i<n;i++){

//             // waterLevel=Math.min(leftMax,rightmax);
//            int waterLevel=Math.min(leftMax[i],rightMax[i]);
           
           
//         // our formula , trappedRainwater=waterLevel-arr[i]
//            trappedWater=trappedWater+waterLevel-arr[i];
//         }

//         return trappedWater;
//     }
    
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
        
//         int arr[]=new int[50];
        
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
        
//      System.out.print(trappedRainwater(arr,n));
        
//     }
// }





//                                        buy and sell stocks




// import java.util.*;
// class array{
    
//     public static int buyAndSellStocks(int arr[],int n){
     
//         int buyPrice=Integer.MAX_VALUE; //buy price ko minimum maan liya
//         int maxProfit=0;

//         for(int i=0;i<n;i++){
//             if(buyPrice<arr[i]){     //profit 
//                 int profit=arr[i]-buyPrice; //profit for the present day
//                 maxProfit=Math.max(maxProfit,profit); //checking whether the profit is more or overall profit is more
//             }
//             else{ // agar stocks ka price kam hogaya hai to use kharid lo
//                 buyPrice=arr[i];
//             }
//         }

//         return maxProfit;
       
//     }
    
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);

//        int n=sc.nextInt();

//        int arr[]=new int[n];

//        for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//        }
        
//        System.out.print(buyAndSellStocks(arr,n));
//     }
// }





// import java.util.*;
// public class array {

//     // public static void print(int arr[],int n){

//          public static void main (String args[]) {

      
//       Scanner sc=new Scanner(System.in);

// 		 int n=sc.nextInt();

// 		 int arr[]=new int[n];
//          int arr2[]=new int[n];
// 		 for(int i=0;i<n;i++){
// 			 arr[i]=sc.nextInt();
// 		 }


// 		 for(int i=0;i<n;i++){
//              arr[i]=arr[i]*arr[i];

//              arr2[0]=Math.min(arr[0],arr[i]);
//          }
                          
// 	   // Arrays.sort(arr);




//          for(int i=0;i<n;i++){
//              System.out.print(arr[i]+" ");
//          }

//     }
// }



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;
// class array {
    
//     public static int ttt(int arr[],int n){
        
//         int lm[]=new int[n];
        
//         lm[0]=arr[0];
        
//         for(int i=1;i<n;i++){
//             lm[i]=Math.max(arr[i],lm[i-1]);
//         }
        
//         int rm[]=new int[n];
//         rm[n-1]=arr[n-1];
//         for(int i=n-2;i>=0;i--){
//             rm[i]=Math.max(arr[i],arr[i+1]);
//         }
        
        
//         int trapped=0;
        
//         for(int i=0;i<n;i++){
//             int w=Math.min(lm[i],rm[i]);
            
//             trapped=trapped+w-arr[i];
//         }
//         return trapped;
//     }
    
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
        
//         int n=sc.nextInt();
        
//         int arr[]=new int[n];
        
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
        
//         System.out.print(ttt(arr,n));
//     }
// }




//           freuency arraay    eg - aabbcc a-2 b-2 c-2

// import java.util.*;
// public class array{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     String str=sc.next();

//     int arr[]=new int[26];

//     for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);

//             int index=ch-97;
//             arr[index]=arr[index]+1;
//         }

//         for(int i=0;i<arr.length;i++){
//             char ch=(char)(i+97);
//             if(arr[i]>0){
//             System.out.println(ch+"->"+arr[i]);
//             }
//         }
// }
// }



// import java.util.*;
// public class array{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     String str=sc.next();
//     String str2=sc.next();

//     int arr[]=new int[26];
//     int arr2[]=new int[26];

//     int s1=0,s2=0;
//     for(int i=0;i<str2.length();i++){
//         s1=s1+str2.charAt(i);
//     }


//     for(int i=0;i<str2.length();i++){
//         s2=s2+str2.charAt(i);
//     }

//     if(s1>s2){
//        System.out.print((char)(s1-s2));
//     }

//     else if(s2>s1){
//         System.out.println((char)(s2-s1)); 
//        }

//     else{
//         System.out.print("0");
//     }

// }

    
// }




