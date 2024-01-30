// import java.util.*;
// public class LinkedList2 {
    
//     public static class Node{
//         int data;
//         Node next;

//         //constructor
//     public Node(int data){
//         this.data=data;
//         this.next=null;
//     }
//     }

//     public static Node head;
//     public static Node tail;
    
//     public static void main (String args[]){

//         LinkedList ll=new LinkedList();

//         //inserting value in linked list
       
//         ll.head=new Node(1);
//         ll.head.next=new Node(2);

//         //but we will use mehtod to add , remove , print , search and method will be not be created in main

//     }

// }
    

// adding elements in the linked list in the starting and ending 


// import java.util.*;
// public class LinkedList2 {


    
//     public static class Node{
//         int data;
//         Node next;

//         //constructor
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//         }
//     }

//     public static Node head;
//     public static Node tail;


//     public void addFirst(int data){
//         // step1= create new node
//         Node newNode=new Node(data);
 
//         // if my linked list is empty
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }

//         // step2= newNode's next =head
//         newNode.next=head; //link

//         // step3 head= head=newNode
//         head=newNode;

//     }

//     public void addLast(int data){
       
//         Node newNode=new Node(data);

//         if(head==null){
//             head=tail=newNode;
//             return ;
//         }

//         tail.next=newNode;

//         tail=newNode;
         
      

//     }


//       // print function to print the data 

//     public void print(){

//         if(head==null){
//             System.out.println("ll is empty");
//             return;
//         }
//         Node temp=head;

//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
    
//     public static void main (String args[]){

//         LinkedList2 lli=new LinkedList2();

        // lli.print();
        
        // lli.addFirst(2);
        // lli.print();

        // lli.addFirst(1);
        // lli.print();
        
        // lli.addLast(3);
        // lli.print();

        // lli.addLast(4);
        // lli.print();


//     }

// }





//   adding data at the specific place



// import java.util.*;
// public class LinkedList2 {


    
//     public static class Node{
//         int data;
//         Node next;

//         //constructor
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;



//     public void addFirst(int data){
//         // step1= create new node
//         Node newNode=new Node(data);
//         size++; 
 
//         // if my linked list is empty
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }

//         // step2= newNode's next =head
//         newNode.next=head; //link

//         // step3 head= head=newNode
//         head=newNode;

//     }

//     public void addLast(int data){
       
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return ;
//         }

//         tail.next=newNode;

//         tail=newNode;
         
      

//     }


//       // print function to print the data 

//     public void print(){

//         if(head==null){
//             System.out.println("ll is empty");
//             return;
//         }
//         Node temp=head;

//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println();
//     }

//     // adding at specific place
//     public void add(int index,int data){
       
//         // if you are adding on the head 

//         if(index==0){
//             addFirst(data);
//             return;
//         }


//         // if you ar eadding at any other index

//         Node newNode=new Node(data); 
//         size++;

//         Node temp=head;
//         int i=0;


//         while(i<index-1){
//             temp=temp.next;
//             i++;
//         }

//         // when i=index-1 ; temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode; 

//     }


//     // removing the first element of the linked list

//     public int removeFirst(){

//         if(size==0){
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         }

//         else if(size==1){
//             int val=head.data;
//             head=tail=null;
//             return val;

//         }

//         int val=head.data;
//         head=head.next;
//         return val;

//     }


//     public int removeLast(){
//         if(size==0){
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         }

//         else if(size==1){
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }

//         //prev : i=size-2 

//         Node prev = head;
//         for(int i=0;i<size-2;i++){
//             prev=prev.next;
//         }

//         int val=tail.data; //tail.data
//         prev.next=null;
//         tail=prev;
//         size--;  
//         return val;
//     }
    
//     public static void main (String args[]){

//         LinkedList2 lli=new LinkedList2();

     
        
//         lli.addFirst(2);
   

//         lli.addFirst(1);
    
        
//         lli.addLast(4);
     

//         lli.addLast(5);
      

//        lli.add(2,3);
//        lli.print();
       
//        System.out.print(lli.size);
//        System.out.println();


//        lli.removeFirst(); 
//        lli.print();


//        lli.removeLast();
//        lli.print();
//        System.out.print(lli.size);

       
//     }

// }




// to find amy key in the linked list 


import java.util.*;
public class LinkedList2 {


    
    public static class Node{
        int data;
        Node next;

        //constructor
       public Node(int data){
           this.data=data;
           this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;



    public void addFirst(int data){
        // step1= create new node
        Node newNode=new Node(data);
        size++; 
 
        // if my linked list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }

        // step2= newNode's next =head
        newNode.next=head; //link

        // step3 head= head=newNode
        head=newNode;

    }

    public void addLast(int data){
       
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }

        tail.next=newNode;

        tail=newNode;
         
      

    }


      // print function to print the data 

    public void print(){

        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public int itsSearch(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }

        // key not found
        return -1;
    }
   

    public static void main (String args[]){

        LinkedList2 lli=new LinkedList2();

     
        
        lli.addFirst(2);

        lli.addFirst(1);
    
        lli.addLast(4);
    
        lli.addLast(5);

        lli.addLast(6);

      
     System.out.println(lli.itsSearch(2));
          System.out.println(lli.itsSearch(9));

      
       


      



       
    }

}









