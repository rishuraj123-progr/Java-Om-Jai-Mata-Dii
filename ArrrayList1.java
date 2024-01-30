                                               // syntax for arrayslist



// import java.util.*;
// public class ArrayList1{
//     public static void main (String args[]){ 

//       ArrayList<Integer> list=new ArrayList<>();
//       ArrayList<String> list2=new ArrayList<>();      


//     }
    
// }








//                                 operations in arraylist






// import java.util.*;
// public class ArrrayList1{
//     public static void main (String args[]){ 

//       ArrayList<Integer> list=new ArrayList<>();
//       ArrayList<String> list2=new ArrayList<>();      
      

//       // adding elements in arraylist
//       list.add(1);
//       list.add(2);
//       list.add(3);
//       list.add(4);
//       list.add(5);
//       System.out.println(list);


//       // getting elements on the index
//       int ele=list.get(2);
//       System.out.println(ele);


//       //remove elements from the index
//       int ele2=list.remove(3);
//       System.out.println(list);


//       // set elements 
//       int ele3=list.set(2,100);
//       System.out.println(list);


//       //contains element (searches whether the element is present or not)
//       boolean ele4=list.contains(4);
//       System.out.println(ele4);


//       // kisi index pe jaake value append karana hai ham ye v kar sakte hai
//       list.add(2,10);


//       System.out.println(list);
//     }
    
// }





//                       finding size of arraylist and printing elements of arraylist


// import java.util.*;
// public class ArrayList1{
//     public static void main (String args[]){ 

//       ArrayList<Integer> list=new ArrayList<>();
//       ArrayList<String> list2=new ArrayList<>();      
      

//       // adding elements in arraylist
//       list.add(1);
//       list.add(2);
//       list.add(3);
//       list.add(4);
//       list.add(5);
      
//       System.out.println(list.size());

//       for(int i=0;i<list.size();i++){
//         System.out.print(list.get(i));
//       }

//     }
    
// }




//                             reverse of an arraylist


// import java.util.*;
// public class ArrayList1{
//     public static void main (String args[]){ 

//       ArrayList<Integer> list=new ArrayList<>();
//       ArrayList<String> list2=new ArrayList<>();      
      

//       // adding elements in arraylist
//       list.add(1);
//       list.add(2);
//       list.add(3);
//       list.add(4);
//       list.add(5);
      
//       System.out.println(list.size());

//       for(int i=list.size()-1;i>=0;i--){
//         System.out.print(list.get(i));
//       }

//     }
    
// }


//                        find max element in arraylist


// import java.util.*;
// public class ArrayList1{
//     public static void main (String args[]){ 

//       ArrayList<Integer> list=new ArrayList<>();
          
      

//       // adding elements in arraylist
//       list.add(1);
//       list.add(2);
//       list.add(3);
//       list.add(4);
//       list.add(5);
      
//       int max=Integer.MIN_VALUE;

//       for(int i=0;i<list.size();i++){
       
//         if(max<list.get(i)){
//             max=list.get(i);
//         }
//       }

//       System.out.print("max element " + max);

//     }
    
// }





           //                         swapping elements in arraylist with the given indexes(1,3)






// import java.util.*;
// public class ArrrayList1{
    
//     public static void swap(ArrayList<Integer>list,int index1,int index2){

//         int temp=list.get(index1);
//         list.set(index1,list.get(index2));
//         list.set(index2,temp);


//         System.out.println(list);
//     }

//     public static void main (String args[]){ 

//       ArrayList<Integer> list=new ArrayList<>();
          
    
//       list.add(1);
//       list.add(2);
//       list.add(3);
//       list.add(4);
//       list.add(5);
      
//       int index1=1;
//       int index2=3;
      
      
//       swap(list,index1,index2);
      
    
//     }
    
// }






//                  sorting an arraylist





// import java.util.*;
// public class ArrrayList1{

//     public static void main (String args[]){ 

//       ArrayList<Integer> list=new ArrayList<>();
          
    
//       list.add(1);
//       list.add(2);
//       list.add(3);
//       list.add(4);
//       list.add(5);
      
//     //   Collections.sort(list);
//     //   System.out.println(list); //sorting in ascending order
      
//       //sorting in descending order
      
//       Collections.sort(list,Collections.reverseOrder());
//       System.out.print(list);
    
//     }
    
// }
   








 //                                          multi dimensional arraylist likek 2d arrays syntax






//  import java.util.*;
//  public class ArrrayList1{
//  public static void main (String args[]){
 
//mainList bana liya jisme list1 and list2 store hoga

//        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

//list1 me add kiya  

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        mainList.add(list);
 
    
//list2 me add kiya
 
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(3);       
//        list2.add(4);       
//        mainList.add(list2);
 

 

//        // internally in java abhi tak ek array jaise structure me [ list || list2 ] store hogaya hoga mainList me
 



//        for(int i=0;i<mainList.size();i++){
//           ArrayList<Integer>currList=mainList.get(i);
//           for(int j=0;j<currList.size();j++){
//            System.out.print(currList.get(j)+" ");
//           }
//           System.out.println();
//        }
//        System.out.println(mainList);
//  }
//  }
 
 



//                  making this 
                    // [2,4,6,8,10]
                    // [3,6,9,12,15]
                    // [5,10,15,20,25]


  



// import java.util.*;
//  public class ArrrayList1{
//  public static void main (String args[]){
 
//        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>();

//        for(int i=1;i<=5;i++){

//         list.add(i*1);
//         list2.add(i*3);
//         list3.add(i*5);

//        }


//      // mainList me add kiya

//       System.out.print(mainList.add(list));
//       mainList.add(list2);
//       mainList.add(list3);
 
//       //  internally in java abhi tak ek array jaise structure me list || list2 store hogaya hoga
 

//        System.out.println(mainList);
      
//  }
//  }







   //                                 container with most water (method 1) O(n^2)

   




 
//    import java.util.*;
//    public class ArrrayList1{

//     public static int storeWater(ArrayList<Integer>height){

//       int maxWater=0;


// // brute force


//       for(int i=0;i<height.size();i++){
//         for(int j=i+1;j<height.size();j++){
//           int hgt=Math.min(height.get(i),height.get(j));
//           int width=j-i;
//           int currWater=hgt*width;

//           maxWater=Math.max(maxWater,currWater);
//         }
//       }

//       return maxWater;
//     }
//    public static void main (String args[]){
   
//     ArrayList<Integer> height= new ArrayList<>();
//     // 1,8,6,2,5,4,8,3,7
    
//     height.add(1);
//     height.add(8);
//     height.add(6);
//     height.add(2);
//     height.add(5);
//     height.add(4);
//     height.add(8);
//     height.add(3);
//     height.add(7);
    
         
//         System.out.print(storeWater(height));
//    }
//    }
   
   
   
  
//                                 (method 2)   O(n)
   
   

// import java.util.*;
// public class ArrrayList1{

//  public static int storeWater(ArrayList<Integer>height){

//    int maxWater=0;

//    int leftPointer=0;
//    int rightPointer=height.size()-1;

//    while(leftPointer<rightPointer){
     
//     int height2=Math.min(height.get(leftPointer),height.get(rightPointer));
//     int width=rightPointer-leftPointer;

//     int currentWater=height2*width;

//     maxWater=Math.max(currentWater,maxWater);


//     if(leftPointer<rightPointer){
//       leftPointer++;
//     }
//     else{
//       rightPointer--;
//     }

//    }

//    return maxWater;


//  }
// public static void main (String args[]){

//  ArrayList<Integer> height= new ArrayList<>();
//  // 1,8,6,2,5,4,8,3,7
 
//  height.add(1);
//  height.add(8);
//  height.add(6);
//  height.add(2);
//  height.add(5);
//  height.add(4);
//  height.add(8);
//  height.add(3);
//  height.add(7);
 
      
//      System.out.print(storeWater(height));
// }
// }





//                                           find target sum in arrayList if exist

// import java.util.ArrayList;

// public class ArrrayList1{

//    public static boolean target(ArrayList<Integer>list,int target){


//       for(int i=0;i<list.size();i++){
//         for(int j=i+1;j<list.size();j++){
//          if(list.get(i)+list.get(j)==target){
//             return true;
//          }
//         }
//       }

//       return false;
//    }

// public static void main (String args[]){


// ArrayList<Integer>list=new ArrayList<>();


// // 1,2,3,4,5,6
// list.add(1);
// list.add(2);
// list.add(3);
// list.add(4);
// list.add(5);
// list.add(6);

// int target=5;

// System.out.print(target(list,5));



// }
// }







//                      method 2 (optimised)




// import java.util.ArrayList;

// public class ArrrayList1{

//    public static boolean target(ArrayList<Integer>list,int target){

    
//       int start=0;
//       int end=list.size()-1;

//       while(start!=end){

//          if(list.get(start)+list.get(end)==target){
//             return true;
//          }

//          else if(list.get(start)+list.get(end)>target){
//             end--;
//          }

//          else if(list.get(start)+list.get(end)<target){
//             start++;
//          }

         
//       }

//       return false;


      
//    }

// public static void main (String args[]){


// ArrayList<Integer>list=new ArrayList<>();


// // 1,2,3,4,5,6
// list.add(1);
// list.add(2);
// list.add(3);
// list.add(4);
// list.add(5);
// list.add(6);

// int target=80;

// System.out.print(target(list,target));



// }
// }





        //     search in rotated arrayList

import java.util.*;
        public class ArrrayList1{


        public static boolean target(ArrayList<Integer>list,int target){
              
         int n=list.size();
         int bp=-1;    
//       breaking point

         for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
               bp=i;
               break;
            }
         }
         int lp=bp+1;
         int rp=bp;

         while(lp !=rp){
            //case 1
            if(list.get(lp)+list.get(rp)==target){
               return true;
            }
             
            else if(list.get(lp)+list.get(rp)<target){
               lp=(lp+1)%n;
            }

            else{
               rp=(n+rp-1)%n;
            }

         }

         return false;

        }
        public static void main (String args[]){

         ArrayList<Integer>list=new ArrayList<>();


         // 1,2,3,4,5,6
         list.add(11);
         list.add(15);
         list.add(6);
         list.add(8);
         list.add(9);
         
         int target=80;
         
         System.out.print(target(list,target));
         


        }
        }










