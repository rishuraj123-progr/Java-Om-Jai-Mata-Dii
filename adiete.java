
// *****************find index*********************

// import java.util.Scanner;

// public class adiete {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input text
//         System.out.println("Enter the text:");
//         String text = scanner.nextLine();

//         // Input pattern
//         System.out.println("Enter the pattern:");
//         String pattern = scanner.nextLine();

//        
//        

//         // Output the result
//         System.out.println( searchPattern(text, pattern));
//     }

//     // Function to search for the pattern in the text
//     private static int searchPattern(String text, String pattern) {
//         int textLength = text.length();
//         int patternLength = pattern.length();

//         // Iterate through the text
//         for (int i = 0; i <= textLength - patternLength; i++) {
//             // Check if the substring of text matches the pattern
//             if (text.substring(i, i + patternLength).equals(pattern)) {
//                 // Return the index if a match is found
//                 return i;
//             }
//         }

//         // Return -1 if no match is found
//         return -1;
//     }
// }



//                *********************************unique elements****************************


// import java.util.*;
// public class ete{
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
     
//      int arr[]=new int[n];

//      for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//      }


//      int ans=0;


//      for(int i=0;i<n;i++){
//         ans=ans^arr[i];
//      }

//      System.out.println(ans);
// }
// }




//               ***********************Sort indices***************************


// import java.util.Scanner;

// public class adiete{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input size of the array
//         System.out.println("Enter the size of the array (N):");
//         int N = scanner.nextInt();

//         // Input array of integers
//         System.out.println("Enter the array of integers (space-separated):");
//         int[] arr = new int[N];
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Call the function to sort and print the indices
//         sortAndPrintIndices(arr);
//     }

//     // Function to sort and print the indices
//     private static void sortAndPrintIndices(int[] arr) {
//         Integer[] indices = new Integer[arr.length];

//         // Initialize the indices array
//         for (int i = 0; i < arr.length; i++) {
//             indices[i] = i;
//         }

//         // Sort the indices array based on the values at those indices in descending order
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[indices[i]] < arr[indices[j]] || 
//                     (arr[indices[i]] == arr[indices[j]] && indices[i] > indices[j])) {
//                     // Swap indices if the value at the current index is less than the value at the next index
//                     // or if the values are equal, consider the index of the number that appears first
//                     int temp = indices[i];
//                     indices[i] = indices[j];
//                     indices[j] = temp;
//                 }
//             }
//         }

//         // Print the sorted indices
//         System.out.println("Sorted Indices:");
//         for (int i : indices) {
//             System.out.print(i + " ");
//         }
//     }
// }




//   *********************Prime Factorisation*****************************



// import java.util.Scanner;

// public class adiete{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();

//         System.out.println("Prime factors: ");
//         findPrimeFactors(n);
//     }

//     public static void findPrimeFactors(int n) {
//         for (int i = 2; i * i <= n; i++) {
//             while (n % i == 0) {
//                 System.out.print(i + " ");
//                 n /= i;
//             }
//         }

//         // If n is still greater than 1, it's a prime factor itself
//         if (n > 1) {
//             System.out.print(n);
//         }
//     }
// }




// *******************character with max frequency*********************



// public class adiete {
//   static char maxOccurringChar(String str) {
//      char ans = 'a';
//      int maxfreq = 0, n = str.length();
//      int count[] = new int[256];
//      for (int i = 0; i < n; i++) {
//         count[str.charAt(i)]++;
//         if (count[str.charAt(i)] > maxfreq) {
//            maxfreq = count[str.charAt(i)];
//            ans = str.charAt(i);
//         }
//      }
//      return ans;
//   }
//   public static void main(String[] args) {
//      String str = "heyhiiiihooow";
//      System.out.println("Maximum occurring character is " + maxOccurringChar(str));
//   }
// } 




//                   *********************Stair wala question**********************************

// class adiete {
//   // A simple recursive program to find
//   // n'th fibonacci number
//   static int fib(int n)
//   {
//       if (n <= 1)
//           return n;
//       return fib(n - 1) + fib(n - 2);
//   }

//   // Returns number of ways to reach s'th stair
//   static int countWays(int s) { return fib(s + 1); }

//   /* Driver program to test above function */
//   public static void main(String args[])
//   {
//       int s = 13;
//       System.out.println("Number of ways = "
//                          + countWays(s));
//   }
// }







//                           counting bits


// import java.util.Arrays;

// public class adiete{
//     public static int[] countBits(int n) {
//         int[] ans = new int[n + 1];

//         for (int i = 0; i <= n; i++) {
//             ans[i] = countOnes(i);  // Call the countOnes function for each number
//         }

//         return ans;
//     }

//     public static int countOnes(int i) {
//         int count = 0;
//         while (i > 0) {
//             count += i & 1;  // Check the last bit
//             i >>= 1;         // Shift right to check the next bit
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         int[] result = countBits(n);
//         System.out.println(Arrays.toString(result));
//     }
// }






///                                  lowest common ancestor







// import java.util.*;
// public class adiete{

//   public static class Node{
//     int data;
//     Node left;
//     Node right;

//     public Node(int data){
//       this.data=data;
//       this.left=null;
//       this.right=null;

//     }
//   }

  
//   public static Node lca(Node root,int n,int m){

//     if(root==null || root.data==n || root.data==m){
//       return root;
//     }


//     Node leftLca=lca(root.left,n,m);
//     Node rightLca=lca(root.right,n,m);

//     // leftLca== valid , rightLca==null then it means ki hamare n and m dono left side hi present hai aur left side se null aaya kyuki us side n ya fir m exist ni karta

//     if(leftLca==null){
//       return rightLca;
//     }

//     if(rightLca==null){
//       return leftLca;
//     }

//     // and if n is in left and m is in right or vice versa we will return root



//     // agar rightlca and leftlca dono null na ho to fir ham root ko return karenge 
//     return root;

    
//   }



// public static void main (String args[]){
     
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);   

//         int n1=4,n2=6;


//    System.out.println( lca(root, n1, n2).data);
       


// }
// }






//                            left view of a treee


// import java.util.LinkedList;
// import java.util.Queue;

// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         left = right = null;
//     }
// }

// public class adiete {
//     static void leftView(Node root) {
//         if (root == null) {
//             return;
//         }

//         Queue<Node> queue = new LinkedList<>();
//         queue.add(root);

//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             for (int i = 1; i <= size; i++) {
//                 Node current = queue.poll();

//                 // Print the first node at each level (leftmost node)
//                 if (i == 1) {
//                     System.out.print(current.data + " ");
//                 }

//                 if (current.left != null) {
//                     queue.add(current.left);
//                 }
//                 if (current.right != null) {
//                     queue.add(current.right);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         // Create a sample BST
//         Node root = new Node(12);
//         root.left = new Node(10);
//         root.right = new Node(30);
//         root.right.left = new Node(25);
//         root.right.right = new Node(40);

//         System.out.print("Left view: ");
//         leftView(root);
//     }
// }




//                          Count Ways to Cover Distance


// public class adiete{
//   public static int countWays(int dist) {
//       // Base cases
//       if (dist == 0) {
//           return 1;  // Only one way to cover 0 distance (no steps)
//       } else if (dist < 0) {
//           return 0;  // No way to cover a negative distance
//       }

//       // Initialize a memoization table to store the number of ways for each distance
//       int[] memo = new int[dist + 1];
//       memo[0] = 1;  // Base case for distance 0

//       // Calculate the number of ways for each distance
//       for (int i = 1; i <= dist; i++) {
//           memo[i] = memo[i - 1] + (i >= 2 ? memo[i - 2] : 0) + (i >= 3 ? memo[i - 3] : 0);
//       }

//       return memo[dist];
//   }

//   public static void main(String[] args) {
//       int dist = 14;
//       int totalWays = countWays(dist);
//       System.out.println("Total number of ways to cover " + dist + " steps: " + totalWays);
//   }
// }




//                              odd even character 


// import java.util.Scanner;

// public class adiete {
//     public static String replaceCharacters(String S) {
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < S.length(); i++) {
//             char c = S.charAt(i);
//             // Replace even characters with higher ASCII code
//             if (i % 2 == 0) {
//                 c = (char) (c + 1);
//             } else {  // Replace odd characters with lower ASCII code
//                 c = (char) (c - 1);
//             }
//             result.append(c);
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String S = scanner.nextLine();

//         String modifiedString = replaceCharacters(S);
//         System.out.println("Modified string: " + modifiedString);
//     }
// }





//                                        character difference


// import java.util.Scanner;

// public class adiete {
//     public static String insertASCIIDifferences(String S) {
//         if (S.length() <= 1) {
//             return S;  // Handle strings with 1 or 0 characters
//         }

//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < S.length() - 1; i++) {
//             char currentChar = S.charAt(i);
//             char nextChar = S.charAt(i + 1);
//             int difference = nextChar - currentChar;
//             result.append(currentChar).append(difference);
//         }
//         // Add the last character
//         result.append(S.charAt(S.length() - 1));

//         return result.toString();
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String S = scanner.nextLine();

//         String modifiedString = insertASCIIDifferences(S);
//         System.out.println("Modified string: " + modifiedString);
//     }
// }


// Java program to print left view of binary tree

/* Class containing left and right child of current
node and key value*/
// class Node {
// 	int data;
// 	Node left, right;

// 	public Node(int item)
// 	{
// 		data = item;
// 		left = right = null;
// 	}
// }

// /* Class to print the left view */
// class adiete {
// 	Node root;
// 	static int max_level = 0;

// 	// recursive function to print left view
// 	void leftViewUtil(Node node, int level)
// 	{
// 		// Base Case
// 		if (node == null)
// 			return;

// 		// If this is the first node of its level
// 		if (max_level < level) {
// 			System.out.print(node.data + " ");
// 			max_level = level;
// 		}

// 		// Recur for left and right subtrees
// 		leftViewUtil(node.left, level + 1);
// 		leftViewUtil(node.right, level + 1);
// 	}

// 	// A wrapper over leftViewUtil()
// 	void leftView()
// 	{
// 		max_level = 0;
// 		leftViewUtil(root, 1);
// 	}

// 	/* testing for example nodes */
// 	public static void main(String args[])
// 	{
// 		/* creating a binary tree and entering the nodes */
// 		adiete tree = new adiete();
// 		tree.root = new Node(10);
// 		tree.root.left = new Node(2);
// 		tree.root.right = new Node(3);
// 		tree.root.left.left = new Node(7);
// 		tree.root.left.right = new Node(8);
// 		tree.root.right.right = new Node(15);
// 		tree.root.right.left = new Node(12);
// 		tree.root.right.right.left = new Node(14);

// 		tree.leftView();
// 	}
// }













// Java program to print left view of binary tree

import java.util.*;
/* Class containing left and right child of current
node and key value*/
class Node {
	int data;
	Node left, right;

	public Node(int value)
	{
		data = value;
		left = right = null;
	}
}

/* Class to print the left view */
class BinaryTree {
	static int max_level = 0;

	Node root;
	BinaryTree(){
		root =null;
	}

	void insert(int data){
		root = insertrec(root,data);
	}

	Node insertrec(Node root,int data){
		
		if(root==null){
			return new Node(data);
		}

		if(data<root.data){
			root.left=insertrec(root.left,data);
		}

		else if(data>root.data){
			root.right=insertrec(root.right,data);
		}
       
		return root;

	}

	void leftViewUtil(Node node, int level)
	{
		if (node == null)
			return;

		if (max_level < level) {
			System.out.print(node.data + " ");
			max_level = level;
		}

		leftViewUtil(node.left, level + 1);
		leftViewUtil(node.right, level + 1);
	}

	void leftView() 
	{
		leftViewUtil(root, 1);
	}


	/* testing for example nodes */
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree();
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		for(int i=0;i<n;i++){
			int data = sc.nextInt();
			tree.insert(data);
		}

	  tree.leftView();

	}
}
