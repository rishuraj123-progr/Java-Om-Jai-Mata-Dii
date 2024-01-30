//                             queue using array
//            add---o(1)
//            delete ----o(n)


// import java.util.*;

// public class Queue1 {
//     static int arr[];
//     static int size;

//     static int rear;

//     Queue1(int n){
//         arr=new int[n]; 
//         size=n;
//         rear=-1;
//     }

//     public static boolean isEmpty() {
//         return rear == -1;
//     }




//     // add

//     public static void add(int data) {
//         if (rear == size - 1) {
//             System.out.println("Queue is full");
//             return;
//         }

//         rear = rear + 1;
//         arr[rear] = data;

//     }






//     // remove

//     public static int remove() {

//         if (isEmpty()) {
//             System.out.println("Empty Queue");
//             return -1;
//         }
//         int front = arr[0];
//         for (int i = 0; i < rear; i++) {
//             arr[i] = arr[i + 1];
//         }
//         rear = rear - 1;
//         return front;
//     }





//     // peek


//     public static int peek() {

//         if (isEmpty()) {
//             System.out.println("empty queue");
//             return -1;
//         }

//         return arr[0];
//     }

// public static void main (String args[]){


// Queue1 q1 = new Queue1(5);
// q1.add(1);
// q1.add(2);
// q1.add(3);


// while(!q1.isEmpty()){
//     System.out.println(q1.peek());
//     q1.remove();
//     System.out.println(q1.peek());
// }


// }
// }







//                         circular queue using array






// import java.util.*;

// public class Queue1 {
//     static int arr[];
//     static int size;
//     static int rear;
//     static int front;

//     Queue1(int n){
//         arr=new int[n]; 
//         size=n;
//         rear=-1;
//         front=-1;
//     }

//     public static boolean isEmpty() {
//         return rear == -1 && front==-1;
//     }


//     public static boolean isFull() {
//         // meanng jab ham rear ko value assign kar rahe hai to waha pahle se hi front hai
//         return (rear+1)%size == front;
//     }



//     // add

//     public static void add(int data) {
//         if (isFull()) {
//             System.out.println("Queue is full");
//             return;
//         }
        
//         //add first element
//         if(front==-1){
//             front=0;
//         }

//         rear =(rear + 1)%size;
//         arr[rear] = data;

//     }




//     // remove

//     public static int remove() {

//         if (isEmpty()) {
//             System.out.println("Empty Queue");
//             return -1;
//         }

//          int result = arr[front];

//         // last element delete

//         if(rear==front){ // agar ham last element ko remove kar rhe hai to fir hame rear aur front ko -1 bnana parega taaki pata chale ki ab que empty ho gaya hai
//             rear=front=-1;
//         }

//         else{
//         front=(front+1)%size;
//         }
    
//         return result;

//     }



//     // peek


//     public static int peek() {

//         if (isEmpty()) {
//             System.out.println("empty queue");
//             return -1;
//         }

//         return arr[front];
//     }

// public static void main (String args[]){


// Queue1 q1 = new Queue1(3 );
// q1.add(1);
// q1.add(2);
// q1.add(3); 
// System.out.println(q1.remove());
// q1.add(4); // hamesa add end me hoga
// System.out.println(q1.remove()); 
// q1.add(5);

// while(!q1.isEmpty()){
//     System.out.println(q1.peek());
//     q1.remove();
    

// }


// }
// }







//                                     Queue using linked list 




// import java.util.*;

// public class Queue1 {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         // adddddd

//         public static void add(int data) {
//             Node newNode = new Node(data);
              

//             if (head == null) { // if insering the first value
//                 head = tail = newNode;
//                 return;
//             }

//             tail.next = newNode;
//             tail = newNode;
//         }

//         // removeeeeeeeeeeeeee

//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }

//             int front = head.data;

//             if (tail == head) { // if removing the first value
//                 tail = head = null;
//             } else {
//                 head = head.next;
//             }

//             return front;
//         }

//         //peeeeeeeeeeeeeeeeeeeeek



//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String args[]) {
//         Queue q1 = new Queue();
//         q1.add(1);
//         q1.add(2);
//         q1.add(3);

//         while (!q1.isEmpty()) {
//             System.out.println(q1.peek());
//             q1.remove();
//         }
//     }
// }







//                  making queue using java collection framework


// import java.util.*;

// public class Queue1{
//    public static void main (String args[]){
      
//     // Queue<Integer>q=new LinkedList<>();
//     Queue<Integer>q=new ArrayDeque<>();

//     q.add(1);
//     q.add(2);
//     q.add(3);


//     while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//     }

// }
// }



//                       queue using 2 stacks



// import java.util.*;
// public class Queue1{
// public static void main (String args[]){
//     Stack<Integer>s1=new Stack<>();
//     Stack<Integer>s2=new Stack<>();
     
//     Queue<Integer>q=new LinkedList<>();
    
// s1.add(1);
// s1.add(2);
// s1.add(3);

   
//     while(!s1.isEmpty()){

//         s2.add(s1.pop());


//    }

//    while (!s2.isEmpty()) {
//     System.out.println(s2.peek());
//     s2.pop();
//    }
// }
// }







//                    stack using 2 queues  

 // need to understand 



// import java.util.*;
// public class Queue1{

//     public static class Stack{
//         static Queue<Integer>q1=new LinkedList<>();
//         static Queue<Integer>q2=new LinkedList<>();
        

//         public static boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty(); 
//         }

//         public static void push(int data){
//             if(!q1.isEmpty()){
//                 q1.add(data);
//             }
//             else{
//                 q2.add(data);
//             }
//         }

//         public static int pop(){
//             if(isEmpty()){
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top=-1;

//             //case 1

//             if(!q1.isEmpty()){
//                  while(!q1.isEmpty()){
//                     top=q1.remove();
//                     if(q1.isEmpty()){
//                         break;
//                     }
//                     q2.add(top);
//                  }
//             } 
//             // case 2
//             else{

//                 while(q2.isEmpty()){
//                     top=q2.remove();
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q1.add(top);
//                 }

//             }

//             return top; 
//         }

//         public static int peek(){

//              if(isEmpty()){
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top=-1;

//             //case 1

//             if(!q1.isEmpty()){
//                  while(!q1.isEmpty()){
//                     top=q1.remove();
                 
//                     q2.add(top);
//                  }
//             } 
//             // case 2
//             else{

//                 while(q2.isEmpty()){
//                     top=q2.remove();
    
//                     q1.add(top);
//                 }

//             }

//             return top; 
             
//         }

//     }
// public static void main (String args[]){

//     Stack s=new Stack();
//      s.push(1);
//      s.push(2);
//      s.push(3);

//      while(!s.isEmpty()){
//         System.out.println(s.peek());
//         s.pop();
//      }


// }
// }





 //            find non repeating letter in a stream of characters


//  import java.util.*;
//  public class Queue1{

//     public static void printNonRepeating(String str){

//         int freq[]=new int[26];

//         Queue<Character>q=new LinkedList<>();

//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;


//             while(!q.isEmpty() && freq[q.peek()-'a']>1){
//                 q.remove(); 
//             }

//                if(q.isEmpty()){
//                 System.out.print(-1+" ");
//                }
//                else{
//                 System.out.print(q.peek()+" ");
//                }
//         }

//         System.out.println();

//     }
//  public static void main (String args[]){
//      Scanner sc=new Scanner(System.in);

//      String str=sc.nextLine();
 
//     printNonRepeating(str);
 
//  }
//  }




//                              interleave elements



// import java.util.*;
// public class Queue1{

//     public static void interleave(Queue<Integer>q){
//             Queue<Integer>firstHalf=new LinkedList<>();

//             int size=q.size();

//             for(int i=0;i<size/2;i++){
//                 // new queue(firstHalf) me elements add kar raha 
//                 firstHalf.add(q.remove());
//             }

//             while(!firstHalf.isEmpty()){

//                 // for the elements from queue2 , i.e. firsthalf
//                 q.add(firstHalf.remove());

//                 // for the elements from queue 1 ,i.e. q
//                 q.add(q.remove());
//             }
//     }
// public static void main (String args[]){

//     Queue<Integer>q=new LinkedList<>();

//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);
//     q.add(6);
//     q.add(7);
//     q.add(8);
//     q.add(9);
//     q.add(10);
    

//     interleave(q);

//     while(!q.isEmpty()){
//         System.out.print(q.remove()+" ");
//     }
//     System.out.println();
    

// }
// }



//                                             queue reversal

// import java.util.*;
// public class Queue1{
// public static void main (String args[]){

//     Queue<Integer>q=new LinkedList<>();

//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);

//     Stack<Integer>s=new Stack<>();

//     while(!q.isEmpty()){
//         s.push(q.remove());
//     }

//     while(!s.isEmpty()){
     
//      q.add(s.pop());

//      System.out.print(q.remove()+" ");

// }

// }
// }






//             implementing double ended queue --> deque




// import java.util.*;
// public class Queue1{
// public static void main (String args[]){

//     Deque<Integer>dq=new LinkedList<>();
//     dq.addFirst(1);
//     dq.addFirst(2);
//     dq.addLast(3);
//     dq.addLast(4);
//     System.out.println(dq);
//     dq.removeFirst();
//     System.out.println(dq);
// }
// }


//         stack  using   deque


// import java.util.*;
// public class Queue1{
//     public static class stack{
//         Deque<Integer>d=new LinkedList<>();

//         public void push(int data){
//             d.addLast(data);
//         }

//         public int pop(){
//             return d.removeLast();
//         }

//         public int peek(){
//             return d.getLast();
            
//         }
    
    
//     }
// public static void main (String args[]){

//     Stack s=new Stack();

//     s.push(1);
//     s.push(2);
//     s.push(3);

//     System.out.println("peek  "+ s.peek());
//     System.out.println( s.pop());
//     System.out.println( s.pop());
//     System.out.println( s.pop());


   

// }
// }







//                          queue using deque



// import java.util.*;
// public class Queue1{
//     public static class queue{
//         Deque<Integer>d=new LinkedList<>();

//         public void add(int data){
//             d.addLast(data);
//         }

//         public int remove(){ 
//             return d.removeFirst();
//         }

//         public int peek(){
//             return d.getFirst();
            
//         }
    
    
//     }
// public static void main (String args[]){

//     queue s=new queue();

//     s.add(1);
//     s.add(2);
//     s.add(3);

//     System.out.println("peek  "+ s.peek());
//     System.out.println( s.remove());
//     System.out.println( s.remove());
//     System.out.println( s.remove());


   

// }
// }




//   Generate Binary Numbers between the given range using queue



// import java.util.*;
// public class Queue1{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();

//    Queue<String>q=new LinkedList<>();

//    for(int i=1;i<=n;i++){

//     q.add(Integer.toBinaryString(i));

//    }

//    while(!q.isEmpty()){
//     System.out.println(q.remove());
    
//     }

// }
// }





//          Reversing the first K elements of a Queue


// import java.util.*;
// public class Queue1{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);


// Deque<Integer>d=new LinkedList<>();
// Deque<Integer>d2=new LinkedList<>();

// d.add(1);
// d.add(2);
// d.add(3);
// d.add(4);
// d.add(5);
// d.add(6);
// d.add(7);
// d.add(8);
// d.add(9);
// d.add(10);


// int k=sc.nextInt();

// // k elements ko d2 me add kiya 
// for(int i=1;i<=k;i++){
//     d2.add(d.remove());
// }


// // uk k elements ko wapas d2 se d me add kiya i.e. addfirst
// while(!d2.isEmpty()){
//     d.addFirst(d2.remove());
// }

// // fir uske baad d ko print karwa diya
// while(!d.isEmpty()){
//     System.out.println(d.remove());
// }

// }
// }





