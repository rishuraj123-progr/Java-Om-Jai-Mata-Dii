// import java.util.*;
// public class StackPractice{

//     public static boolean isValid(String str){

//         Stack<Character>s=new Stack<>();

//         for(int i=0;i<str.length();i++){

//             char ch=str.charAt(i);

//             if(ch=='(' || ch=='{' || ch=='['){
//                 s.push(ch);
//             }

//             else{
//                 if(s.isEmpty()){
//                     return false;
//                 }

//                 if(s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']' ){
//                     s.pop();
//                 }
//                 else{
//                     return false;
//                 }
//             }

//         }

//         if(s.isEmpty()){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// public static void main (String args[]){
       
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
       
//        System.out.print(isValid(str));

// }
// }






// import java.util.*;
// public class StackPractice{

//     public static boolean isValid(String str){

//         Stack<Character>s=new Stack<>();
        
//         for(int i=0;i<str.length();i++){
            

//             char ch=str.charAt(i);

//             if(ch==')'){
//                 int count=0;
//                 while( s.peek()!='('){
//                     s.pop();
//                     count++;
//                 }

//                 if(count<1){
//                     return true;
//                 }

//                 else{
//                     s.pop();
//                 }
//             }

//             else{
//                 s.push(ch);
//             }
//         }
//         return false;
        
        
//     }
// public static void main (String args[]){
       
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
       
//        System.out.print(isValid(str));

// }
// }





// import java.util.*;
// public class StackPractice{

//     public static long isValid(int st[]){

//         Stack<Integer>s=new Stack<>();
        

//         long maxArea=0;
//         int nsr[]=new int[st.length];
//         int nsl[]=new int[st.length];

//         for(int i=st.length-1;i>=0;i--){

//             while(!s.isEmpty() && st[s.peek()]>=st[i]){
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 nsr[i]=st.length;
//             }
//             else{
//                 nsr[i]=s.peek();
//             }
//             s.push(i);
//         }

//         s=new Stack<>();

//         for(int i=0;i<st.length;i++){

//             while(!s.isEmpty() && st[i]<=st[s.peek()]){
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


//         for(int i=0;i<st.length;i++){
//             long height=st[i];

//             long width=nsr[i]-nsl[i]-1;

//             long currArea=height*width;

//             maxArea=Math.max(currArea, maxArea);

//         }


//        return maxArea;
        
//     }
// public static void main (String args[]){
       
    //    Scanner sc=new Scanner(System.in);
    //    int n=sc.nextInt();

    //    int st[]=new int[n];

    //    for(int i=0;i<n;i++){
    //     st[i]=sc.nextInt();
    //    }

    // //    int sp[]=new int[n];
       
    //    System.out.print(isValid(st));

// }
// }

import java.util.*;

public class StackPractice{

    public static void isValid(int st[],int sp[]){

        Stack<Integer>s=new Stack<>();

        sp[0]=1;
        s.push(0);

        for(int i=1;i<st.length;i++){

            int currPrice=st[i];

            while(!s.isEmpty() && st[s.peek()]<=currPrice){
                s.pop();
            }

            if(s.isEmpty()){
                sp[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                sp[i]=i-prevHigh;
            }
            s.push(i);
        }

    }
    public static void main (String args[]){

      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

       int st[]=new int[n];

       for(int i=0;i<n;i++){
        st[i]=sc.nextInt();
       }

       int sp[]=new int[n];
       
       isValid(st,sp);


       for(int i=0;i<sp.length;i++){
        System.out.print(sp[i]+" ");
       }
    
}
}