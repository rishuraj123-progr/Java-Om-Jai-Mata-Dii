
import java.util.*;




//                     form biggest number from the given array
                               
                             //          i,j=0 to n-1

// public class ete2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     long arr[]=new long[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextLong();
//     }

//     for(int i=0;i<n-1;i++){
//         for(int j=0;j<n-1;j++){
 
//             long ab=Long.parseLong(arr[j]+""+arr[j+1]);
//             long ba=Long.parseLong(arr[j+1]+""+arr[j]);

//             if(ba>ab){
//                 long temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//             }
//         }
//     }

//     for(int i=0;i<n;i++){
//         System.out.print(arr[i]);
//     }
    
// }
// }




// public class ete2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();
//     int m=sc.nextInt();

//     String str=sc.next();


//     StringBuilder str1=new StringBuilder(str);


//     if(n<str.length()){
//         str1.insert(n,'*');
//     }

//     if(m<str.length()){
//         str1.insert(m+1,'*');
//     }


//     System.out.print(str1);

// }
// }




//                         good subarray



// public class ete2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     int m=sc.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     int count=0;
    

//     for(int i=0;i<arr.length;i++){
//         for(int j=i;j<arr.length;j++){
//             HashSet<Integer>seta=new HashSet<>();
//             for(int k=i;k<=j;k++){
//               seta.add(arr[k]);
//             }
//             if(seta.size()==m){
//                 count++;
//             }

//         }
//     }
//     System.out.print(count);
// }
// }



//                                             make equal --> 75 150 75 50



// public class ete2{


//     public static boolean isValid(int arr[],int n){
//          for(int i=0;i<n;i++){

//         while(arr[i]%2==0){
//             arr[i]/=2;
//         }

//         while(arr[i]%3==0){
//             arr[i]/=3;
//         }
//     }

//     for(int i=1;i<n;i++){
//         if(arr[i]==arr[0]){
//                 return true;
//         }
//     }

//     return false;
//     }
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();
    
//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//    if(isValid(arr,n)){
//     System.out.print("Yes");
//    }
//    else{
//     System.out.print("No");
//    }


// }
// }



// public class ete2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     String arr[]=new String[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.next();
//     }

//     Arrays.sort(arr);
//     String str=sc.next();
//     boolean found=false;

//     for(int i=0;i<n;i++){
//         if(arr[i].equals(str)){
//             System.out.print(i);
//             found=true;
//             break;
//         }
//     }

//     if(found==false){
//         System.out.print("No");
//     }

// }
// }




     ///                       rahu 85647956 rahul@gmail.com





// public class ete2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     String arr[][]=new String [n][3];

//     for(int i=0;i<n;i++){
//         for(int j=0;j<3;j++){
//           arr[i][j]=sc.next();
//         }
//     }

//     String str=sc.next();

//     boolean found=false;

//     for(int i=0;i<n;i++){
//         if(arr[i][0].equals(str)){
//         for(int j=0;j<3;j++){
//                 System.out.println(arr[i][j]);
//             }
//             found=true;
//                 break;
//         }
//     }

//     if(found==false){
//         System.out.println("-1");
//     }
// }
// }








//                              Te*stsS*tring

//      make a string builder and usme apna original string daalna



// public class ete2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();
//     int m=sc.nextInt();

//     String str=sc.next();

//     StringBuilder str2=new StringBuilder(str);

    
//     if(n<str.length()){
//         str2.insert(n,'*');
//     }

//     if(m<str.length()){
//         str2.insert(m+1, '*');
//     }


//     System.out.print(str2);



// }
// }







//                                lucky number

//                     371  is a lucky number  but not 372 


// public class ete2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     int count=0;
//     int x=n;
//     int y=n;

//     int sum=0;


//     while(x--!=0){
//        count++;
//        x=x/10;
//     }

//     while(y>0){
        
//         int rem=y%10;
        
//         sum=sum+(int)Math.pow(rem, count);
//         y=y/10;
//     }

//     if(sum==n){
//         System.out.print("Yes");
//     }
//     else{
//         System.out.print("No");
//     }


// }
// }



//                                  matching mcq answers

// public class ete2{
// public static void main (String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();

//     char arr[][]=new char[n][10];

//     for(int i=0;i<n;i++){
//         for(int j=0;j<10;j++){
//             arr[i][j]=sc.next().charAt(0);
//         }
//     }

//     char keys[]={'D','B','D','C','C','D','A','E','A','D'};


//     for(int i=0;i<n;i++){
//         int count=0;
//         for(int j=0;j<10;j++){
//             if(arr[i][j]==keys[j]){
//                 count++;
//             }
//         }
//         System.out.print(count);
//     }

    
// }
// }





//                                      kth element from enddddd




// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;
// class ete {
//     public static void main(String[] args) {
       
//        Scanner sc=new Scanner(System.in);
       
//        LinkedList<Integer>ll=new LinkedList<>();
       
//        int length=0;
//        while(true){
           
           
//            int n=sc.nextInt();
          
//            if(n==-1){
//                break;
//            }
           
//            ll.add(n);
           
//             length++;    
           
//        }
       
//        int k=sc.nextInt();
       
       
//       System.out.print(ll.get(length-k));
       
       
       
       
       
//     }
// }




//                                          hcf wala

// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);

//    int n=sc.nextInt();
//    int m=sc.nextInt();

//    for(int i=2;i<m*n;i++){
//     if(i%n==0 && i%m==0){
//         System.out.print(i);
//         break;
//     }
//    }


// }
// }



//                  10 and 00 to be removed



// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);

//        int t=sc.nextInt();

//        while(t-->0){

//         String str=sc.next();
        

//         str=str.replace("10","");
//         str=str.replace("00","");


//         System.out.print(str.length());
//        }
// }
// }





//                                 3k+2 wala


// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
        
         
//        int n=sc.nextInt();
//        int m=sc.nextInt();

//        int count=0;
//        int k=1;

//        while(count<n){

//         int p=(3*k)+2;

//         if(p%m!=0){
//             System.out.println(p);
//             count++;
//         }
//         k++;
//        }

// }
// }



// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
       
//      int n=sc.nextInt();

//      int x=sc.nextInt();


//      int arr[]=new int[n];

//      for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//      }

//      int count=0;

//      for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//             HashSet<Integer>seta=new HashSet<>();
//             for(int k=i;k<=j;k++){
//                 seta.add(arr[k]);
//             }

//             if(seta.size()==x){
//                 count++;
//             }
//         }
//      }
//      System.out.print(count);
// }
// }




//                            valid parenthesis


// import java.util.*;
// public class ete2{

//     public static boolean isValid(String str){

//         String str2="";

//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch=='(' || ch==')' || ch=='{' || ch=='}' || ch=='[' || ch==']'){
//                 str2=str2+ch;
//             }

//             }

//              Stack<Character>s=new Stack<>();


//             for(int j=0;j<str2.length();j++){
//                  char ch=str2.charAt(j);
//                 if(ch=='('  || ch=='{' || ch=='['){
//                     s.push(ch);
//                 }

//                 else{
//                     if(s.isEmpty()){
//                         return false;
//                     }

//                     if(s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']'){
//                            s.pop();
//                     }
//                     else{
//                         return false;
//                     }
//                 }

//         }
//          if(s.isEmpty()){
//                     return true;
//                 }
//                 else{
//                     return false;
//                 }

//     }
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
        
//         String str=sc.nextLine();

//         System.out.print(isValid(str));

// }
// }



///                                 triplet sum of linkedlist


// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
      
//       int n=sc.nextInt();
//       int m=sc.nextInt();
//       int o=sc.nextInt();

//       int arr1[]=new int[n];
//       int arr2[]=new int[m];
//       int arr3[]=new int[o];

//       for(int i=0;i<n;i++){
//         arr1[i]=sc.nextInt();
//       }
//       for(int i=0;i<n;i++){
//         arr2[i]=sc.nextInt();
//       }
//       for(int i=0;i<n;i++){
//         arr3[i]=sc.nextInt();
//       }

//       int target=sc.nextInt();

//       boolean flag=true;


//       for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             for(int k=0;k<o;k++){
//                 if(arr1[i]+arr2[j]+arr3[k]==target){
//                     System.out.print(arr1[i]+" "+arr2[j]+" "+ arr3[k]);
//                     flag=false;
//                     break;
//                 }
//             }
//             if(!flag){
//                 break;
//             }
//         }
//         if(!flag){
//                 break;
//             }

//       }

//       if(flag){
//         System.out.print("-1");
//       }

// }
// }






//                                                            electronics



// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);

//          String str=sc.next();

//          String str2="";

//          for(int i=1;i<str.length()-1;i=i+2){
//             char curr=str.charAt(i);
//             char prev=str.charAt(i-1);

//             if(curr>prev){
//                 str2=str2+curr;
//             }
//             else{
//                 str2=str2+prev;
//             }
//          }

//          str2=str2+str.charAt(str.length()-1);


//          System.out.println(str2);
// }
// }




// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
    
//      try{
//         String name=sc.nextLine();

//         if(!name.matches("^[a-zA-Z]+$")){
//             System.out.println("Invalid Name");
//         }

//         int id=sc.nextInt();

//         if(id<0){
//             System.out.println("Invalid id");
//         }

//         int sal=sc.nextInt();

//         if(sal<0){
//             System.out.println("Invalid Salary");
//         }

//         System.out.println("Data preocessed");
//      }

//      catch(Exception e){
//         System.out.println(e.getMessage());
//      }
     
     
     

// }
// }



       //                                         find index of the substring in the string -- abababab

        //  import java.util.*;
        //  public class ete2{
        //  public static void main (String args[]){
        //  Scanner sc=new Scanner(System.in);
            
        //  String str=sc.next();
         
        //  String key=sc.next();

        //  ArrayList<Integer>ll=new ArrayList<>();

        //  for(int i=0;i<=str.length()-key.length();i++){

        //     String s=str.substring(i,i+key.length());

        //     if(s.equals(key)){
        //         ll.add(i);
        //     }

        //  }


        //  System.out.print(ll);

        //  }
        //  }




        //                                  nth element from end


    //     import java.util.*;
    //     public class ete2{
    //     public static void main (String args[]){
    //     Scanner sc=new Scanner(System.in);
             
    //     LinkedList<Integer>list=new LinkedList<>();

    //     while(true){
           
    //         int n=sc.nextInt();

    //         if(n==-1){
    //             break;
    //         }

    //         list.add(n);
        
    //     }

    //    int k=sc.nextInt();

    //     System.out.print(list.get(list.size()-k));
    //     }
    //     }






//     import java.util.*;
//     public class ete2{
//     public static void main (String args[]){
//     Scanner sc=new Scanner(System.in);
        
//     String str=sc.nextLine();

//     String str2="";

//     for(int i=0;i<str.length();i++){

//         if(i==0){
//             char chh=Character.toUpperCase(str.charAt(0));
//             str2=str2+chh;
            
//         }
//         else if(i>0 && str.charAt(i)>='a' && str.charAt(i)<='z'){
//             str2=str2+str.charAt(i);

//         }
//     }
//    System.out.print(str2);
//     }
//     }





// import java.util.*;
// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();

//            LinkedList<String>list1=new LinkedList<>();
//            LinkedList<String>list2=new LinkedList<>();

//            for(int i=0;i<n;i++){
//                 list1.add(sc.next());
//            }


//            String str=sc.next();


//            for(int i=0;i<n;i++){
//                 if(list1.get(i).compareTo(str)>0){
//                        list2.add(list1.get(i));
//                 }
//            }
//            System.out.print(list2);
// }
// }


// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
       
//          String str=sc.nextLine();
//          String str2="";

//          for(int i=0;i<str.length()-1;i++){
//             if(str.charAt(i)!=str.charAt(i+1)){
//                 str2=str2+str.charAt(i);
//             }
//          }

//          str2=str2+str.charAt(str.length()-1);

//          System.out.print(str2);
         
// }
// }




// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();

//       String arr[][]=new String[n][3];
//     //   String arr2[][]=new String[n][3];

//       for(int i=0;i<n;i++){
//         for(int j=0;j<3;j++){
//                arr[i][j]=sc.next();
//         }
//       }


//       String str=sc.next();
//       boolean found=false;


//       for(int i=0;i<n;i++){
//         if(arr[i][0].equals(str)){
//             for(int j=0;j<3;j++){
//                 System.out.println(arr[i][j]);
//             }

//             found=true;
//             break;

//         }
//       }

//        if(found==false){
//         System.out.println("No");
//        }
// }
// }





// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();

//       char arr[][]=new char[n][10];

//       for(int i=0;i<n;i++){
//         for(int j=0;j<10;j++){
//             arr[i][j]=sc.next().charAt(0);
//         }
//       }

//       int count=0;

    //   char keys[]={'D','B','D','C','C','D','A','E','A','D'};


//       for(int i=0;i<n;i++){
//         for(int j=0;j<10;j++){
//             if(arr[i][j]==keys[j]){
//                 count++;
//             }
//         }
//         System.out.println(count);
//         count=0;
        
//       }
      
// }
// }


// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// String str = sc.next();
// int d = sc.nextInt();
// String ans = str.substring(d)+str.substring(0,d);
// System.out.println(ans);

// for(int i=ans.length()-1;i>=0;i--){
//     System.out.print(ans.charAt(i));
// }



// }
// }



// import java.util.*;
// public class ete2{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
   
//  String str=sc.nextLine();

//      char ch[]=str.toCharArray();

//      int s=0;
//      int e=str.length()-1;

//      while(s<e){
//         if(ch[s]==' '){
//             s++;
//         }
//         else if(ch[e]==' '){
//             e--;
//         }
//         else{
//             char temp=ch[s];
//             ch[s]=ch[e];
//             ch[e]=temp;
//             s++;
//             e--;
//         }
//      }

//      System.out.print(String.valueOf(ch));
// } 
// }


//                                          stock span problem 



// import java.util.*;
// public class ete2{

//     public static void stock(int st[],int sp[]){
//         Stack<Integer>s=new Stack<>();

//         sp[0]=1;
//         s.push(0);

//         for(int i=1;i<st.length;i++){
//             int currPrice=st[i];

//             while(!s.isEmpty() && currPrice>st[s.peek()]){
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 sp[i]=i+1;
//             }
//             else{
//                 int prevHigh=s.peek();
//                 sp[i]=i-prevHigh;
//             }
//             s.push(i);
//         }
//     }


// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
      
//        int n=sc.nextInt();

//        int st[]=new int[n];

//        for(int i=0;i<n;i++){
//         st[i]=sc.nextInt();
//        }
//        int sp[]=new int[n];

//        stock(st,sp);

//        for(int i=0;i<st.length;i++){
//         System.out.print(sp[i]);
//        }

// }
// }





 ////                                                           histogram



//  import java.util.*;
//  public class ete2{

//     public static int histogram(int arr[]){

//         Stack<Integer>s=new Stack<>();

//         int maxArea=0;

//         int nsr[]=new int[arr.length];
//         int nsl[]=new int[arr.length];

//         for(int i=arr.length-1;i>=0;i--){

//             while(!s.isEmpty() && arr[i]<arr[s.peek()]){
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 nsr[i]=arr.length;
//             }
//             else{
//                 nsr[i]=s.peek();
//             }
//             s.push(i);
//         }

//         s=new Stack<>();

//          for(int i=0;i<arr.length;i++){

//             while(!s.isEmpty() && arr[i]<arr[s.peek()]){
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 nsl[i]=-1;
//             }
//             else{
//                 nsl[i]=s.peek();
//             }
//             s.push(i);
//         }

//         for(int i=0;i<arr.length;i++){
//             int height=arr[i];
//             int width=nsr[i]-nsl[i]-1;

//             int currArea=height*width;

//             maxArea=Math.max(maxArea, currArea);
//         }

//         return maxArea;
        

//     }
//  public static void main (String args[]){
//  Scanner sc=new Scanner(System.in);
//           int n=sc.nextInt();

//           int arr[]=new int[n];

//           for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//           }

//           System.out.print(histogram(arr));
//  }
//  }


// import java.util.Scanner;

// public class ete2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String str= scanner.nextLine();

//         int n = str.length();

//         // Generate all possible subsequences using bit manipulation
//         for (int i = 1; i < (1 << n); i++) {
//             StringBuilder s = new StringBuilder();
//             for (int j = 0; j < n; j++) {
//                 if ((i & (1 << j)) > 0) {
//                     s.append(str.charAt(j));
//                 }
//             }
//             System.out.println(s.toString());
//         }
//     }
// }


// import java.util.*;

// public class ete2{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int T = scanner.nextInt(); // Number of test cases

//         for (int t = 0; t < T; t++) {
//             int c1 = scanner.nextInt();
//             int c2 = scanner.nextInt();
//             int c3 = scanner.nextInt();
//             int c4 = scanner.nextInt();

//             int n = scanner.nextInt(); // Number of rickshaws
//             int m = scanner.nextInt(); // Number of buses

//             int[] rickshawUsage = new int[n];
//             int[] busUsage = new int[m];

//             for (int i = 0; i < n; i++) {
//                 rickshawUsage[i] = scanner.nextInt();
//             }

//             for (int i = 0; i < m; i++) {
//                 busUsage[i] = scanner.nextInt();
//             }

//             int rickshawCost = 0;
//             int busCost = 0;

//             for (int i = 0; i < n; i++) {
//                 rickshawCost += Math.min(rickshawUsage[i] * c1, c2);
//             }

//             for (int i = 0; i < m; i++) {
//                 busCost += Math.min(busUsage[i] * c1, c2);
//             }

//             rickshawCost = Math.min(rickshawCost, c3);
//             busCost = Math.min(busCost, c3);

//             int totalCost = Math.min(rickshawCost + busCost, c4);
//             System.out.println(totalCost);
//         }
//     }
// }



// import java.util.Scanner;

// public class ete2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int N = scanner.nextInt();
//         int[] boxes = new int[N];

//         for (int i = 0; i < N; i++) {
//             boxes[i] = scanner.nextInt();
//         }

//         int maxPairs = 0;

//         for (int i = 0; i < N; i++) {
//             maxPairs += boxes[i] / 2;
//             boxes[i] %= 2;

//             if (i < N - 1) {
//                 int pairs = Math.min(boxes[i], boxes[i + 1]);
//                 maxPairs += pairs;
//                 boxes[i + 1] -= pairs;
//             }
//         }

//         System.out.println(maxPairs);
//     }
// }





import java.util.*;
public class ete2{

    public static void printok(int arr[]){

        int indices[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            indices[i]=i;
        }

        for(int i=0;i<indices.length-1;i++){
            for(int j=i+1;j<indices.length;j++){
                if(arr[indices[i]]<arr[indices[j]] || arr[indices[i]]==arr[indices[j]] && arr[indices[i]]>arr[indices[j]]){
                    int temp=indices[i];
                    indices[i]=indices[j];
                    indices[j]=temp;
                }
            }
        }

        for(int i:indices){
            System.out.println(i);
        }


    }
public static void main (String args[]){
   Scanner sc=new Scanner(System.in);
   
   int n=sc.nextInt();

   int arr[]=new int[n];

   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }

   printok(arr);
}
}