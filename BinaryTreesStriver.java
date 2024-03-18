
//           ************LEVELORDER TRAVERSAL****************


// import java.util.*;
// public class BinaryTreesStriver{

//   public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//           this.data=data;
//           this.left=left;
//           this.right=right;
//         }
//   } 


//   public static ArrayList<ArrayList<Integer>> levelOrder(Node root){
//      ArrayList<ArrayList<Integer>>ansList=new ArrayList<ArrayList<Integer>>();

//      if(root==null)return ansList;
     
//      //queue that willl consist of node
//      Queue<Node>q=new LinkedList<>();

//      q.add(root);

//      while(!q.isEmpty()){
      
//       ArrayList<Integer>subList=new ArrayList<>();

//       int currDepth=q.size();

//       for(int i=1;i<=currDepth;i++){

//         if(q.peek().left!=null){
//           q.add(q.peek().left);
//         }

//         if(q.peek().right!=null){
//           q.add(q.peek().right);
//         }
//         subList.add(q.poll().data);
//       }

//       ansList.add(subList);

//      }

//      return ansList;

//   }
// public static void main (String args[]){

//   Node root = new Node(1);
//   root.left = new Node(2);
//   root.right = new Node(3);
//   root.left.left = new Node(4);
//   root.left.right = new Node(5);
//   root.right.left = new Node(6);
//   root.right.right = new Node(7); 


//   System.out.print(levelOrder(root));
  
// }
// }




//   Iterative preOrder Traversal (without recusion)




// import java.util.*;
// public class BinaryTreesStriver{

//   public static class Node{
//     int data;
//     Node left;
//     Node right;

//      public Node(int data){
//       this.data=data;
//       this.right=null;
//       this.left=null;
//      }
//   }
   
//   public static ArrayList<Integer> preOrder(Node root){

//      ArrayList<Integer>ansList=new ArrayList<>();

//     if(root==null)return ansList;

//     Stack<Node>st=new Stack<>();
     
//     st.push(root);

//     while(!st.isEmpty()){
//       root=st.pop();
//       ansList.add(root.data);

//       if(root.right!=null){
//         st.push(root.right);
//       }

//       if(root.left!=null){
//         st.push(root.left);
//       }

//     }

//     return ansList;
//   }

// public static void main (String args[]){
//   Node root = new Node(1);
//     root.left = new Node(2);
//     root.right = new Node(3);
//     root.left.left = new Node(4);
//     root.left.right = new Node(5);
//     root.left.right.left = new Node(6);
//     root.right.left = new Node(7);
//     root.right.right = new Node(8); 
//     root.right.right.left = new Node(9);
//     root.right.right.right = new Node(10);


  
//     System.out.print(preOrder(root));


// }
// }








//                          Itertive way for inOrder (without recursion)


// import java.util.ArrayList;
// import java.util.Stack;

// public class BinaryTreesStriver {

//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.right = null;
//             this.left = null;
//         }
//     }

//     public static ArrayList<Integer> inOrder(Node root) {
//         ArrayList<Integer> ansList = new ArrayList<>();

//         if (root == null) return ansList;

//         Stack<Node> st = new Stack<>();

//         while (!st.isEmpty() || root != null) {
//             while (root != null) {
//                 st.push(root);
//                 root = root.left;
//             }

//             root = st.pop();
//             ansList.add(root.data);
//             root = root.right;
//         }

//         return ansList;
//     }

//     public static void main(String args[]) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.left.right.left = new Node(6);
//         root.right.left = new Node(7);
//         root.right.right = new Node(8);
//         root.right.right.left = new Node(9);
//         root.right.right.right = new Node(10);

//         System.out.print(inOrder(root));
//     }
// }







//           postOrder (without recursion)


// import java.util.ArrayList;
// import java.util.Stack;

// public class BinaryTreesStriver {

//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.right = null;
//             this.left = null;
//         }
//     }

//     public static ArrayList<Integer> inOrder(Node root) {
//         ArrayList<Integer> ansList = new ArrayList<>();
//         Stack<Node> st1 = new Stack<>();
//         Stack<Node> st2 = new Stack<>();

//         if (root == null) return ansList;

//         st1.push(root);

//         while(!st1.isEmpty()){
//           root=st1.pop();
//           st2.add(root);

//           if(root.left!=null){
//             st1.push(root.left);
//           }
//           if (root.right!=null) {
//             st1.push(root.right);
//           }
//         }

//         while(!st2.isEmpty()){
//           ansList.add(st2.pop().data);
//         }

//         return ansList;



        
//     }

//     public static void main(String args[]) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.left.right.left = new Node(6);
//         root.right.left = new Node(7);
//         root.right.right = new Node(8);
//         root.right.right.left = new Node(9);
//         root.right.right.right = new Node(10);

//         System.out.print(inOrder(root));
//     }
// }




// ***************Height of a treee***************







// import java.util.*;
// public class BinaryTreesStriver{

//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//             this.data=data;
//             this.right=null;
//             this.left=null;
//         }

//     }

//     public static int height(Node root){
        
//         if(root==null)return 0;

//         int rightHeight=height(root.right);
//         int leftHeight=height(root.left);

//         return Math.max(rightHeight,leftHeight)+1;

//     }

// public static void main (String args[]){
      
//     Node root = new Node(1);
//     root.left = new Node(2);
//     root.right = new Node(3);
//     root.left.left = new Node(4);
//     root.left.right = new Node(5);
//     root.left.right.left = new Node(6);
//     root.right.left = new Node(7);
//     root.right.right = new Node(8);
//     root.right.right.left = new Node(9);
//     root.right.right.right = new Node(10);
//     root.right.right.right.left = new Node(11);

//     System.out.print(height(root));

// }
// }






//             Zig Zag treeee





// import java.util.*;

// class node {
//     int data;
//     node left;
//     node right;

//     public node(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// class BinaryTreesStriver{
//     public static List<List<Integer>> zigzagLevelOrder(node root) {

//         // ArrayList to store and return the final answer
//         List<List<Integer>> result = new ArrayList<>();
//         if(root == null){
//             return result;
//         }
         
//         // Queue to add the root
//         Queue<node> q = new LinkedList<>();
//         q.add(root);

//         // turn, to track whether to print from left to right or right to left
//         int turn = 0;

//         while(!q.isEmpty()){
//             int size = q.size();
//             ArrayList<Integer> ls = new ArrayList<>();

//             for(int i = 0; i < size; i++){
//                 // Remove the top element of the queue and store it into x
//                 node x = q.remove();

//                 // Now add that x to list ls
//                 ls.add(x.data);

//                 // If x has a left child, add it to the queue
//                 if(x.left != null){
//                     q.add(x.left);
//                 }

//                 // If x has a right child, add it to the queue
//                 if(x.right != null){
//                     q.add(x.right);
//                 }
//             }

//             // If turn is odd, reverse ls
//             if(turn % 2 != 0){
//                 Collections.reverse(ls);
//             }
//             // Increment turn
//             turn++;
            
//             // Add ls to result
//             result.add(ls);
//         }

//         return result;
//     }

//     public static void main(String args[]) {
//         node root = new node(1);
//         root.left = new node(2);
//         root.right = new node(3);
//         root.left.left = new node(4);
//         root.left.right = new node(5);
//         root.right.right = new node(6);
//         root.left.left.left = new node(7);
//         root.left.right.left = new node(8);
//         root.left.right.right = new node(9);

//         List<List<Integer>> result = zigzagLevelOrder(root);
//         for(List<Integer> level : result) {
//             for(int val : level) {
//                 System.out.print(val + " ");
//             }
//             System.out.println();
//         }
//     }
// }






import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

public class BinaryTreesStriver {
    public static void main(String[] args) {
        // Create a binary tree
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);

        // Print the boundary of the tree
        BinaryTreesStriver obj = new BinaryTreesStriver();
        System.out.println(obj.boundary(root));
    }

    public ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null)
            return ans;

        ans.add(node.data);

        // print left boundary
        printleft(node.left, ans);

        // print leaf
        printleaf(node.left, ans);

        printleaf(node.right, ans);

        // print right boundary
        printright(node.right, ans);

        return ans;
    }

    void printleft(Node node, ArrayList<Integer> ans) {

        if (node == null)
            return;

        if (node.left == null && node.right == null)
            return;

        ans.add(node.data);

        if (node.left != null) {
            printleft(node.left, ans);
        } else {
            printleft(node.right, ans);
        }
    }

    void printleaf(Node node, ArrayList<Integer> ans) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            ans.add(node.data);
        }

        printleaf(node.left, ans);

        printleaf(node.right, ans);
    }

    void printright(Node node, ArrayList<Integer> ans) {

        if (node == null)
            return;

        if (node.left == null && node.right == null)
            return;

        if (node.right != null) {
            printright(node.right, ans);
        } else {
            printright(node.left, ans);
        }
        ans.add(node.data);
    }
}
