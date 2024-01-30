import java.util.*;




                                                  //  making stack using arraylist




// public class Stack1{
//      static class Stack {
//          static ArrayList<Integer>list=new ArrayList<>();

//         //  to create stack we need 4 functons push , pop , peek , isEmpty

//          public static boolean isEmpty(){
//             return list.size()==0; // if stack is empty it will return true else false
//          }

//          // push

//          public static void push(int data){
//             list.add(data);
//          }
         
//          // pop
             
//          public static int pop(){

//             // agar pop karte time hamara stack khali hai to -1
//              if(isEmpty()==true){
//                return -1;
//              }   

//             int top=list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//          }
         
//          // peek
          
//          public static int peek(){
           
//             // agar pop karte time hamara stack khali hai to -1
//              if(isEmpty()==true){
//                return -1;
//              }   

//              return list.get(list.size()-1); 
//          }
//     }
// public static void main (String args[]){

   // Stack s=new Stack();

   // s.push(1);
   // s.push(2);
   // s.push(3);


   // // this loop will run until the stack is empty
   // while(!s.isEmpty()){

   //    System.out.println(s.peek());
   //    s.pop();

   // }

// }
// }





//                                               stack using linkedList




// public class Stack1{

//    static class Node{
//       int data;
//       Node next;

//       //constructor
//       Node(int data){
//          this.data=data;
//          this.next=null;
//       }
//    }

//    static class Stack{
//       static Node head=null;

//       //     isEmpty

//       public static boolean isEmpty(){
//           if(head==null){
//             return true;
//           }

//           return false;
//       }

//       //     push

//       public static void push(int data){
//          Node newNode=new Node(data);
       
//          // if stack is empty
//          if(isEmpty()){
//             head=newNode;
//             return;
//          } 
          
//          //if stack is not empty
//          else{
//             newNode.next=head;
//             head=newNode;
//          }
          
//       }


//       public static int pop(){

//          if(isEmpty()){
//             return -1;
//          }

//          else{
//             int top=head.data;
//             head=head.next;
//             return top;
//          }
//       }

//       public static int peek(){
//          if(isEmpty()){
//             return -1;
//          }
//          return head.data;
//       }


//    }
// public static void main (String args[]){

//     Stack s=new Stack();

//    s.push(1);
//    s.push(2);
//    s.push(3);


//    // this loop will run until the stack is empty
//    while(!s.isEmpty()){

//       System.out.println(s.peek());
//       s.pop();

//    }

// }
// }





 //  stack using java collection framework

// import java.util.*;
//  public class Stack1{
//  public static void main (String args[]){
 
//    Stack<Integer>s=new Stack<>();

//    s.push(1);
//    s.push(2);
//    s.push(3);



//    while(!s.isEmpty()){
//       System.out.println(s.peek());
//       s.pop();
//    }
//  }
//  }



//                         Push at the bottom of the stack


// import java.util.*;
//  public class Stack1{

//   public static void pushAtBottom(Stack<Integer>s,int data){

//           if(s.isEmpty()){
//             s.push(data);
//             return;
//           }

//           else{

//           int top=s.pop();   // top me pop hone waale element ko add kiya
          
//           pushAtBottom(s, data);  // fir se call kiya taaki next element pop ho jaaye
          
//           s.push(top);  //
           
//           }
          
//   }

//  public static void main (String args[]){
 
//    Stack<Integer>s=new Stack<>();

//    s.push(1);
//    s.push(2);
//    s.push(3);

   
//    pushAtBottom(s,4);

//    while(!s.isEmpty()){
//       System.out.println(s.pop());
//    }
//  }
//  }







//                reverse a stack(String)

// import java.util.*;
//  public class Stack1{

//   public static String reverseString(String str){


//     // made a new stack and inserted all the elements in that stack
//     Stack<Character>s=new Stack<>();
//     int index=0;
//     while(index<str.length()){
//       s.push(str.charAt((index)));
//       index++;
//     }

//     // made a stringbuilder to store the new stack(s) into it.
//     StringBuilder result=new StringBuilder("");
//     while(!s.isEmpty()){
//       char curr=s.pop();
//       result.append(curr);
//     }

//     return result.toString();
     
//   }
//  public static void main (String args[]){

//   String str="hello";

//   System.out.print(reverseString(str));

//  }
//  }




//                          reverse a stack(Integer)


// import java.util.*;
//  public class Stack1{

//   public static void pushAtBottom(Stack<Integer>s,int data){

//           if(s.isEmpty()){
//            s.push(data);
//            return;
//           }

//           else{
//             int top=s.pop();
//             pushAtBottom(s,data);
//             s.push(top);
//           }
//   }

//   public static void reverseStack(Stack<Integer>s){
         
//               if(s.isEmpty()){
//                  return;
//               }

//               int top=s.pop();
//               reverseStack(s);
//               pushAtBottom(s, top);

//   }

//   public static void printStack(Stack<Integer>s){

//             while(!s.isEmpty()){
//               System.out.print(s.pop());
//             }
//   }

  
//  public static void main (String args[]){


//   Stack<Integer>s=new Stack<>();


//   s.push(1);
//   s.push(2);
//   s.push(3);


//   reverseStack(s);
//   printStack(s);

//  }
//  }







//                                                          stock span problem 






// import java.util.*;
// public class Stack1{

//   public static void stockspan(int stock[],int span[]){



//     Stack<Integer>s=new Stack<>();
//     span[0]=1;
//     s.push(0);

//     for(int i=1;i<stock.length;i++){
//       int currPrice=stock[i];
      
//       while(!s.isEmpty() && currPrice>stock[s.peek()]){
//         s.pop();
//       }

//       if(s.isEmpty()){
//         span[i]=i+1;
//       }
//       else{
//         int prevHigh=s.peek();
//         span[i]=i-prevHigh;
//       }
//       s.push(i);
//     }
//   }
// public static void main (String args[]){

//   int stock[]={100,80,60,70,60,85,100};
//   int span[]=new int[stock.length];
//   stockspan(stock,span);

//   for(int i=0;i<span.length;i++){
//     System.out.println(span[i]+" ");
//   }
// }

// }







//                                                     next greater element 






// import java.util.*;
// public class Stack1{

  
// public static void main (String args[]){

  
  // Stack <Integer>s=new Stack<>();

  // int arr[] ={6,7,5,4,9,8,3};
  // int greaterElement[]=new int[arr.length];
    
  // for(int i=arr.length-1;i>=0;i--){

  //     while(!s.isEmpty() && arr[s.peek()]<arr[i]){
  //       s.pop();
  //     }

  //     if(s.isEmpty()){
  //         greaterElement[i]=-1;
  //     }
  //     else{
  //         greaterElement[i]=arr[s.peek()];
  //     }
  //     s.push(i);
  // }
  // for(int i=0;i<greaterElement.length;i++){
  //   System.out.print(greaterElement[i]);
  // }

//   System.out.println();

// }

// }




//                                                           valid parentheses


// public class Stack1{




//   public static boolean isValid(String str){

//     Stack<Character>s=new Stack<>();

//     for(int i=0;i<str.length();i++){

//       char ch=str.charAt(i);

//       if(ch=='(' || ch=='{' || ch=='['){ //opening case
//             s.push(ch);
//          }
//       else{  //closing

//          if(s.isEmpty()){
//           return false;
//          }

//          if(s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']' ){
//          
//            s.pop();
//          }
//            else{
//               return false;
//            }
//       }
//     }
//     if(s.isEmpty()){
//         return true;
//       }
//       else{
//         return false;
//       }
                 
//   }

// public static void main (String args[]){


//   String str="()({})";

//   System.out.print(isValid(str));

// }
// }




// public class Stack1{

//   public static boolean isValid(String str){

//     Stack <Character>s=new Stack<>();

//     for(int i=0;i<str.length();i++){

//       char ch=str.charAt(i);

//       if(ch=='(' || ch=='{' || ch=='['){
//         s.push(ch);
//       }

//       else{
//         if(s.isEmpty()){ // if string is == )))))) fir to push karne k baad ni bachega , isiliye we will check if the stack string becomes empty to return false;
//           return false;
//         }

//       if(s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']'){
//         s.pop();
//       }
//       else{
//         return false;
//       }
//     }
//     }
//     if(s.isEmpty()){
//       return true;
//     }
//     else{
//       return false;
//     }

//   }

// public static void main (String args[]){
    
//   String str="()";

//   System.out.print(isValid(str));

// }
// }


// ###############################################################   find whether duplicate #########


// public class Stack1{

//   public static boolean isDuplicate(String str){

//     Stack <Character>s=new Stack<>();

//     for(int i=0;i<str.length();i++){

//       char ch=str.charAt(i);

//       // closing wala
//       if(ch==')'){
//         int count=0;
          
//         while(s.peek()!='('){

//           // agar closing wala nai mila to top element ko pop karo and count ko++;
//           s.pop();
//           count++;
//         }
//           // if count 1 se chota hai uska matlab duplicate exist karta hai
//         if(count<1){
//           return true;
//         }

//         else{
//           s.pop();
//         }
//       } 

//       // opening
//       else{
//         s.push(ch);
//       }
//     }
     
//     return false;
    

//   }

// public static void main (String args[]){
    
//   String str="(a+b)";
//     String str2="((a+b))";

//   System.out.println(isDuplicate(str));
//     System.out.print(isDuplicate(str2));


// }
// }


// public class Stack1{

//   public static void maxArea(int arr[]){

    // int maxArea=0;
    // int nsr[]=new int[arr.length];
    // int nsl[]=new int[arr.length];

    // // next smaller right
    
    // Stack<Integer>s=new Stack<>();

    // for(int i=arr.length-1;i>=0;i--){

    //   while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
    //     s.pop();
    //   }

    //   if(s.isEmpty()){
    //     nsr[i]=arr.length;
    //   }
    //   else{
    //     nsr[i]=s.peek();
    //   }
    //   s.push(i);
    // }

    // // next smaller left
    
    // s=new Stack<>();  // stack s ko khali kar diya

    // for(int i=0;i<arr.length;i++){

    //   while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
    //     s.pop();
    //   }

    //   if(s.isEmpty()){
    //     nsl[i]=-1;
    //   }
    //   else{
    //     nsl[i]=s.peek();
    //   }
    //   s.push(i);
    // }


    // // current area 

    // // width=j-i-1 =nsr[i]-nsr[i]-1;

    // for(int i=0;i<arr.length;i++){
    //   int height=arr[i];
    //   int width=nsr[i]-nsl[i]-1;
    //   int currentArea=height*width;

    //   maxArea=Math.max(maxArea, currentArea);
    // }
          
    // System.out.print(maxArea);

//   }

// public static void main (String args[]){


//   int arr[]={2,1,5,6,2,3};
  
//   maxArea(arr);
 

// }
// }



// import java.util.*;
// public class Stack1
// {
//     // Function to find the stock span
//     public static int[] getStockSpan(int price[], int n){
//         int span[] = new int[n];

//         // Traverse the price array
//         for(int i = 0; i < n; i++){
//             int count = 0;
//             int j = i;
            
//             // Iterate while there are element to the left and the price is less than the current price
//             while(j >= 0 && price[j] <= price[i]){
//                 count++;
//                 j--;
//             }
//             span[i] = count;
//         }
        
//         // Return the span array
//         return span;
//     }
//     public static void main(String[] args) {
//         int price[] = new int[]{100,80,60,70,60,85,100};
//         int span[] = getStockSpan(price, price.length);
        
//         for(int i=0;i<span.length;i++){
//             System.out.print(span[i] + " ");
//         }
//     }
// }





// import java.util.*;
// public class Stack1{

//   public static void stockspan(int stock[],int span[]){



//     Stack<Integer>s=new Stack<>();
//     span[0]=1;
//     s.push(0);

//     for(int i=1;i<stock.length;i++){
//       int currPrice=stock[i];
      
//       while(!s.isEmpty() && currPrice>stock[s.peek()]){
//         s.pop();
//       }

//       if(s.isEmpty()){
//         span[i]=i+1;
//       }
//       else{
//         int prevHigh=s.peek();
//         span[i]=i-prevHigh;
//       }
//       s.push(i);
//     }
//   }
// public static void main (String args[]){

  // int stock[]={100,80,60,70,60,85,100};
  // int span[]=new int[stock.length];
  // stockspan(stock,span);

  // for(int i=0;i<span.length;i++){
  //   System.out.println(span[i]+" ");
  // }
// }

// }



import java.util.*;
public class Stack1{

  public static void stockspan(int stock[],int span[]){



    Stack<Integer>s=new Stack<>();
    span[0]=1;
    s.push(0);

    for(int i=1;i<stock.length;i++){
      int currPrice=stock[i];
      
      while(!s.isEmpty() && currPrice>stock[s.peek()]){
        s.pop();
      }

      if(s.isEmpty()){
        span[i]=i+1;
      }
      else{
        int prevHigh=s.peek();
        span[i]=i-prevHigh;
      }
      s.push(i);
    }
  }
public static void main (String args[]){
  
  Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
  int stock[]=new int[n];

  for(int i=0;i<n;i++){
	  stock[i]=sc.nextInt();
  }
  int span[]=new int[stock.length];
  stockspan(stock,span);

  for(int i=0;i<span.length;i++){
    System.out.print(span[i]+" ");
  }

  System.out.print("END");
}

}





// import java.util.*;
// public class Stack1{

//   public static void stockspan(int stock[],int span[]){

//     Stack<Integer>s=new Stack<>();
//     span[0]=1;
//     s.push(0);
//     for(int i=1;i<stock.length;i++){

//       int currPrice=stock[i];

//       while(!s.isEmpty() && currPrice>=stock[s.peek()]){
//         s.pop();
//       }

//       if(s.isEmpty()){
//         span[i]=i+1;
//       }

//       else{
//         int prevHigh=s.peek();
//         span[i]=i-prevHigh;
//       }
//       s.push(i);
//     }

//     }
  
// public static void main (String args[]){

//   int stock[]={100,80,60,70,60,85,100};
//   int span[]=new int[stock.length];
//   stockspan(stock,span);

//   for(int i=0;i<span.length;i++){
//     System.out.print(span[i]+" ");
//   }
// }

// }