
// //                               Activity Selection




// import java.util.*;
// public class GreedyAlgo{
// public static void main (String args[]){
//    Scanner sc=new Scanner(System.in);
   
//    int start[]={1,3,0,5,8,5};
//    int end[]={2,4,6,7,9,9};

//    // end time k basis pe sorted hai

//    int count=0;
//    ArrayList<Integer>ans=new ArrayList<>();

//    //1st Activity
//    count=1;
//    ans.add(0);
//    int lastEnding=end[0];

//    for(int i=1;i<end.length;i++){
//     if(start[i]>=lastEnding){
//       count++;
//       lastEnding=end[i];
//       ans.add(i);
//     }
//    }

//    System.out.println("max activities=" + count);

//    for(int i=0;i<ans.size();i++){
//     System.out.print("A"+ans.get(i)+" ");
//    }
//    System.out.println();


// }
// }





//                      activity selection if the end array is not sorted 



// import java.util.*;
// public class GreedyAlgo{
// public static void main (String args[]){
//    Scanner sc=new Scanner(System.in);
   
//    int start[]={1,3,0,5,8,5};
//    int end[]={2,4,6,7,9,9};


//    // sorting 
//    int activities[][]=new int[start.length][3];
//    for(int i=0;i<start.length;i++){
//     activities[i][0]=i;
//     activities[i][1]=start[i];
//     activities[i][2]=end[i];
//    }

//    // lambda function --> shortform
//    Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

//    // end time k basis pe sorted hai

//    int count=0;
//    ArrayList<Integer>ans=new ArrayList<>();

//    //1st Activity
//    count=1;
//    ans.add(activities[0][0]);
//    int lastEnding=activities[0][2];

//    for(int i=1;i<end.length;i++){
//     if(activities[i][1]>=lastEnding){
//       count++;
//       lastEnding=activities[i][2];
//       ans.add(activities[i][0]);
//     }
//    }

//    System.out.println("max activities=" + count);

//    for(int i=0;i<ans.size();i++){
//     System.out.print("A"+ans.get(i)+" ");
//    }
//    System.out.println();


// }
// }






//               Knap Sack Problem


// import java.util.*;
// public class GreedyAlgo{
// public static void main (String args[]){
  
//   int val[]={60,100,120};
//   int weight[]={10,20,30};

//   int w=50;

//   double ratio[][]=new double[val.length][2];
//   // 0th col --> original index
//   // 1st col -> index

//   for(int i=0;i<val.length;i++){
//     ratio[i][0]=i;
//     ratio[i][1]=val[i]/(double)weight[i];
//   }

//   // Ascending order
//   Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

//   int capacity=w;
//   int finalVal=0;

//   for(int i=ratio.length-1;i>=0;i--){
//     int HighRatioIndex=(int)ratio[i][0];
//        if(capacity>=weight[HighRatioIndex]){
//          finalVal+=val[HighRatioIndex];
//          capacity-=weight[HighRatioIndex];
//        }
//        else{
//         // include fractionally
//         finalVal+=(ratio[i][1]*capacity);
//         capacity=0;
//         break; 
//        }
//   }

//   System.out.println("Final val = " + finalVal);
// }
// }






//                                    Minimum absolute value

// import java.util.*;
// public class GreedyAlgo{
// public static void main (String args[]){

//   int a[]={4,1,8,7};
//   int b[]={2,3,6,5};

//   Arrays.sort(a);
//   Arrays.sort(b);

//   int minDiff=0;

//   for(int i=0;i<a.length;i++){
    
//     minDiff=minDiff+Math.abs(a[i]-b[i]);
//   }
// System.out.println("Min Absolute --> " + minDiff);
// }
// }






//        maximumlength chain of pairs


// import java.util.*;
// public class GreedyAlgo{
// public static void main (String args[]){

//   int pairs[][]={{5,24} , {39,60},{5,28},{27,40},{50,90}};

//   Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

//   int chainLength=1;
//   int lastEnding=pairs[0][1];

//   for(int i=1;i<pairs.length;i++){
//     if(pairs[i][0]>lastEnding){
//       chainLength++;
//       lastEnding=pairs[i][1];
//     }
     
//   }

//   System.out.println("Max length of chain = " + chainLength );

// }
// }






//                Indian Coins 



// import java.util.*;
// public class GreedyAlgo{
// public static void main (String args[]){
    
//   Integer coins[]={1,2,5,10,20,50,100,500,2000};
  
//   Arrays.sort(coins,Comparator.reverseOrder());

//   int countOfCoins=0;
//   int amount=590;
//   ArrayList<Integer>list=new ArrayList<>();

//   for(int i=0;i<coins.length;i++){
//     if(coins[i]<=amount){
//       while(coins[i]<=amount){
//         countOfCoins++;
//         list.add(coins[i]);
//         amount-=coins[i];
//       }
//     }

//   }

//   System.out.println("total minimum coins used "+ countOfCoins);


//   for(int k=0;k<list.size();k++){
//     System.out.print(list.get(k)+" ");
//   }
//   System.out.println();


// }
// }




//              Job sequencing waaaalaaa question nahi kiya





//                  chocola problem 


// import java.util.*;

// public class GreedyAlgo {
//     public static void main(String args[]) {

//         int n = 4;
//         int m = 6;

//         Integer costVer[] = {2, 1, 3, 1, 4}; // m-1
//         Integer costHor[] = {4, 1, 2}; // n-1

//         Arrays.sort(costVer, Comparator.reverseOrder());
//         Arrays.sort(costHor, Comparator.reverseOrder());

//         int h = 0;
//         int v = 0;
//         int hp = 1, vp = 1;
//         int finalCost = 0;

//         // vertical cost < horizontal cost
//         while (h < costHor.length && v < costVer.length) {  // horizontal cut
//             if (costVer[v] <= costHor[h]) {
//                 finalCost += costHor[h] * vp;
//                 hp++;
//                 h++;
//             } else {
//                 finalCost += costVer[v] * hp;
//                 vp++;
//                 v++;
//             }
//         }

//         // if there are remaining horizontal cuts
//         while (h < costHor.length) {
//             finalCost += costHor[h] * vp;
//             hp++;
//             h++;
//         }
//         // if there are remaining vertical cuts
//         while (v < costVer.length) {
//             finalCost += costVer[v] * hp;
//             vp++;
//             v++;
//         }

//         System.out.println("Minimum cost of breaking the chocolate is -->" + finalCost);
//     }
// }
