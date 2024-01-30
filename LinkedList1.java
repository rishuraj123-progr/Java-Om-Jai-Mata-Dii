
// 11111111111111111111111111111111111111111111111111111111111111111111111111111111111111




// import java.util.*;
// public class LinkedList1{

//    public static class Node{
//         String data;
//         Node next;

//         //constructor

//      public Node(String data){
//         this.data=data;
//         this.next=null;
//     }
    

//     }

//     public static Node head;
//     public static Node tail;


    // // adding elemnts in the first

    // public void addFirst(String data){

    //     Node newNode=new Node(data);

    //     if(head == null){
    //         head=tail=newNode;
    //         return;
    //     }

    //     newNode.next=head;
    //     head=newNode;

    // }
   

    // // adding elements in the last

    // public void addLast(String data){
        
    //     Node newNode=new Node(data);

    //     if(tail==null){
    //         head=tail=newNode;
    //         return;
    //     }

    //     tail.next=newNode;
    //     tail=newNode;

    // }

//     //function to print 

//     public void printList(){

//         if(head==null){
//             System.out.println("ll is empty");
//             return;
//         }


//         Node currNode=head;


//         while(currNode!=null){
//             System.out.print(currNode.data+"-->");
//             currNode=currNode.next;
//         }
//         System.out.println("Null");
//     }


    
    
// public static void main (String args[]){
     
//     LinkedList1 list=new LinkedList1();
    
//     list.addFirst("a");
//     list.addFirst("is");

//     list.printList();

//     list.addLast("list");
//     list.printList();

//     list.addFirst("this");
//     list.printList();


    

// }
// }










// 22222222222222222222222222222222222222222222222222222222222222222222222


// import java.util.*;
// public class LinkedList1{

//    public static class Node{
//         String data;
//         Node next;

//         //constructor

//      public Node(String data){
//         this.data=data;
//         this.next=null;
//     }
    

//     }

//     public static Node head;
//     public static Node tail;


//         // adding elemnts in the first

//     public void addFirst(String data){

//         Node newNode=new Node(data);

//         if(head == null){
//             head=tail=newNode;
//             return;
//         }

//         newNode.next=head;
//         head=newNode;

//     }
   

//     // adding elements in the last

//     public void addLast(String data){
        
//         Node newNode=new Node(data);

//         if(tail==null){
//             head=tail=newNode;
//             return;
//         }

//         tail.next=newNode;
//         tail=newNode;

//     }



//     // delete first elements

//     public void deleteFirst(){

//         //if the linked list is empty

//         if(head == null){
//             System.out.println("The list is empty");
//             return;
//         }

//         // if the linked list is not empty
//          head=head.next;

//     }
   

//     // adding elements in the last

//     public void deleteLast(){
        
//         //if the linked list is empty
//         if(head==null){
//             System.out.println("ll is empty");
//             return;
//         }

//         //if single node
//         if(head.next==null){
//             head=null;
//             return;
//         }

//         // is the linked list is not empty

//         Node secondLast=head;
//         Node lastNode=head.next;

//         while(lastNode.next!=null){
//             lastNode=lastNode.next;
//             secondLast=secondLast.next;
//         }
//         secondLast.next=null;

//     }

//     public void printList(){

//         if(head==null){
//             System.out.println("ll is empty");
//             return;
//         }


//         Node currNode=head;


//         while(currNode!=null){
//             System.out.print(currNode.data+"-->");
//             currNode=currNode.next;
//         }
//         System.out.println("Null");
//     }

// //    public static int itrSearch(int key){

// //     int i=0;
// //     Node temp=head;

// //     while(temp!=null){
// //         if(temp.data == key){
// //             return i;
// //         }
// //         temp=temp.next;
// //         i++;
// //     }

// //        return -1;

    
// //    }
    
// public static void main (String args[]){
     
//     LinkedList1 list=new LinkedList1();
    
//     list.addFirst("a");
//     list.addFirst("is");

//     list.printList();

//     list.addLast("list");
//     list.printList();

//     list.addFirst("this");
//     list.printList();

 
//     list.deleteFirst();
//     list.printList();

//     list.deleteLast();
//     list.printList();


// }
// }





/////// 3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333


//    searching elements in linked list using iteration and recursion


// public class LinkedList1{
//    public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//         this.data=data;
//         this.next=null;
//     } 
// }

//     public static Node head;
//     public static Node tail;

//     // adding elemnts in the first

    // public void addFirst(int data){

    //     Node newNode=new Node(data);

    //     if(head == null){
    //         head=tail=newNode;
    //         return;
    //     }

    //     newNode.next=head;
    //     head=newNode;

    // }

//     // adding elements in the last

    // public void addLast(int data){
        
    //     Node newNode=new Node(data);

    //     if(tail==null){
    //         head=tail=newNode;
    //         return;
    //     }

    //     tail.next=newNode;
    //     tail=newNode;

    // }

//     // delete first elements

//     public void deleteFirst(){

//         //if the linked list is empty

//         if(head == null){
//             System.out.println("The list is empty");
//             return;
//         }

//         // if the linked list is not empty

//          head=head.next;

//     }

//     // adding elements in the last

//     public void deleteLast(){
        
//         //if the linked list is empty

//         if(head==null){
//             System.out.println("ll is empty");
//             return;
//         }

//         //if single node

//         if(head.next==null){
//             head=null;
//             return;
//         }

//         // is the linked list is not empty

//         Node secondLast=head;
//         Node lastNode=head.next;

//         while(lastNode.next!=null){
//             lastNode=lastNode.next;
//             secondLast=secondLast.next;
//         }
//         secondLast.next=null;

//     }

//     public void printList(){
//         if(head==null){
//             System.out.println("ll is empty");
//             return;
//         }
//         Node currNode=head;
//         while(currNode!=null){
//             System.out.print(currNode.data+"-->");
//             currNode=currNode.next;
//         }
//         System.out.println("Null");
//     }


//     // iterative way to search element

//    public static int itrSearch(int key){
//     int i=0;
//     Node temp=head;
//     while(temp!=null){
//         if(temp.data == key){
//             return i;
//         }
//         temp=temp.next;
//         i++;
//     }
//     return -1;
// }

             
//             //recursive way to search element


//    public static int helper(Node head,int key){

    //   if(head==null){
    //     return -1;
    //   }

    //   if(head.data==key){
    //     return 0;
    //   }

    //   int index=helper(head.next, key);

    //   if(index==-1){
    //     return -1;
    //   }

    //   return index+1;

//    }
   
    // public static int recursionSearch(int key){
    //     return helper(head,key);
    // }


//     public void reverse(){
//         Node prev=null;
//         Node curr=head;
//         Node next;

//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }

//     public static void deleteNthFromEnd(int n){
//         // calculating size of linked list
//         int size=0;
//         Node temp=head;
//         while(temp!=null){
//             temp=temp.next;
//             size++;
//         }

//         if(n==size){
//             head=head.next;
//         }

//         int i=1;
//         int indexToFind=size-n;
//         Node prev=head;

//         while(i<indexToFind){
//             prev=prev.next;
//             i++;
//         }
//         prev.next=prev.next.next;
//         return;
//     }

//     // slow fast approach to find mid
//     public Node findMid(Node head){
//         Node slow=head;
//         Node fast=head;

//         while(fast!=null && fast.next!=null){
//             slow=slow.next; //+1
//             fast=fast.next.next; // +2
//         }
//         return slow; //slow is the mid node
//     }

//     public boolean checkPalindrome(){

//         // base case
//         if(head==null || head.next==null){
//             return true;
//         }

//         // step-1 find mid
//         Node midNode=findMid(head);

//         //step-2 reverse 2nd half
//         Node prev=null;
//         Node curr=midNode;
//         Node next;

//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }

//         Node right=prev; //right half ka head
//         Node left=head;  


//         //step3 check palindrome
//         while(right!=null){
//             if(left.data!=right.data){
//                 return false;
//             }
//             left=left.next;
//             right=right.next;
//         } 
//         return true;
//     }

// public static void main (String args[]){

//     LinkedList1 list=new LinkedList1();
//     list.addFirst(1);
//     list.addLast(2);
//     list.addLast(3);
//     list.addLast(4);
//     list.addLast(5);
    
//     System.out.println(list.recursionSearch(8));


//     System.out.println(list.recursionSearch(5));
    
//     list.printList();
//     list.reverse();
//     list.printList();


//     list.deleteNthFromEnd(3);
//     list.printList();

//    System.out.println(list.checkPalindrome());

// }
// }





//   33333333333333333333333333333333333333333333333333333333333333333333333
//  check whether cycle exist or not 




// public class LinkedList1{
//    public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//         this.data=data;
//         this.next=null;
//     } 
// }

//     public static Node head;
//     public static Node tail;


    // public static boolean isCycle(){

    //     Node slow=head;
    //     Node fast=head;

    //     while(fast!=null && fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //         if(fast==slow){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

// public static void main (String args[]){

//     head =new Node(1);
//     head.next=new Node(2);
//     head.next.next=new Node(3);
//     // head.next.next.next=head;
//     // 1->2->3->1

//     System.out.println(isCycle());
    
    
    

// }
// }





////////     44444444444444444444444444444444444444444444444444444444444444444444444444444444444
                       // removing a cycle in linkedList





public class LinkedList1{
   public static class Node{
        int data;
        Node next;
        public Node(int data){
        this.data=data;
        this.next=null;
    } 
}

    public static Node head;
    public static Node tail;

        public static boolean isCycle(){

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    
    public static void removeCycle(){
        
        // step 1 --> detect cycle

        Node slow=head;
        Node fast=head;
        boolean cycle=false; //matlab cycle exist ni karti

        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        // step 2 --> find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        // step 3--> prev.next=null || lastnode.next=null
        prev.next=null;
    }

    

public static void main (String args[]){

    head =new Node(1);
    Node temp=new Node(2);
    head.next=temp;
    head.next.next=new Node(3);
    head.next.next.next=temp;
    // 1->2->3->1
    
    System.out.println(isCycle());
    removeCycle();
    System.out.println(isCycle());
    
    

}
}






//                  merge sort in linked list





// import java.util.*;
// public class LinkedList1{
//    public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//         this.data=data;
//         this.next=null;
//     } 
// }

//     public static Node head;
//     public static Node tail;

//     public void addFirst(int data){

//         Node newNode=new Node(data);

//         if(head == null){
//             head=tail=newNode;
//             return;
//         }

//         newNode.next=head;
//         head=newNode;

//     }
    

//     public void print(){
//         if(head==null){
//             System.out.println("ll is empty");
//             return;
//         }
//         Node currNode=head;
//         while(currNode!=null){
//             System.out.print(currNode.data+"-->");
//             currNode=currNode.next;
//         }
//         System.out.println("Null");
//     }

//     public Node getMid(Node head){
//         Node slow=head;
//         Node fast=head.next;

//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }

//         return slow;
//     }

//     public Node merge(Node head1,Node head2){
//         Node mergedLL=new Node(-1);
//         Node temp=mergedLL;

//         while(head!=null && head2!=null){
//             if(head1.data<=head2.data){
//                 temp.next=head1;
//                 head1=head1.next;
//                 temp=temp.next;
//             }
//             else{
//                 temp.next=head2;
//                 head2=head2.next;
//                 temp=temp.next;
//             }
//         }
         
//         while(head1!=null){
//             temp.next=head1;
//             head1=head1.next;
//             temp=temp.next;
//         }

//         while(head2!=null){
//             temp.next=head2;
//             head2=head2.next;
//             temp=temp.next;
//         }
//         return mergedLL.next;

//     }

//     public Node mergeSort(Node head){

//         if(head==null || head.next==null){
//             return head;
//         }
      
//         // find mid
//         Node mid=getMid(head);
        

//       // make two half of the linked list left mergeSort and right mergeSort
//         Node rightHead=mid.next;
//         mid.next=null;
//         Node newLeft=mergeSort(head);
//         Node newRight=mergeSort(head);

//         //merge
//         return merge(newLeft,newRight);

//     }
// public static void main (String args[]){

    
//     LinkedList1 list=new LinkedList1();
    
    
//     list.addFirst(1);
//         list.addFirst(2);
//     list.addFirst(3);
//         list.addFirst(4);
//     list.addFirst(5);

//       // 5-4-3-2-1

//        list.print();
//        list.head=list.mergeSort(list.head);
//        list.print();




    
    
   
    
    

// }
// }





//                                              change a linked list into zig zag




// import java.util.*;
// public class LinkedList1{
//    public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//         this.data=data;
//         this.next=null;
//     } 
// }

//     public static Node head;
//     public static Node tail;

//      public void addLast(int data){
        
//         Node newNode=new Node(data);

//         if(tail==null){
//             head=tail=newNode;
//             return;
//         }

//         tail.next=newNode;
//         tail=newNode;

//     }

//     public void addFirst(int data){

//         Node newNode=new Node(data);

//         if(head == null){
//             head=tail=newNode;
//             return;
//         }

//         newNode.next=head;
//         head=newNode;

//     }
    

//     public void print(){
//         if(head==null){
//             System.out.println("ll is empty");
//             return;
//         }
//         Node currNode=head;
//         while(currNode!=null){
//             System.out.print(currNode.data+"-->");
//             currNode=currNode.next;
//         }
//         System.out.println("Null");
//     }


//     public void zigZag(){
       
//        // find mid

//         Node slow=head;
//         Node fast=head.next; 

//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }

//         Node mid=slow;


//         // reverse 2nd half

//         Node curr=mid.next;
//         mid.next=null; //first half linked list ko tod diya
//         Node prev=null;
//         Node next;

//         while(curr!=null){
//              next=curr.next;
//              curr.next=prev;
//              prev=curr;
//              curr=next;
             
//         }
        
//         Node lefthead=head;
//         Node righthead=prev;
//         Node nextLeft,nextRight;

//         // alt merge - zig-zag merge

//         while(lefthead!=null && righthead!=null){
//             nextLeft=lefthead.next;
//             lefthead.next=righthead; // hamne 1 ko 6 se match karwaya lekin hame 2 ko kahi to rakhna hoga na isiliye hamne 2 ko store kar diya nextLeft me
//             nextRight=righthead.next;
//             righthead.next=nextLeft;


//             lefthead=nextLeft;
//             righthead=nextRight;

//         }

//     }
    
// public static void main (String args[]){

    
//     LinkedList1 list=new LinkedList1();
    
    
//     list.addLast(1);
//         list.addLast(2);
//     list.addLast(3);
//         list.addLast(4);
//     list.addLast(5);

//       // 1-2-3-4-5

//       list.print();
//       list.zigZag();
//       list.print();

      




    
    
   
    
    

// }
// }





//                                   doubly linked list


// public class LinkedList1{

//     public class Node{
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//             this.prev=null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;


//     public void addFirst(int data){
       
//         // create a new node 
//         Node newNode=new Node(data);
        
//         size++;

//         if(head==null){
//             head=tail=newNode;
//             return;
//         }

//          newNode.next=head;
//          head.prev=newNode;
//          head=newNode;

//     }


//     public void print(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println("Null");
//     }

//     public int removeFirst(){

//         if(head==null){
//             System.out.println("Dll is emoty");
//             return Integer.MIN_VALUE;
//         }

//         if(size==1){
//             int val=head.data;
//             head=tail=null;
//             size--;
//             return val;
//         }

//         // 3 steps
//        // 1 - head ka value store kara diya kisi integer me
//        // 2 - head.next karke next waale ko head bana diya
//        // 3 - head.pre karke purane head ko null appoint kar diya
//         int val=head.data;
//         head=head.next;
//         head.prev=null;
//         size--;

//         return val;
//     }
    
//     public void reverse(){

//         Node curr=head;
//         Node prev=null;
//         Node next;

//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             curr.prev=next;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }


// public static void main (String args[]){   

//     LinkedList1 ll=new LinkedList1();

//     ll.addFirst(3);
//     ll.addFirst(2);
//     ll.addFirst(1);

//     // ll.print();
//     // System.out.println(ll.size);

//     // ll.removeFirst();
//     // ll.print();
//     // System.out.println(ll.size);

//     ll.print();
//     ll.reverse();
//     ll.print();
// }
// }

