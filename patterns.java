//pattern

// *****
// *****
// *****
// *****
  

//package first;
//
//import java.util.Scanner;
//
//public class patterns {
//
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//		    	for(int j=1;j<=m;j++) {
//		    		System.out.print("*");
//		    	}
//	    		System.out.println();
//
//		    	
//		}
//
//	}
//
//}




//// *****
//// *   *
//// *   *
//// ***** 
//
//package first;
//
//import java.util.Scanner;
//
//public class patterns {
//
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//		    	for(int j=1;j<=m;j++) {
//		    		if(i==1 || j==1 || i==n || j==m  ) {
//		    		
//		    		System.out.print("*");
//		    	}
//		    		else {
//		    			System.out.print(" ");
//		    		}
//		    }		
//	    		System.out.println();
//
//		    	
//		}
//
//	}
//
//}




//*
//**
//***
//****
//*****
 

//package first;
//
//import java.util.Scanner;
//
//public class patterns {
//
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
////		int m=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//		    	for(int j=1;j<=i;j++) {
//		    		System.out.print("*");
//		    	}
//	    		System.out.println();   	
//		}
//	}
//}


//################ ****
//                 ***
//                 **
//                 *



//package first;
//import java.util.*;
//class patterns {
//    public static void main(String[] args) {
//        
//        Scanner sc=new Scanner (System.in);
//        int n=sc.nextInt();
//        
//        
//        for(int i=n;i>0;i--) {
//        	for(int j=1;j<=i;j++) {
//            	System.out.print("*");
//        	}
//        	System.out.println();
//
//        }
//        
//        
//       
//    }
//}





//###########################################################33          *
//                                                                      **
//                                                                     ***
//                                                                    **** 




//package first;
//import java.util.*;
//class patterns {
//    public static void main(String[] args) {
//        
//        Scanner sc=new Scanner (System.in);
//        int n=sc.nextInt();
//        
//        
//       for(int i=1;i<=n;i++) {
//    	   
//    	   for(int space=1;space<=n-i;space++) {
//    		   System.out.print(" ");
//    	   }
//    	   
//    	   for(int j=1;j<=i;j++) {
//    		   System.out.print("*");
//    		   
//    	   }
//    	   
//		   System.out.println();
//
//       }
//        
//       
//    }
//}



// print      1
//            12
//            123
//            1234
//            12345



//package first;
//import java.util.*;
//class patterns {
//    public static void main(String[] args) {
//       
//    	Scanner sc=new Scanner (System.in);
//    	int n=sc.nextInt();
//        
//    	
//    	for(int i=1;i<=n;i++) {
//    		for(int j=1;j<=i;j++) {
//    			System.out.print(j);
//    		}
//    		System.out.println();
//    	}
//        
//       
//    }
//}


// print

//      A
//      BC
//      DEF
//      GHIJ



//package first;
//import java.util.*;
//class patterns {
//    public static void main(String[] args) {
//       
//    	Scanner sc=new Scanner (System.in);
//    	int n=sc.nextInt();
//        
//		char ch='A';
//
//    	for(int i=1;i<=n;i++) {
//    		for(int chars=1;chars<=i;chars++) {
//    			
//    			System.out.print(ch);
//    			ch++;
//    		}
//    		System.out.println();
//    	}
//       
//    }
//}


// print 
    
//   1234
//   123
//   12
//   1



//package first;
//import java.util.*;
//class patterns {
//    public static void main(String[] args) {
//       
//    	Scanner sc=new Scanner (System.in);
//    	int n=sc.nextInt();
//        
//		for(int i=n;i>0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}
//
//    	
//       
//    }
//}


//   floyds traingle

//    1
//    23
//    456
//    78910
//    11121314

//package first;
//import java.util.*;
//class patterns {
//    public static void main(String[] args) {
//       
//    	Scanner sc=new Scanner (System.in);
//    	int n=sc.nextInt();
//        
//		int ch=1;
//
//    	for(int i=1;i<=n;i++) {
//    		for(int chars=1;chars<=i;chars++) {
//    			
//    			System.out.print(ch);
//    			ch++;
//    		}
//    		System.out.println();
//    	}
//       
//    }
//}


//         




//package first;
//import java.util.*;
//class patterns {
//    public static void main(String[] args) {
//       
//    	Scanner sc=new Scanner (System.in);
//    	int n=sc.nextInt();
//        
//		for(int i=1;i<=n;i++) {
//			
////			spaces
//			for(int space=1;space<=n-i;space++) {
//                    System.out.print(" ");
//			}
//			
////			stars
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			
//		}
//       
//    }
//}



//         print 

//         1
//         01
//         101
//         0101
//         10101


//package first;
//import java.util.*;
//class patterns {
//	
//	public static void print(int n) {
//		
//	   for(int i=1;i<=n;i++) {
//		   for(int j=1;j<=i;j++) {
//			   if((i+j)%2 == 0 ) {
//				   System.out.print("1");
//			   }
//			   else {
//				   System.out.print("0");
//			   }
//		   }
//		   System.out.println();
//	   }
//		
//	}
//	
//    public static void main(String[] args) {
//       
//    	Scanner sc=new Scanner (System.in);
//    	int n=sc.nextInt();
//    	
//    	
//    	print(n);
//       
//        
//		
//    }
//}
//


//print


//          *      *
//          **    **
//          ***  ***
//          ********
//          ********
//          ***  ***
//          **    **
//          *      *




// import java.util.*;
// class patterns {
	
// 	public static void print(int n) {

// // 	   1st half 
//        for(int i=1;i<=n;i++) {
    	   
// //    	   stars-i
//     	   for(int j=1;j<=i;j++) {
//     		   System.out.print("*");
//     	   }
    	   
// //    	   spaces 2(n-i)
//     	   for(int space=1;space<=2*(n-i);space++) {
//     		   System.out.print(" ");
//     	   }
    	   
// //    	   stars-i
    	   
//     	   for( int j=1;j<=i;j++) {
//     		   System.out.print("*");
//     	   }
//     	 	  System.out.println();    	  
//        }
       
// //       2nd half
       
//  for(int i=n;i>0;i--) {
    	   
// //    	   stars-i
//     	   for(int j=1;j<=i;j++) {
//     		   System.out.print("*");
//     	   }
    	   
// //    	   spaces 2(n-i)
//     	   for(int space=1;space<=2*(n-i);space++) {
//     		   System.out.print(" ");
//     	   }
    	   
// //    	   stars-i
    	   
//     	   for( int j=1;j<=i;j++) {
//     		   System.out.print("*");
//     	   }
// 		   System.out.println();

//        }
       
// 	}
	
//     public static void main(String[] args) {
       
//     	Scanner sc=new Scanner (System.in);
//     	int n=sc.nextInt();
        	
//     	print(n);

//     }
// }




// print n=6
 
//      ******
// 	   ******
// 	  ******
//   ******
//  ******
// ******



// import java.util.*;
// class patterns3 {
    
//     public static void print(int n){
        
//         for(int i=1;i<=n;i++){
            
// 			// for space 

//             for(int space=1;space<=n-i;space++){
//                 System.out.print(" ");
//             }
            
//             // for star

//             for(int star=1;star<=n;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
    
//     public static void main(String[] args) {
        
//     Scanner sc=new Scanner (System.in);
        
//         int n=sc.nextInt();
        
//         print(n);
        
//     }
// }



// print n=6
 
//      ******
// 	   *    *
// 	  *    *
//   *    *
//  *    *
// ******



// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// import java.util.*;
// class patterns {
    
//     public static void print(int n){
        

// 		for(int i=1;i<=n;i++){
			

// 			for(int space=1;space<=n-i;space++){
// 				System.out.print(" ");
// 			}

// 			for(int star=1;star<=n;star++){
// 				if(i==n || i==1 || star==1 || star==n){
// 					System.out.print("*");
// 				}
// 				else{
// 					System.out.print(" ");
// 				}
// 			}
// 			System.out.println();
// 		}
        
//         }
        
        
    
    
//     public static void main(String[] args) {
        
//     Scanner sc=new Scanner (System.in);
        
//         int n=sc.nextInt();
        
//         print(n);
        
//     }
// }




// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;

// class patterns {
//     public static void main(String[] args) {
        
//          Scanner sc=new Scanner (System.in);
//        int n=sc.nextInt();
//     //   print(n);
        
//         for(int i=1;i<=n;i++){
            
//             // for space
//             for(int space=1;space<=n-i;space++){
//                 System.out.print(" ");
//             }
            
//             for(int star=1;star<=n;star++){
//                 if(star==1 || star==n || i==n || i==1){
//                 System.out.print("*");
//             }
//                 else{
//                       System.out.print(" ");
//                 }

//             }
//               System.out.println();
//         }
        
//     }
// }



// print   
//     1                                                  
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

// import java.util.*;
// public class patterns {

//         public static void print(int n){
           
//           for(int i=1;i<=n;i++){

//           for(int space=1;space<=n-i;space++){
//             System.out.print(" ");
//           }

//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//           }
            

//         }

//         public static void main(String[] args) {

//         Scanner sc=new Scanner (System.in);
           
//         int n=sc.nextInt();
        
//         print(n);

//         }   
// }



//  diamond print

// import java.util.*;
// public class PatternsPractice {


//     public static void print(int n){

//         // first half
//        for(int i=1;i<=n;i++){

//         for(int space=1;space<=n-i;space++){
//             System.out.print(" ");
//         }

//         for(int star=1;star<=(2*i)-1;star++){
//             System.out.print("*");
//         }

//         System.out.println();
//        }


//     //    second half

//     for(int i=n;i>0;i--){

//         for(int space=1;space<=n-i;space++){
//             System.out.print(" ");
//         }

//         for(int star=1;star<=(2*i)-1;star++){
//             System.out.print("*");
//         }

//         System.out.println();
//        }
//     }
   
//     public static void main(String[] args) {
// Scanner sc=new Scanner (System.in);

// int n=sc.nextInt();

// print(n);
//     }
// }



// diamond print

import java.util.*;
public class patterns {


    public static void print(int n){

       for(int i=1;i<=n;i++){

        for(int space=1;space<=n-i;space++){
          System.out.print(" ");
        }

        for(int des=i;des>=1;des--){
          System.out.print(des);
        }

        for(int asc=2;asc<=i;asc++){
          System.out.print(asc);
        }
        System.out.println();
       }

   
    }
   
    public static void main(String[] args) {
Scanner sc=new Scanner (System.in);

int n=sc.nextInt();

print(n);
    }
}