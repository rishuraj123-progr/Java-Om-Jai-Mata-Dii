// import java.util.*;
// class arrayPractice {

//     public static int trappedRainwater(int arr[],int n){

//         int leftMax[]=new int[n];
//         int rightMax[]=new int[n];

//         leftMax[0]=arr[0];

//         for(int i=1;i<n;i++){
//             leftMax[i]=Math.max(arr[i],leftMax[i-1]);
//         }

//         rightMax[n-1]=arr[n-1];

//         for(int i=n-2;i>=0;i--){
//             rightMax[i]=Math.max(arr[i], rightMax[i+1]);
//         }

//         int trappedWater=0;
//         for(int i=1;i<n;i++){
//             int waterLevel=Math.min(rightMax[i],leftMax[i]);

//             trappedWater=trappedWater+waterLevel-arr[i];
//         }
//         return trappedWater;
//     }

//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);

//        int n=sc.nextInt();

//        int arr[]=new int[n];

//        for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//        }

//        System.out.print(trappedRainwater(arr,n));
//     }
// }

// 

// import java.util.*;

// public class arrayPractice{

//    public static void printSpiral(int arr[][],int n,int m){

//    }

// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);

//     int n=sc.nextInt();
//     int m=sc.nextInt();

//     int arr[][]=new int[n][m];

//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             arr[i][j]=sc.nextInt();
//         }
//     }

//      printSpiral(arr,n,m);

// }
// }

//                                practice      

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();

// int binaryNumber=0;
// int place=1;

// if(n==0){
//     System.out.print("0");
// }
// else{
//     while(n>0){
//     binaryNumber=place*(n%2)+binaryNumber;
//     place=place*10;
//     n=n/2;
// }
// }
// System.out.print(binaryNumber);
// }
// }

//                          armstrong number between two given values

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);

// int a=sc.nextInt();
// int b=sc.nextInt();

// for(int i=a+1;i<b;i++){
//     int temp=i;
//     int count=0;
//     while(temp!=0){
//         count++;
//         temp=temp/10;
//     }

//     temp=i;
//   int sum=0;

//     while(temp!=0){

//         int last=temp%10;
//         sum+=Math.pow(last,count);
//         temp=temp/10;
//     }

//     if(sum==i){
//         System.out.print(i);
//     }
// }

// }
// }

//           Set A question 3

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     int a=sc.nextInt();
//     int b=sc.nextInt();

//     int count=0;

//     for(int i=0;i<n;i++){
//        if(a%arr[i]==0 && b%arr[i]==0){
//         count++;
//        }
//     }

//     System.out.print(count);

// }
// }

//               neon number

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//    int temp=n;
//    int sum=0;
//     while(temp!=0){
//         int last=temp%10;
//         sum+=Math.pow(last,2);
//         temp=temp/10;
//     }

//     int res=0;
//     while(sum!=0){
//         int last2=sum%10;
//         res=res+last2;
//         sum=sum/10;
//     }

//     if(res==n){
//         System.out.print("Yes");
//     }
//     else{
//         System.out.print("not");
//     }

// }
// }

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//     int A = sc.nextInt();

//  int count = 0;
//  while (A != 0) {
//  if ((A & 1) == 0) {
//  count++;
//  }
//  A = A >> 1;
//  }
//  System.out.println(count);

// }
// }

//                            warehouse wala question

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     System.out.print(arr[0]);
//     int temp=arr[0];
//     for(int i=1;i<n;i++){
//         if(arr[i]<temp){
//             System.out.print(arr[i]);
//             temp=arr[i];
//         }
//     }

// }
// }

//                           max in array

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int max=Integer.MIN_VALUE;

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     for(int i=0;i<n;i++){
//         if(arr[i]>max){
//             max=arr[i];
//         }
//     }
//     System.out.print(max);

// }
// }

// import java.util.*;
// public class arrayPractice{

// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();
// int m=sc.nextInt();

// int arr[][]=new int[n][m];

// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         arr[i][j]=sc.nextInt();
//     }
// }

//       for(int i=0;i<n;i++){
//         int temp=arr[i][0];
//         arr[i][0]=arr[i][m-1];
//         arr[i][m-1]=temp;
//       }

//       for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             System.out.print(arr[i][j]+" ");
//         }
//         System.out.println();
//     }

// }
// }

// import java.util.Scanner;

// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     if(n%11==0){
//         System.out.println("11");
//     }

//     else if(n%3==0){
//         System.out.print("3");
//     }

//     else if(n%2==0){
//         System.out.print("2");
//     }
//     else{
//         System.out.print("-1");
//     }
// }
// }

//                      union of array

// import java.util.HashSet;
// import java.util.Scanner;

// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int m=sc.nextInt();
//     int arr[]=new int[n];
//     int arr2[]=new int[m];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     for(int i=0;i<m;i++){
//         arr2[i]=sc.nextInt();
//     }

//     HashSet<Integer>has=new HashSet<>();

//     for(int i=0;i<n;i++){
//         has.add(arr[i]);
//     }

//     for(int i=0;i<m;i++){
//         has.add(arr2[i]);
//     }

//     System.out.print(has.size());
// }
// }

// // import java.util.*;
// // public class arrayPractice{
// // public static void main (String args[]){

// //     Scanner sc=new Scanner(System.in);
// //     int n=sc.nextInt();

// //     int arr[]=new int[n];
// //     int arr2[]=new int[n];

// //     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     arr2[0]=arr[0];

//     for(int i=1;i<n;i++){
//         arr2[i]=arr2[i-1]+arr[i];
//     }

//     for(int i=0;i<n;i++){
//         System.out.print(arr2[i]+" ");
//     }

// }
// }

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int t=sc.nextInt();

//     while(t-->0){

//         int n=sc.nextInt();
//         int rem,rev=0;

//         while(n>0){

//             rem=n%10;
//             rev=rev*10+rem;
//             n=n/10;

//         }

//         System.out.print(rev);
//     }

// }
// }

// import java.util.*;

// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             for(int k=j+1;k<n;k++){
//                 if(arr[i]+arr[j]+arr[k]==0){
//                     System.out.print("1");
//                     return;
//                 }
//             }
//         }
//     }
//     System.out.print("0");
// }
// }

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     String str1=sc.nextLine();
//     String str2=sc.nextLine();

//     char[] c1=str1.toCharArray();
//     char[] c2=str2.toCharArray();

//     Arrays.sort(c1);
//     Arrays.sort(c2);

//     if(Arrays.equals(c1,c2)){
//        System.out.print("1");
//     }
//     else{
//         System.out.print("0");
//     }

// }
// }

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);
//     int run=sc.nextInt();
//     int over=sc.nextInt();

//     if(over==0){
//         System.out.print("java.lang.ArithmeticException");
//         return;
//     }

//     int rate=run/over;
//     float res=(float)rate;
//     System.out.print(String.format("%.2f",res));
// }
// }



// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner (System.in);
//     int choice=sc.nextInt();
//     // int over=sc.nextInt();

//     if(choice==1){
//         double a=sc.nextDouble();
//         double b=sc.nextDouble();

//         double perimeter=2*(a+b);
//         double area=a*b;

//         System.out.println("Perimeter"+ String.format("%.2f",perimeter));
//         System.out.print("Area"+String.format("%.2f",area));
//     }

//     else if(choice==2){
//         double b=sc.nextDouble();
//         // double c=sc.nextDouble();

//         double area=3.14*b*b;
//         double circum=2*3.14*b;

//         System.out.println(area);
//         System.out.print(circum);
//     }

//     else{
//         System.out.print("Invalid");
//     }

// }
// }




// import java.util.Scanner;
// public class arrayPractice
// {
// public static void main(String[] args)
// {
//  Scanner sc = new Scanner(System.in);
//  String str = sc.nextLine();
//  System.out.println(str.trim());
// }
// }

// import java.util.Scanner;

// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();
//     int d=n%10;

//     if(n==0){
//         System.out.print("0");
//     }

//     else if(d>5){
//         int k=10-d;
//         int p=n+k;

//         System.out.print(p);
//     }

//     else if(d<5){
//         int r=n-d;
//         System.out.print(r);
//     }

// }
// }

// import java.util.*;

// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int a=sc.nextInt();
//     int b=sc.nextInt();

//     int k=a-b;

//     if(a>b){
//         System.out.print("Withdrawal successful"+" ");
//         System.out.print(k+".0"); 
//     }

//     else{
//         System.out.print("Withdrawal Successful");
//     }
// }
// }

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     String str=sc.nextLine();

//     // String str2="";

//     for(int i=0;i<str.length();i++){
//         if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){

//             System.out.print(str.charAt(i));

//         }
//     }

// }
// }

// import java.util.*;
// public class arrayPractice{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     String str=sc.nextLine();
//     String str2="";

//     for(int i=0;i<str.length();i++){

//         if(i%2==0){
//             str2=str2+str.charAt(i);
//         }
//     }

//     for(int i=0;i<str.length();i++){

//         if(i%2!=0){
//             str2=str2+str.charAt(i);
//         }

//     }

//     System.out.print(str2);

// }
// }

import java.util.*;
public class arrayPractice{
public static void main (String args[]){

     Scanner sc=new Scanner(System.in);

     int n=sc.nextInt();

     int arr[]=new int[n];

     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;

     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }

     for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
     }

     System.out.println("max is " + max);

     for(int i=0;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
        }
     }

     System.out.println("Minimum is " + min);

     int ans=arr[0];

     for(int i=1;i<n;i++){

        ans=ans-arr[i];

     }

     System.out.print(ans);
}
}

//import java.util.*;

// public class arrayPractice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         int maxlen = 0;
//         int n = str.length();
//         for (int i = 0; i < n; i++) {
//             boolean visited[] = new boolean[256];
//             for (int j = i; j < n; j++) {
//                 char ch = str.charAt(j);
//                 if (visited[ch]) {
//                     break;
//                 }
//                 visited[ch] = true;
//                 maxlen = Math.max(maxlen, j - i + 1);
//             }
//         }
//         System.out.print(maxlen);
//     }
// }




// import java.util.*;

// public class arrayPractice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int num=sc.nextInt();
//         int ans=0;
//         for(int i=0;i<num;i++){
           
//             char ch=sc.next().charAt(0);
//             int count=0;

//             for(int j=0;j<str.length();j++){
//                 if(str.charAt(j)==ch){
//                     count++;
//                 }
//             }
//             int temp=count*(int)ch;
//               ans=ans+temp;
//         }
//         System.out.print(ans);
//     }
// }

// import java.util.Scanner;

// public class arrayPractice{
// public static void main (String args[]){

//       Scanner sc=new Scanner(System.in);
//       String str=sc.nextLine();

//       int count=0;

//       for(int i=0;i<str.length();i++){
//         if(str.charAt(i)==' '){
//             count++;
//         }
//       }

//       System.out.print(count+1 +" ");

//       System.out.print(str.charAt(0));
//       System.out.print((int)str.charAt(0)+" ");
//       for(int i=1;i<str.length();i++){
    
//         if(str.charAt(i)==' '){
//             System.out.print(str.charAt(i+1));
//             System.out.print((int)str.charAt(i+1)+" ");
//         }
//       }
// }
// }


// import java.util.Scanner;

// public class arrayPractice{
// public static void main (String args[]){

//       Scanner sc=new Scanner(System.in);
//       String str=sc.nextLine();

//       int count=0;

//       for(int i=0;i<str.length();i++){
//         if(str.charAt(i)==' '){
//             count++;
//         }
//       }

//       System.out.print(count+1 +" ");


//       System.out.print(str.charAt(0));
//       System.out.print((int)str.charAt(0)+" ");
//       for(int i=1;i<str.length();i++){
//         if(str.charAt(i)==' '){
//             System.out.print(str.charAt(i+1));
//             System.out.print((int)str.charAt(i+1)+" ");
//         }
//       }
// }
// }