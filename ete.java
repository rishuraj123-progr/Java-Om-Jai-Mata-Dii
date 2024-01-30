
//                               remove duplicate characters from the string 

//  import java.util.*;
// class ete {
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         String str="hey geeeeek hooow areee youuuu";

//         String newS="";
//         int i=0;
//         int j=0;

//         while(j<str.length()){

//             if(str.charAt(i)==str.charAt(j)){
//                 j++;
//             }

//             else if(str.charAt(i) !=str.charAt(j) || j==str.length()-1){
//                 newS=newS+str.charAt(i);
//                 i=j;
//                 j++;
//             }
//         }
//         newS=newS+str.charAt(j-1);

//         System.out.print(newS+"");

//     }

// }

//                               toggle case

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     String str=sc.next();

//     for(int i=0;i<str.length();i++){
//         char ch=str.charAt(i);

//         if(ch>=65 && ch<=91){
//             System.out.print((char)(ch+32));
//         }
//         else{
//             System.out.print((char)(ch-32));

//         }
//     }
// }
// }

//                                                                    find max , min , diff

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     Arrays.sort(arr);

//     System.out.println(arr[0]);
//     System.out.println(arr[n-1]);

//     int sum=arr[0];

//     for(int i=1;i<n;i++){
//         sum=sum-arr[i];
//     }

//     System.out.println(sum);
// }
// }

//                                                 find kth element from end of a linked list

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     LinkedList<Integer>list=new LinkedList<>();

//     while(true){
//         int n=sc.nextInt();

//         if(n==-1){
//             break;
//         }

//         list.add(n);
//     }

//     int key=sc.nextInt();

//     int element=list.size()-key;

//     System.out.println(list.get(element));
// }
// }

//                                                  rosesssssssssssssssss

// import java.util.*;
// public class ete{

// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int t=sc.nextInt();

//     while(t-->0){

//         int n=sc.nextInt();

//         int arr[]=new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int target=sc.nextInt();

//         int min=Integer.MAX_VALUE;
//         int ans=0;
//         int ans2=0;

//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(arr[i]+arr[j]==target && Math.abs(arr[i]-arr[j])<min){
//                     ans=arr[i];
//                     ans2=arr[j];

//                     min=Math.abs(arr[i]-arr[j]);
//                 }
//             }
//         }
//         System.out.println(ans+" "+ans2);

//     }   

// }
// }

// // import java.util.*;
// // class HelloWorld {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         String str = sc.next();

// //         String newstr = "";

// //         for(int i=0;i<str.length();i++){
// //             Integer cnt = 1;
// //             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
// //                 i++;
// //                 cnt++;
// //             }
// //             newstr += str.charAt(i);
// //             if(cnt>0){
// //                 newstr += cnt.toString();
// //             }
// //         }
// //         System.out.print(newstr);
// //     }
// // }

// import java.util.*;
// public class ete{

//     public static void print(String str){

//         int count=0;

//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<=str.length();j++){
//                if(isPalindrome(str.substring(i, j))){
//                 count++;
//                }
//             }
//         }
//         System.out.print(count);
//     }

//     public static boolean isPalindrome(String str){

//         for(int i=0;i<str.length()/2;i++){
//             if(str.charAt(i)!=str.charAt(str.length()-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }

// public static void main (String args[]){
//    Scanner sc=new Scanner(System.in);

//    String str=sc.next();

//       print(str);
// }
// }

//                                           next greater element

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     int arr[]=new int[n];
//     int arr2[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     Stack<Integer>s=new Stack<>();

//     for(int i=arr.length-1;i>=0;i--){

//         while(!s.isEmpty() && arr[s.peek()]<arr[i]){
//             s.pop();
//         }

//         if(s.isEmpty()){
//             arr2[i]=-1;
//         }
//         else{
//             arr2[i]=arr[s.peek()];
//         }

//         s.push(i);
//     }

//     for(int i=0;i<n;i++){
//         System.out.print(arr2[i]+" ");
//     }
// }
// }

//                                        good string

// import java.util.*;
// public class ete{
// public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);

//         String str=sc.next();

//         int count=0;
//         int max=0;

//         for(int i=0;i<str.length();i++){

//             char ch=str.charAt(i);

//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                 count++;
//                 max=Math.max(count,max);
//             }

//             else{
//                 count=0;
//             }

//         }

//         System.out.print(max);
// }
// }

// longest substring

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         String str=sc.nextLine();

//         int count=0;
//         int max=0;

//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);

//             if(ch>=65 && ch<=91 || ch>=97 && ch<=123){
//                 count++;
//                 max=Math.max(max, count);
//             }
//             else{
//                 count=0;
//             }
//         }

//         System.out.print(max);

// }
// }

//                            Removing Duplicate Characters from a String.

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         String str=sc.nextLine();

//         String str1="";

//         for(int i=0;i<str.length()-1;i++){
//             if(str.charAt(i)!=str.charAt(i+1)){
//                 str1+=str.charAt(i);
//             }
//         }
// str1+=str.charAt(str.length()-1);
//         System.out.print(str1);
// }
// }

//                                               fresh groceries

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     int key=sc.nextInt();

//     int arr[]=new int[n];
//     int arr2[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     for(int i=0;i<n;i++){
//         arr2[i]=sc.nextInt();
//     }

//     int sum=0;

//     for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//           if(arr[i]>=key){
//             sum=sum+arr2[j];
//           }
//         }
//     }

//     System.out.print(sum);

// }
// }

//                                      alice and bob

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class ete
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{

//       Scanner sc=new Scanner(System.in);

//       int t=sc.nextInt();

//       while(t-->0){

//           int n=sc.nextInt();

//           int bob[]=new int[n];
//           int ali[]=new int[n];

//           for(int i=0;i<n;i++){
//               bob[i]=sc.nextInt();
//           }

//           for(int i=0;i<n;i++){
//               ali[i]=sc.nextInt();
//           }

//           int count=0;

//           for(int i=0;i<n;i++){
//               if(ali[i]<=2*bob[i] && bob[i]<=2*ali[i]){
//                   count++;
//               }
//           }

//           System.out.print(count);

//       }

// 	}
// }

//                                          message processing 

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     String str=sc.nextLine();

//     String str1="";

//     for(int i=0;i<str.length();i++){
//         char ch = str.charAt(i);
//         if(i==0){
//             str1+=Character.toUpperCase(ch);
//         }
//         else if(i>0 && str.charAt(i)>=65 && str.charAt(i)<=91 || str.charAt(i)>=97 && str.charAt(i)<=123){
//             str1=str1+str.charAt(i);
//         }
//     }
//     System.out.print(str1);
// }
// }

//                  greater  value --> electronic

// import java.util.*;

// public class ete {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         String str1 = "";

//         for(int i=1;i<str.length()-1;i++){
//             char curr=str.charAt(i);
//             char prev=str.charAt(i-1);

//             int asci=(int)curr;
//             int asci2=(int)prev;

//             if(asci>asci2){
//                 str1=str1+curr;
//             }
//             else{
//                 str1=str1+prev;
//             }
//             i++;

//         }

//         // for the last two indexes

//         char ch = str.charAt(str.length()-2);
//         int asi = (int)ch;
//         char chh = str.charAt(str.length()-1);
//         int as = (int)chh;
//         if(asi>as){
//             str1 = str1+ch;
//         }
//         else{
//             str1=str1+chh;
//         }

//         System.out.print(str1);

//     }
// }

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     String str=sc.next();

//     int id=sc.nextInt();
//     if(id<0){
//         System.out.print("Invalid Id");
//     }
//      else{
//     double salary=sc.nextDouble();
//     if(salary<0){
//         System.out.print("Invalid Salary");
//     }
// }

// }
// }

//                                                  song wala question

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     String Playlist[]=new String[n];

//     for(int i=0;i<n;i++){
//         Playlist[i]=sc.next();
//     }

//     String target=sc.next();

//     Arrays.sort(Playlist);

//     int s=0;
//     int e=Playlist.length-1;

//     while(s<=e){

//         int mid=s+(e-s)/2;

//         int result=target.compareTo(Playlist[mid]);

//         if(result==0){
//             System.out.print(mid);
//             return;
//         }

//         else if(result<0){
//             e=mid-1;
//         }
//         else{
//             s=mid+1;
//         }

//     }

//     System.out.println("-1");
// }
// }

//                                             software engineer      insert * in the index

// import java.util.*;

// public class ete {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         String str = sc.next();
//         int n = sc.nextInt(); // Index for the first asterisk
//         int m = sc.nextInt(); // Index for the second asterisk

//         StringBuilder str2 = new StringBuilder(str);

//         if (n < str.length()) {
//             str2.insert(n, '*');
//         }
//         if (m < str.length()) {
//             str2.insert(m+1, '*');
//         }

//         System.out.print(str2);

//     }
// }

//                                                     electronics wala

// import java.util.*;
// public class ete{
// public static void main (String args[]){
//     Scanner sc=new Scanner(System.in);

//     String str1=sc.next();
//     String str2="";

//     for(int i=1;i<str1.length()-1;i+=2){
//         char curr=str1.charAt(i);
//         char prev=str1.charAt(i-1);

//         if(curr<prev){
//                 str2=str2+prev;
//         }
//         else{
//                 str2=str2+curr;
//         }

// }
//         str2=str2+str1.charAt(str1.length()-1);

//         System.out.print(str2);

// }
// }

//                                      valid parenthesis

// import java.util.*;
// public class ete{

//         public static boolean isValid(String str){

//                  String str2="";

//                  for(int i=0;i<str.length();i++){
//                         char ch=str.charAt(i);

//                         if(ch=='{' || ch=='(' || ch=='[' || ch=='}' || ch==')' || ch==']'){
//                                 str2=str2+ch;
//                         }
//                  }

//                  Stack<Character>s=new Stack<>();

//                  for(int i=0;i<str2.length();i++){

//                         char chh=str2.charAt(i);

//                         if(chh=='(' || chh=='{' || chh=='['){
//                                 s.push(chh);
//                         }
//                                 else{

//                                         if(s.isEmpty()){
//                                                 return false;
//                                         }

//                                         if(s.peek()=='(' && chh==')' || s.peek()=='{' && chh=='}' || s.peek()=='[' && chh==']'){
//                                              s.pop();
//                                         }
//                                         else{
//                                                 return false;
//                                         }
//                                 }

//                 }

//                  if(s.isEmpty()){
//                         return true;
//                  }
//                  else{
//                         return false;
//                  }
//         }
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         String str=sc.nextLine();

//        System.out.print(isValid(str));

// }
// }

/////                           madhav -------->         3K+2

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();
//         int m=sc.nextInt();

//         int count=0;
//         int k=1;

//         while(count<n){

//                 int p=3*k+2;

//                 if(p%m!=0){
//                         System.out.println(p);
//                         count++;
//                 }
//                 k++;

//         }

// }
// }

//                           hcf 

// import java.util.Scanner;

// public class ete {
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();
//         int m=sc.nextInt();

//         for(int i=1;i<n*m;i++){
//                 if(i%n==0 && i%m==0){
//                        System.out.print(i); 
//                        break;
//                 }
//         }
//     }
// }

//                                       sum to zero

// public class ete {
//    public static void main(String[] args) {
//       // The array elements
//       int arr[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
//       System.out.println("Subarrays with sum equal to 0 are:");

//       // Loop through all possible subarrays
//       for (int i = 0; i < arr.length; i++) {
//          int sum = 0;
//          for (int j = i; j < arr.length; j++) {
//             sum += arr[j];
//             if (sum == 0) {
//                for (int k = i; k <= j; k++) {
//                   System.out.print(arr[k] + " ");
//                }
//                System.out.println();
//             }
//          }
//       }
//    }
// }

//                                       space preservation

// import java.util.*;
// public class ete{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);

//  String str=sc.nextLine();

//  char ch[]=str.toCharArray();

//  int s=0;
//  int e=str.length()-1;

//  while(s<e){
//         if(ch[s]==' '){
//             s++;
//         }
//         else if(ch[e]==' '){
//                 e--;
//         }
//         else{
//                 char temp=ch[s];
//                 ch[s]=ch[e];
//                 ch[e]=temp;
//                 s++;
//                 e--;
//         }
//  }

//  System.out.println(String.valueOf(ch));

// }
// }

//                                          substring of string

// import java.util.*;
// public class ete{
// public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         String str=sc.next();

//         for(int i=0;i<str.length();i++){
//                 for(int j=i+1;j<=str.length();j++){
//                         String ss=str.substring(i, j);
//                         System.out.println(ss);
//                 }
//         }

// }
// }

//                               remove string from -- kiwi wala

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         LinkedList<String>list1=new LinkedList<>();
//         LinkedList<String>list2=new LinkedList<>();

//         for(int i=0;i<n;i++){
//               list1.add(sc.next());
//         }

//         String key=sc.next();

//         for(int i=0;i<n;i++){
//                 if(list1.get(i).compareTo(key)>0){
//                         list2.add(list1.get(i));
//                 }
//         }

//         System.out.print(list2);
// }
// }

//                                       index of the substring found

// import java.util.ArrayList;
// import java.util.Scanner;

// public class ete{
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         String str=sc.nextLine();

//         String key=sc.nextLine();

//         ArrayList<Integer>list=new ArrayList<>();

//         for(int i=0;i<=str.length()-key.length();i++){

//                 String s=str.substring(i,i+key.length());

//                 if(s.equals(key)){
//                         list.add(i);
//                 }
//         }
//         if(list.isEmpty()){
//                 System.out.print("-1");
//         }
//         else{
//                 System.out.print(list);
//         }
// }
// }

//                                                          good arrays

// import java.util.*;
// class ete {
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         int key=sc.nextInt();

//         int arr[]=new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//                 int count=0;        

//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                    Set<Integer>st=new HashSet<>();

//                 for(int k=i;k<=j;k++){
//                     st.add(arr[k]);
//                 }
//                 if(st.size()==key){
//                     count++;
//             }

//             }
//         }

//         System.out.print(count);
//     }
// }

///                              biggest number

// import java.util.*;
// class ete{
//     public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);

//        int t=sc.nextInt();

//        while(t-->0){
//         int n=sc.nextInt();

//        long arr[]=new long[n];

//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextLong();
//        }

//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1;j++){
//                long ab=Long.parseLong(arr[j]+""+arr[j+1]);
//                long ba=Long.parseLong(arr[j+1]+""+arr[j]);           

//            if(ab<ba){
//                long temp=arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;

//            }

//        }

//        }

//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]);
//        }
//        }

//     }
// }

//                                                                   make the array same

// import java.util.*;
// public class ete{

//         public static boolean isValid(int arr[],int n){

//                 for(int i=0;i<n;i++){

//                 while(arr[i]%2==0){
//                         arr[i]/=2;
//                 }

//                 while(arr[i]%3==0){
//                         arr[i]/=3;
//                 }

//         }

//         for(int i=1;i<n;i++){
//                 if(arr[i]==arr[0]){
//                        return true;
//                 }
//         }
//             return false;
//         }
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         int arr[]=new int[n];

//         for(int i=0;i<n;i++){
//                 arr[i]=sc.nextInt();
//         }

//         if(isValid(arr,n)){
//                 System.out.print("Yes");
//         }
//         else{
//                 System.out.print("No");
//         }

// }
// }

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         int m=sc.nextInt();

//         int rem=0;
//         // int rev;

//         for(int i=m;i>=n;i--){

//          rem=i%10;
//          int b=m/10;

//          if(rem>b){
//                 System.out.print(m);
//                 break;
//          }

//         }

// }
// }

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         String arr[][]=new String[n][3];

//         for(int i=0;i<n;i++){
//                 for(int j=0;j<3;j++){
//                         arr[i][j]=sc.next();
//                 }
//         }

//         String str=sc.next();

//         boolean found=false;

//         for(int i=0;i<n;i++){
//                 if(arr[i][0].equals(str)){
//                         for(int j=0;j<3;j++){
//                                 System.out.println(arr[i][j]);
//                         }
//                         found=true;
//                         break;
//                 }
//         }

//         if(found==false){
//                 System.out.print("-1");
//         }

// }
// }

// import java.util.*;
// public class ete{

//         public static boolean isValid(int arr[],int n){

//                  for(int i=0;i<n;i++){
//                 while(arr[i]%2==0){
//                         arr[i]/=2;
//                 }

//                 while(arr[i]%3==0){
//                         arr[i]/=3;
//                 }
//         }

//         for(int i=1;i<n;i++){
//                 if(arr[i]==arr[0]){
//                         return true;
//                 }
//         }
//         return false;
//         }
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         int arr[]=new int[n];

//         for(int i=0;i<n;i++){
//                 arr[i]=sc.nextInt();
//         }

//         if(isValid(arr, n)){
//                 System.out.println("Yes");
//         }
//         else{
//                 System.out.println("No");
//         }

// }
// }

// import java.util.*;
// public class ete{
// public static void main (String args[]){

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         char arr[][]=new char[n][10];

//         for(int i=0;i<n;i++){
//                 for(int j=0;j<10;j++){
//                         arr[i][j]=sc.next().charAt(0);
//                 }
//         }

//         char keys[]={'D','B','D','C','C','D','A','E','A','D'};

//         for(int i=0;i<n;i++){
//             int count=0;

//             for(int j=0;j<10;j++){
//                 if(arr[i][j]==keys[j]){

//                         count++;

//                 }
//             }
//                 System.out.println(count);
//         }

// }
// }

// import java.util.*;
// import java.util.*;
// public class ete{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();

//            LinkedList<Character>list1=new LinkedList<>();
//            LinkedList<Character>list2=new LinkedList<>();

//            for(int i=0;i<n;i++){
//                 list1.add(sc.next());
//            }

//            String str=sc.next();

//            for(int i=0;i<n;i++){
//                 if(list1.get(i).compareTo(str)>0){

//                 }
//            }
// }
// }

import java.util.*;

public class ete {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);

                int length = 0;

                LinkedList<Integer> list = new LinkedList<>();
                while (true) {
                        int n = sc.nextInt();
                        if (n == -1) {
                                break;
                        }

                        list.add(n);
                        length++;
                }

                int key = sc.nextInt();

                System.out.println(list.get(length - key));
        }
}