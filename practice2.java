import java.util.*;
public class practice2{
public static void main (String args[]){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int binary=0;
int place=1;

while(n!=0){

    int rem=n%2;
    binary=rem*place+binary;
    place=place*10;
    n=n/2;
}

System.out.print(binary);

}
}




// import java.util.*;
// public class practice2{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();


// for(int i=a+1;i<b;i++){
//     int count=0;
//    int temp=i;

//    while(temp!=0){
//      count++;
//      temp=temp/10;
//    }
   
//    temp=i;
//    int sum=0;
//    while(temp!=0){
    
//    int last=temp%10;

//    sum+=Math.pow(last,count);

//    temp=temp/10;

//    }

//    if(sum==i){
//     System.out.print(i);
//    }

// }

// }
// }


// import java.util.*;
// public class practice2{
// public static void main (String args[]){
    
//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     int temp=n;
  
//     int sum=temp*temp;
//     int sum2=0;
//     while(sum!=0){
//         int last=sum%10;
//         sum2=sum2+last;
//         sum=sum/10;
//     }

//     if(sum2==n){
//         System.out.println("yes");
//     }
//     else{
//         System.out.println("No");
//     }

// }
// }


// import java.util.*;
// public class practice2{
// public static void main (String args[]){

   
//     Scanner sc=new Scanner(System.in);
    
//     int n=sc.nextInt();
//     int count=0;
//     while(n!=0){
//         if((n&1)==0){
//              count++;
//         }
//         n=n>>1;
//     }
//     System.out.print(count);

   
// }

// }


// import java.util.*;
// public class practice2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     int max=Integer.MIN_VALUE;
//     int min=Integer.MAX_VALUE;

//     for(int i=0;i<n;i++){
//         if(arr[i]>max){
//             max=arr[i];
//         }
//     }

//     System.out.print("Max is " + max);


//     for(int i=0;i<n;i++){
//         if(arr[i]<min){
//             min=arr[i];
//         }
//     }

//     System.out.print("Min is " + min);
 
    
//     int ans=arr[0];

//     for(int i=1;i<n;i++){
//         ans=ans-arr[i];
//     }
//     System.out.print(ans);

//     if(ans>0){
//         System.out.print("Subtraction result is greater than or equal to Zero");
//     }

//     else{
//         System.out.print("Subtraction result is less than Zero");
//     }

// }

// }




//  import java.util.*;
// public class practice2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     int temp=arr[0];
//     System.out.print(arr[0]);
//    for(int i=1;i<n;i++){
//      if(arr[i]<temp){
//         System.out.print(arr[i]);
//         temp=arr[i];
//      }
//    }


// }

// }









// import java.util.*;
// public class practice2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int m=sc.nextInt();
//     int arr[][]=new int[n][m];

//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             arr[i][j]=sc.nextInt();
//         }
//     }

//     for(int i=0;i<n;i++){
//         int temp=arr[i][0];
//         arr[i][0]=arr[i][m-1];
//         arr[i][m-1]=temp;
//     }
    

//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             System.out.print(arr[i][j]);;
//         }
//         System.out.println();
//     }

// }

// }







// import java.util.HashSet;
// import java.util.*;
// public class practice2{
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

// System.out.print(has.size());

// }
// }

// import java.util.*;
// public class practice2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     int arr[]=new int[n];

    
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
     
//     int sum=0;
//     for(int i=0;i<n;i++){
//         sum=sum+arr[i];
//         System.out.print(sum+" ");
//     }

// }
// }



// import java.util.*;
// public class practice2{
// public static void main (String args[]){


//     Scanner sc=new Scanner(System.in);
//     int t=sc.nextInt();

//     while(t-->0){
//         int n=sc.nextInt();

//         int rem;
//         int rev=0;

//         while(n!=0){
//             rem=n%10;
//             rev=rev*10+rem;
//             n=n/10;
//         }

//         System.out.print(rev);
//     }
// }
// }


// import java.util.*;
// public class practice2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     int arr[]=new int[n];

    
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
     
//     int cs=0;
//     int ms=Integer.MIN_VALUE;

//     for(int i=0;i<n;i++){

//         if(cs<0){
//             cs=0;
//         }

//         cs=cs+arr[i];

        

//     ms=Math.max(cs,ms);

//     }

//     System.out.print(ms);

// }
// }








// import java.util.*;
// public class practice2{
// public static void main (String args[]){
    
//     Scanner sc=new Scanner(System.in);
//     String str=sc.nextLine();
//     String str2=sc.nextLine();

//     char []ch=str.toCharArray();
//     char []ch2=str2.toCharArray();

//     Arrays.sort(ch);
//     Arrays.sort(ch2);

//     if(Arrays.equals(ch,ch2)){
//         System.out.print("1");
//     }
//     else{
//         System.out.print("0");
//     }

// }
// }

// import java.util.Scanner;

// public class practice2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);
//     String str=sc.nextLine();

//     System.out.print(str.trim());
// }
// }

// import java.util.*;
// public class practice2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     ArrayList<String>list= new ArrayList<>();

//     for(int i=0;i<n;i++){
//         String s=sc.nextLine();
//         list.add(s);
//     }

//     Collections.sort(list);
      
//     for(int i=0;i<list.size();i++){
//         System.out.print(list.get(i));
//     }
// }
// }



// import java.util.*;
// public class practice2{
// public static void main (String args[]){

//   Scanner sc=new Scanner(System.in);

//   String str1=sc.nextLine();
//   String str2=sc.nextLine();

//   char ch1[]=str1.toCharArray();
//   char ch2[]=str2.toCharArray();


//   Arrays.sort(ch1);
//   Arrays.sort(ch2);

//   if(Arrays.equals(ch1,ch2)){
//     System.out.print(str1 + str2 + "are anagram");
//   }

// }
// }

// import java.util.*;
// public class practice2{
// public static void main (String args[]){


//     Scanner sc=new Scanner(System.in);

//     String str=sc.nextLine();

//     for(int i=0;i<str.length();i++){
//         if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
//             System.out.print(str.charAt(i));
//         }
//     }

// }
// }



//                                    

// import java.util.*;
// public class practice2{
// public static void main (String args[]){

//   Scanner sc=new Scanner(System.in);
//   int a=sc.nextInt();
//   int b=sc.nextInt();

//   for(int i=a+1;i<b;i++){

//     int temp=i;
//     int count=0;

//     while(temp!=0){
//         count++;
//         temp=temp/10;
//     }

//     temp=i;
//     int sum=0;

//     while(temp!=0){
//         int last=temp%10;
//         sum+=Math.pow(last,count);
//         temp=temp/10;
//     }
//     if(sum==i){
//     System.out.print(i);
//     }
//   }

// }
// }



// import java.util.*;
// public class practice2{
// public static void main (String args[]){

//      Scanner sc=new Scanner(System.in);
//      String str=sc.nextLine();
//      int n=sc.nextInt();
//      int ans=0;
//      for(int i=0;i<n;i++){

//         char ch=sc.next().charAt(0);

//         int count=0;

//         for(int j=0;j<str.length();j++){
//             if(str.charAt(j)==ch){
//                 count++;
//             }
//         }
//         int temp=count*(int)ch;
//          ans=ans+temp;
//      }

//      System.out.print(ans);

//     }
// }


// import java.util.*;
// public class practice2{
// public static void main (String args[]){
//   Scanner sc=new Scanner (System.in);

//   String str=sc.nextLine();
  
//   String str5=str.split();

//   Stack<String>str2=new Stack<>();
// }
// }