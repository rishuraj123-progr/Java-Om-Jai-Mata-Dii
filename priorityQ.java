
//                  basic add , remove and peek in pq 
// add --> 0(log n)
//peek --> 0(1)
// remove --> 0(log n)


// import java.util.*;
// public class priorityQ{
// public static void main (String args[]){

  //  PriorityQueue<Integer>pq=new PriorityQueue<>();

  //  pq.add(3); //O(log n)
  //  pq.add(4);
  //  pq.add(1);
  //  pq.add(7);

  //  while(!pq.isEmpty()){
  //   System.out.println(pq.peek()); // 0(1)
  //   pq.remove(); //0(logn)
  //  }

// }
// }



//             Priority Queue for Objects 



// import java.util.*;
// public class priorityQ{

//   static class Student implements Comparable<Student>{
//     String name;
//     int rank;


//     public Student(String name , int rank){
//       this.name=name;
//       this.rank=rank;
//     }

//     @Override
//     public int compareTo(Student s2){
//       return this.rank-s2.rank;
//     }    
//   }
// public static void main (String args[]){
   
    //  PriorityQueue<Student>pq=new PriorityQueue<>();

//    pq.add(new Student("A",4)); //O(log n)
//    pq.add(new Student("B",5));
//    pq.add(new Student("C",2));
//    pq.add(new Student("D",12));

//    while(!pq.isEmpty()){
//     System.out.println(pq.peek().name+   " --> " + pq.peek().rank); // 0(1)
//     pq.remove(); //0(logn)
//    }

// }
// }






//            insert an element in heap 


// import java.util.*;
// public class priorityQ{

//   static class Heap{

//     ArrayList<Integer>arr=new ArrayList<>();


//     public void add(int data){  //0(log n)
      
//       // adding at last index
//       arr.add(data);

//       // finding parent index
//       int x=arr.size()-1; //x is child's index

//       int par=(x-1)/2; // parent's index

//       while(arr.get(x)<arr.get(par)){
//         // swap karate raho if parent is < than x

//         int temp=arr.get(x);
//         arr.set(x,arr.get(par));
//         arr.set(par,temp);

//         x=par;
//         par=(x-1)/2;
//       }
//     }

//     public int peek(){
//         return arr.get(0);
//       }

//                              //heapify   

//       private void heapify(int i){
//         int left=2*i+1;
//         int right=2*i+2;
//         int minIndex=i;

//         if(left<arr.size() &&  arr.get(minIndex)>arr.get(left)){  // we will check kahi arr ki size left se badi to nahi and also left wala 
//           // element arr[minIndex] se agar chota hai to use ham store kara denge minIndex me   
//           minIndex=left;
//           }

//           if(right<arr.size() && arr.get(minIndex)>arr.get(right)){
//             minIndex=right;
//           }

//           // agar minIndex ka value update hua hai to ham swap kar denge min value ko at top

//           if(minIndex!=i){
//             //swap
//             int temp=arr.get(i);
//             arr.set(i,arr.get(minIndex));
//             arr.set(minIndex, temp);


//             heapify(minIndex);


//           }
//       }


//       public int remove(){
//         int data=arr.get(0);


//         // step1 = swap first and last 
//         int temp=arr.get(0);
//         arr.set(0,arr.get(arr.size()-1));
//         arr.set(arr.size()-1,temp);


//         // step2 = delete last
         
//         arr.remove(arr.size()-1);


//         // step3 = heapify
//             heapify(0);
//             return data;
      
//       }


//       public boolean isEmpty(){
//         return arr.size()==0;
//       }


//   }
// public static void main (String args[]){
//   Heap h=new Heap();
//   h.add(3);
//   h.add(4);
//   h.add(1);
//   h.add(5);


//   while(!h.isEmpty()){
//     System.out.println(h.peek());
//     h.remove();
//   }


// }
// }








//                                         Heap Sort




// import java.util.*;
// public class priorityQ{


//   public static void heapify(int arr[],int i,int size){
//     int left=2*i+1;
//     int right=2*i+2;
//     int maxIndex=i;
    
//     // ham yaha 
//     if(left<size && arr[left]>arr[maxIndex]){
//           maxIndex=left;
//     }

//     if(right<size && arr[right]>arr[maxIndex]){
//       maxIndex=right;
//     }

//     if(maxIndex!=i){
//       int temp=arr[i];
//       arr[i]=arr[maxIndex];
//       arr[maxIndex]=temp;

//       heapify(arr, maxIndex, size);;
//     }


//   }

//   public static void heapSort(int arr[]){
       
//     //step-1 build maxHeap
//     int n=arr.length;

//     for(int i=n/2;i>=0;i--){
//       heapify(arr,i,n);
//     }

//     //step--2 --> pust largest at end

//     for(int i=n-1;i>0;i--){
//       int temp=arr[0];
//       arr[0]=arr[i];
//       arr[i]=temp;

//       heapify(arr,0,i);
//     }
//   }
// public static void main (String args[]){
    
//   int arr[]={1,2,4,5,3};

//   heapSort(arr);

//   for(int i=0;i<arr.length;i++){
//     System.out.println(arr[i]+" ");
//   }
//   System.out.println();

// }
// }







//                                     counting cars


// import java.util.*;
// public class priorityQ{

//   static class Point implements Comparable<Point>{
//     int x;
//     int y;
//     int distSq;
//     int i;


//     public Point(int x,int y,int distSq,int i){
//         this.x=x;
//         this.y=y;
//         this.distSq=distSq;
//         this.i=i;
//     }

//     @Override
//     public int compareTo(Point p2){
//       return this.distSq-p2.distSq;  // ascending order
//       // if we wanna do it for in descending then ya to 
//       // 1--> p2.distSq - this.distSq
//       // 2--> priority queue me reverseOrder pass karna hoga

//     }
//   }
// public static void main (String args[]){

//   int pts[][]={{3,3},{5,-1},{-2,4}};
//   int k=2;

//   PriorityQueue<Point>pq=new PriorityQueue<>();

//   for(int i=0;i<pts.length;i++){
//     int distSq=pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
//     pq.add(new Point(pts[i][0],pts[i][1],distSq,i));
//   }

//   for(int i=0;i<k;i++){
//     System.out.println("C"+pq.remove().i);
//   }



// }
// }





//                                     connect n ropes with less cost



// import java.util.*;
// public class priorityQ{
// public static void main (String args[]){

//   int ropes[]={2,3,3,4,6};
  
//   PriorityQueue<Integer>pq=new PriorityQueue<>();

//   for(int i=0;i<ropes.length;i++){
//     pq.add(ropes[i]);
//   }

//   int cost=0;

//   while(pq.size()>1){
//     int min1=pq.remove();
//     int min2=pq.remove();

//      cost=cost+min1+min2;
     
//      pq.add(min1+min2);

//   }

//   System.out.println(cost);
// }
// }












// Weakest Soldiers


import java.util.*;
public class priorityQ{

 public static class Row implements Comparable <Row>{
    int Soldiers;
    int index;

    public Row(int Soldiers,int index){
      this.Soldiers=Soldiers;
      this.index=index;
    }

    @Override 
    
    public int compareTo(Row a2){
      if(this.Soldiers==a2.Soldiers){ // agar soldiers ka count equal hai to fir compare according to index
        return this.index-a2.index;
      } 
      else{  // agar soldiers ka count equal nai hai to fir sort according to no of soldiers
        return this.Soldiers-a2.Soldiers;
      }

    }
  }
public static void main (String args[]){

  int army[][]={{1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}};
                
  int k=2;

  PriorityQueue<Row>pq =new PriorityQueue<>();

  for(int i=0;i<army.length;i++){
    int count=0;
    for(int j=0;j<army[0].length;j++){
      if(army[i][j]==1){
        count=count+1;
      }
      else{
        count=count+0;
      }
    
    }
    pq.add(new Row(count,i));
  }

  for(int i=0;i<k;i++){
    System.out.println("R"+pq.remove().index);
  }


}
}  