// import java.util.*;

// public class BinaryTrees{

//   public static class Node{
//     int data;
//     Node left;
//     Node right;

//     Node(int data){
//       this.data=data;
//       this.left=null; // shuru me left child null
//       this.right=null; // shuru me right child null
//     }
//   }



//                                         // making the treeeee from the given array



  //  static class BinaryTree{
  //   static int index=-1;
  //   public static Node buildTree(int node[]){
  //     index++;
  //     if(node[index]==-1){
  //       return null;
  //     }

  //      Node newNode=new Node(node[index]);
  //      newNode.left=buildTree(node);
  //      newNode.right=buildTree(node);


  //      return newNode;
      
  //   }
  // }


//                         // /   /                    preorderrrrrrr



//   public static void preOrder(Node root){
//       if(root==null){
//         return;
//       }
//       System.out.print(root.data+" ");
//       preOrder(root.left);
//       preOrder(root.right);
//     }



//                                                 //  inorder



//     public static void inOrder(Node root){
//       if(root==null){
//         return;
//       }

//       inOrder(root.left);
//       System.out.print(root.data+" ");
//       inOrder(root.right);
//     }


//                                                 // postOrder



//     public static void postOrder(Node root){
//       if(root==null){
//         return;
//       }

//       postOrder(root.left);
//       postOrder(root.right);
//       System.out.print(root.data);
//     }


//                                                       // levelOrder


//     public static void levelOrder(Node root){
//       Queue<Node>q=new LinkedList<>();
//       q.add(root);
//       q.add(null);

//       while(!q.isEmpty()){
//         if(root==null){
//           return;
//         }

//         Node currNode=q.remove();

//         // agar currNode==null fir ham next line pe chale jaayenge 
//         if(currNode==null){ 
//           System.out.println();

//           // lekin if q is empty fir ham break kar lenge
//           if(q.isEmpty()){ 
//             break;
//           }else{
//             q.add(null);
//                   }
//         }

//         else{
//           System.out.print(currNode.data+" ");
//           if(currNode.left!=null){
//             q.add(currNode.left);
//           }

//           if(currNode.right!=null){
//             q.add(currNode.right);
//           }
//         }
//       }
//     }



//                                     //  count number of nodes



//     public static int countOfNode(Node root){

//       if(root==null){
//         return 0; 
//       }


//       int leftNodes=countOfNode(root.left);
//       int rightNodes=countOfNode(root.right);

//       return leftNodes+rightNodes+1;
//     }

//     public static int sumOfNodes(Node root){
//       if(root == null) {
//          return 0;
//       }

//       int leftSum=sumOfNodes(root.left);
//       int rightSum=sumOfNodes(root.right);

//       return leftSum+rightSum+root.data;
//     }



//                                                 // height of nodes


//     public static int heightOfRoot(Node root){

//       if(root==null){
//         return 0;
//       }
       
      
//       int leftHeight=heightOfRoot(root.left);
//       int rightHeight=heightOfRoot(root.right);

//       int myHeight=Math.max(leftHeight, rightHeight)+1;

//       return myHeight;

//     }




//                                               //  diameter of treee (Method 1)


//     public static int diameter(Node root){

//       if(root==null){
//         return 0;
//       }
      
      
      
//       int diameter1=diameter(root.left);
//       int diameter2=diameter(root.right);
//       int diameter3=heightOfRoot(root.left)+heightOfRoot(root.right)+1;

//       int finalDiameter=Math.max(diameter1 , Math.max(diameter2, diameter3));


//       return finalDiameter;
    
//     }

// public static void main (String args[]){

//   int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//   BinaryTree tree=new BinaryTree();
//   Node root=tree.buildTree(nodes);
//   // preOrder(root);
//   // inOrder(root);
  
//   // postOrder(root);
//   // levelOrder(root);
//   // System.out.println(root.data);

//   System.out.println(countOfNode(root));

//     // System.out.println(sumOfNodes(root));


//       // System.out.println(heightOfRoot(root));

//             // System.out.println(diameter(root));

// }
// }





//                      diameter of nodes   (approach 2)





// import java.util.*;

// public class BinaryTrees {
//     public static class Node {
//         int val;
//         Node left;
//         Node right;

//         public Node(int val) {
//             this.val = val;
//             this.left = null;
//             this.right = null;
//         }
//     }

//      public static class Info {
//         int diam;
//         int ht;

//         public Info(int diam, int ht) {
//             this.diam = diam;
//             this.ht = ht;
//         }
//     }

//     public static Info diameter(Node root) {
//         if (root == null) {
//             return new Info(0, 0);
//         }


//         // found the left diameter
//         Info leftInfo = diameter(root.left);

//         // found the right diameter
//         Info rightInfo = diameter(root.right);

//         // now adding both left and right side of tree +1 for root node 
//         int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
//         int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

//         return new Info(diam, ht);
//     }

//     public static void main(String args[]) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.right.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

//         Info result = diameter(root);
//         System.out.println("Diameter: " + result.diam);
//         System.out.println("Height: " + result.ht);

//       }
// }








//                       subtree of another tree code



// import java.util.*;
// public class BinaryTrees{

//   public static class Node{
//     int data;
//     Node left;
//     Node right;


//     public  Node(int data){
//       this.data=data;
//       this.left=null;
//       this.right=null;
//     }
//    }

//    public static boolean isIdentical(Node node , Node subRoot){
//         if(node==null && subRoot==null){
//             return true;
//         }
//         else if(node==null || subRoot==null || node.data!=subRoot.data){
//             return false; 
//         }

//         if(!isIdentical(node.left, subRoot.left)){
//           return false;
//         }

//         if(!isIdentical(node.right, subRoot.right)){
//           return false;
//         }

//         return true;
//    }
//     public static boolean isSubtree(Node root,Node subRoot){
      
//       // this function finds ki subtree main tree me kaha lie kar rahi hai

//       if(root==null){
//         return false;
//       }

//       // agar root aur subRoot ka data same hai to fir isIdentical ko call karenge nahi to else pe niche jaayenge

//       if(root.data==subRoot.data){
//         if(isIdentical(root,subRoot)){
//           return true;
//         }

//       }

//       // else pe 


//       // checks if subRoot exists as a subtree in the left subtree of the current root
//       boolean leftAns=isSubtree(root.left, subRoot);

//       // checks if subRoot exists as a subtree in the right subtree of the current root
//       boolean rightAns=isSubtree(root.right, subRoot);


//       // agar leftAns ya rightAns true return kare to hame v true return karna hai iska matlab ki subtree ya to right me ya fir left me hai
//       return leftAns || rightAns ;
//     }
  
// public static void main (String args[]){
      
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);



//         Node subRoot=new Node(2);
//         subRoot.left=new Node(4);
//         subRoot.right=new Node(5);

//         System.out.println(isSubtree(root, subRoot));
  
// }
// }






//                               top view of a treeee


import java.util.*;
public class BinaryTrees{

  static class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
      this.data=data;
      left=null;
      right=null;
    }
  }
   
  // in info we passes two values because we need to store two values but in Node class we did only one because we need only one out there

  static class Info{
    Node node;
    int hd;

    public Info(Node node,int hd){
      this.node=node;
      this. hd=hd;
    }
  }


  public static void topView(Node root){

    //level order
    Queue<Info>q=new LinkedList<>();
    HashMap<Integer,Node>map=new HashMap<>();


    int min=0,max=0;
    
    // initially q me add kiya root and default --> 0 , this is the syntax for adding values of objects in queue
    q.add(new Info(root,0));
    q.add(null);

    while(!q.isEmpty()){
      Info curr=q.remove();

      if(curr==null){
        if(q.isEmpty()){
          break;
        }
        else{
          q.add(null);
        }
      }


      else{

        if(!map.containsKey(curr.hd)){ //first time my hd is occuring
        map.put(curr.hd,curr.node);
      }


      if(curr.node.right!=null){
        q.add(new Info(curr.node.right,curr.hd+1));
        max=Math.max(max,curr.hd+1);
      }
      

      if(curr.node.left!=null){
        q.add(new Info(curr.node.left,curr.hd-1));
        min=Math.min(min,curr.hd-1);
      }

      
    }

      }

      
    
    for(int i=min;i<=max;i++){
      System.out.println(map.get(i).data+" ");
    }
    System.out.println();

  }



public static void main (String args[]){
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);   


        topView(root);



}
}