// import java.util.*;
// public class randompractice{
// public static void main (String args[]){

// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();

// int arr[]=new int[n];

// for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
// }

// for(int i=0;i<n;i++){
//     for(int j=i;j<n;j++){
//         int sum=0;
//         for(int k=i;k<=j;k++){
//            System.out.print(arr[k]+" ");
//            sum=sum+arr[k];
//         }        
    
//         System.out.print(sum);

//         System.out.println();
//     }
// }

// }
// }



// import java.util.*;
// public class randompractice{
// public static void main (String args[]){


//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     for(int i=0;i<n-1;i++){
//         for(int j=0;j<n-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;

//             }
//         }
//     }

//     for(int i=0;i<n;i++){
//     System.out.println(arr[i]);   
//  }
// }
// }





import java.util.*;
public class randompractice{
public static void main (String args[]){


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
    }

    for(int i=0;i<n;i++){
System.out.println(arr[i]);    }
}
}