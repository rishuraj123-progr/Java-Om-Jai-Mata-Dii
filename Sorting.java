
//                                    bubble sort 



// import java.util.*;
// public class Sorting {
    
//     public static void bubbleSort(int arr[],int n){


//         int swaps=0;

//         for(int turn=1;turn<n;turn++){
//             for(int j=0;j<=n-2;j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     swaps++;
//                 }
//             }
//         }

//         System.out.println(swaps);

//     }    
//     public static void printArray(int arr[],int n){

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]);
//         }
    
//     }

//     public static void main(String[] args) {

//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
        
//         int arr[]=new int[n];
        
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
        
//         bubbleSort(arr,n);
//         printArray(arr,n);
//             }
//     }




//                                                      selection sort

// import java.util.*;
// public class Sorting {
    
//     public static void selectionSort(int arr[],int n){


//         for(int i=0;i<n-2;i++){
//             int minPost=i;   

//             for(int j=i+1;j<n;j++){
//                  if(arr[minPost]>arr[j]){
//                     minPost=j;
//                  }

//             }
//                      //swap

//               int temp=arr[minPost];
//               arr[minPost]=arr[i];
//               arr[i]=temp;

//             }
//         }
        
//         //to print an array
//     public static void printArray(int arr[],int n){

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
    
//     }

//     public static void main(String[] args) {

//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
        
//         int arr[]=new int[n];
        
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
        
//         selectionSort(arr,n);
//         printArray(arr,n);
//             }
//     }








//                                              insertion sort




// import java.util.*;
// public class Sorting {
    
//     public static void insertionSort(int arr[],int n){


//         for(int i=0;i<n;i++){
//             int currElement=arr[i];   
//             int prevElement=i-1;

//             while(prevElement>=0 && arr[prevElement] >currElement){
//                 arr[prevElement+1]=arr[prevElement];
//                 prevElement--;
//             }
//             //insertion
//             arr[prevElement+1]=currElement;
//         }
//     }    
//         //to print an array
//     public static void printArray(int arr[],int n){

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
    
//     }

//     public static void main(String[] args) {

//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
        
//         int arr[]=new int[n];
        
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
        
//         insertionSort(arr,n);
//         printArray(arr,n);
//             }
//     }





//                             counting sort



import java.util.*;
public class Sorting {
    
    public static void countingSort(int arr[],int n){

       
       int largest=Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
        largest=Math.max(largest,arr[i]);
       }


       int count[]=new int[largest+1];

       for(int i=0;i<n;i++){
        count[arr[i]]++;
       }

    //    sorting 
    
    int j=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
    }   
        //to print an array
    public static void printArray(int arr[],int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        countingSort(arr,n);
        printArray(arr,n);
            }
    }


