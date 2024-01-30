// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();

// int num=n;
// int fact=0;
// int sum=0;


// for(int i=2;i<n;i++){
//     while(n%i==0){
//         fact=fact+i;
//         n=n/i;
//     }
// }

// if(n>2){
//     fact=fact+n;
// }

// while(num>0){
//     int rem=num%10;
//     sum=sum+rem;
//     num=num/10;
// }

// if(fact==sum){
//     System.out.println("1");
// }
// else{
//     System.out.println("0");
// }
// }
// }


























//                                                song wala




// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         String song[]=new String[n];

//         for(int i=0;i<n;i++){
//             song[i]=sc.next();
//         }

//         Arrays.sort(song);

//         String key=sc.next();
//         boolean flag=false;


//         for(int i=0;i<n;i++){
//             if(song[i].equals(key)){
//                 System.out.println(i);
//                 flag=true;
//                 break;
//             }
//         }
//         if(!flag){
//         System.out.print("-1");
//         }
// }
// }



















//                                                       answer key of students



// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
     
//      int n=sc.nextInt();

//      char arr[][]=new char[n][10];

//      for(int i=0;i<n;i++){
//         for(int j=0;j<10;j++){
//            arr[i][j]=sc.next().charAt(0);
//         }
//      }

//      int count=0;

//      char keys[]={'D','B','D','C','C','D','A','E','A','D'};


//      for(int i=0;i<n;i++){
//         for(int j=0;j<10;j++){
//             if(arr[i][j]==keys[j]){
//                 count++;
//             }
//         }
//         System.out.println(count);
//         count=0;
//      }


// }
// }



//                          biggest number


// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
    
// int n=sc.nextInt();


// long arr[]=new long[n];


// for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
// }


//       for(int i=0;i<n-1;i++){
//         for(int j=0;j<n-1;j++){
//             long ab=Long.parseLong(arr[j]+""+arr[j+1]);
//             long ba=Long.parseLong(arr[j+1]+""+arr[j]);

//             if(ba>ab){
//                 long temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//             }

//         }
//       }


//       for(int i=0;i<n;i++){
//         System.out.print(arr[i]);
//       }
// }
// }











// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         int arr[]=new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int key=sc.nextInt();
//         int count=0;


//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 HashSet<Integer>seta=new HashSet<>();
//                 for(int k=i;k<=j;k++){
//                     seta.add(arr[k]);
//                 }

//                 if(seta.size()==key){
//                     count++;
//                 }
//             }
//         }
//         System.out.print(count);
// }
// }



// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();

//      String arr[][]=new String[n][3];

//      for(int i=0;i<n;i++){
//         for(int j=0;j<3;j++){
//             arr[i][j]=sc.next();
//         }
//      }

//      String str=sc.next();

//      boolean flag=false;

//      for(int i=0;i<n;i++){
//         if(arr[i][0].equals(str)){
//             for(int j=0;j<3;j++){
//                 System.out.println(arr[i][j]);
//             }
//             flag=true;
//             break;
//         }
//      }
//      if(!flag){
//         System.out.println("-1");
//      }
// }
// }


 




//                                  govinda number








// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();

//    int num=n;
//    int fact=0;
//    int sum=0;


//    for(int i=2;i<n;i++){
//     while(num%i==0){
//         fact=fact+i;
//         num=num/i;
//     }
//    }

//    if(num>2){
//     fact=fact+num;
//    }

//    while(n>0){
//     int rem=n%10;
//     sum=sum+rem;
//     n=n/10;
//    }


//    if(sum==fact){
//     System.out.print("1");
//    }
//    else{
//     System.out.println("0");
//    }
// }
// }










//                                testString


// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
     
// int n=sc.nextInt();
// int m=sc.nextInt();

// String str=sc.next();

//      StringBuilder str1=new StringBuilder(str);

//      if(n<str.length()){
//         str1.insert(n,"*");
//      }

//      if(m+1<str.length()){
//         str1.insert(m+1, "*");
//      }

//      System.out.println(str1);

// }
// }




//                 lucky number

// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();

//    int x=n;
//    int k=n;

//    int count=0;
//    int sum=0;



//    while(x--!=0){
//     count++;
//     x=x/10;
    
//    }

//    while(k>0){
//     int rev=k%10;
//      sum=sum+(int)Math.pow(rev,count);
//      k=k/10;
//    }

//    if(sum==n){
//     System.out.println("true");
//    }
//    else{
//     System.out.println("False");
//    }
// }
// }



// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
    
//    int n=sc.nextInt();
//    String str=sc.next();
    
//    String str2="";

//    for(int i=0;i<str.length();i++){
//         str2=str.substring(n)+str.substring(0,n);
//    }
  

//    System.out.println(str2);
   

//    for(int i=str2.length()-1;i>=0;i--){
//     System.out.print(str2.charAt(i));
//    }
   

// }
// }




// import java.util.*;
// public class ete3{

//     public static void stocks(int st[],int sp[]){
        
//         Stack<Integer>s=new Stack<>();

//           sp[0]=1;
//           s.push(0);


//           for(int i=1;i<st.length;i++){
//             int currPrice=st[i];

//             while(!s.isEmpty() && currPrice>=st[s.peek()]){
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 sp[i]=i+1;
//             }
//             else{
//                 int prevPrice=s.peek();
//                 sp[i]=i-prevPrice;
//             }

//             s.push(i);
//           }
//     }
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//              int n=sc.nextInt();

//              int st[]=new int[n];
//              int sp[]=new int[n];

//              for(int i=0;i<n;i++){
//                 st[i]=sc.nextInt();
//              }

//              stocks(st,sp);


//              for(int i=0;i<n;i++){
//                 System.out.print(sp[i]+" ");
//              }
// }
// }



// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
       
// String str=sc.nextLine();

// char ch[]=str.toCharArray();

// int s=0;
// int e=str.length()-1;

// while(s<e){

//     if(ch[s]==' '){
//         s++;
//     }
//     else if(ch[e]==' '){
//         e--;
//     }
//     else{
//         char temp=ch[s];
//         ch[s]=ch[e];
//         ch[e]=temp;
//         s++;
//         e--;
//     }
// }

// System.out.print(String.valueOf(ch));

// }
// }





















//                                      kiwi 



// import java.util.*;
// public class ete3{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     LinkedList<String>list1=new LinkedList<>();
//     LinkedList<String>list2=new LinkedList<>();

//     for(int i=0;i<n;i++){
//         list1.add(sc.next());

//     }

//     String str=sc.next();

//     for(int i=0;i<n;i++){
//         if(list1.get(i).compareTo(str)>0){
//             list2.add(list1.get(i));
//         }
//     }

//     if(list2.isEmpty()){
//         System.out.println("no");
//     }
//     else{
//         System.out.println(list2);
//     }

// }
// }




//                                           index wala



import java.util.*;
public class ete3{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
   
String str=sc.next();
String key=sc.next();

ArrayList<Integer>list=new ArrayList<>();


for(int i=0;i<str.length()-key.length();i++){

    String s=str.substring(i,i+key.length());

    if(s.equals(key)){
        list.add(i);
    }
}

if(list.isEmpty()){
    System.out.println("-1");
}
else{
    System.out.println(list);
}
}
}