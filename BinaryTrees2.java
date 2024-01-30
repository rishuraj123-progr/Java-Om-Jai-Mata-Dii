//             print all the nodes of kth level 




// import java.util.*;
// public class BinaryTrees2{

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

//   public static void printNodes(Node root,int level,int key){


//     if (root == null) {
//       return;
//   }


// Recursive Call for the left subtree
//     printNodes(root.left,level+1,key);


// Recursive Call for the right subtree
//     printNodes(root.right,level+1,key);

//     if(key==level){
//       System.out.print(root.data+" ");
//     }



//   }

// public static void main (String args[]){
     
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);   

//         int key=3;

//        printNodes(root,1,key);


// }
// }














//                                lowest common ancestor




// import java.util.*;
// public class BinaryTrees2{

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

//     ArrayList<Node>path1=new ArrayList<>();
//     ArrayList<Node>path2=new ArrayList<>();


//     // root se n and m tak ka  path calculate karke de dega getPath in path1 and     path2 me
//     getPath(root,n,path1);
//     getPath(root,m,path2);


//     // last common ancestor
//     int i=0;
//     for(;i<path1.size() && i<path2.size();i++){
//       if(path1.get(i)!=path2.get(i)){
//         break;
//       }
//     }


       // last equal node
//     Node lca=path1.get(i-1);


//     return lca;

//   }


//   public static boolean getPath (Node root,int n,ArrayList<Node>list){
//     if(root==null) return false;


//     list.add(root);
//     if(root.data == n){
//       return true;
//     }

//     boolean foundleft=getPath(root.left, n, list);
//     boolean foundRight=getPath(root.right,n,list);


//     if(foundRight || foundleft){
//       return true;
//     }
       
       //agar leftsubtree or rightsubtree me nai mila to waha k saare path remove ho // gaye honge isiliye ham current root ko v remove kar denge 
//     list.remove(list.size()-1);

//     return false;


//   }

// public static void main (String args[]){
     
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);   

//         int n1=4,n2=5;


//    System.out.println( lca(root, n1, n2).data);
       


// }
// }








//                  lca (appraoch 2)






// import java.util.*;
// public class BinaryTrees2{

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





//               minimum distance between 2 nodes




// import java.util.*;
// public class BinaryTrees2{

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

  
//   public static Node lca2(Node root,int n,int m){

//     if(root==null || root.data==n || root.data==m){
//       return root;
//     }


//     Node leftLca=lca2(root.left,n,m);
//     Node rightLca=lca2(root.right,n,m);

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

//   public static int lcaDist(Node root,int n){
//     if(root==null)return -1;

//     if(root.data==n)return 0;

//     int leftDist=lcaDist(root.left, n);
//     int rightDist=lcaDist(root.right, n);

//     if(leftDist==-1 && rightDist==-1){// n dono subtree me exist ni karta hai
//       return -1;
//     }
//     else if(leftDist==-1){ // leftDist me n exist ni karta
//       return rightDist+1;
//     }
//     else{ // rightDist me n exist ni karta 
//       return leftDist+1;
//     }
//   }


//   public static int minDist(Node root,int n1,int n2){

//     Node lca=lca2(root,n1,n2);
//     int dist1=lcaDist(lca,n1);
//     int dist2=lcaDist(lca,n2);


//     return dist1+dist2;

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


//    System.out.println( minDist(root, n1, n2));
       


// }
// }






  



////                                                   Kth Ancestor 






// import java.util.*;
// public class BinaryTrees2{

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

  
//   public static int KthAncestor(Node root,int n,int k){
      
//     if(root==null)return -1;

//     if(root.data==n)return 0;


//     int leftDist=KthAncestor(root.left, n, k);
//     int rightDist=KthAncestor(root.right, n, k);

//     if(leftDist==-1 && rightDist==-1){
//       return -1;
//     }

//     int max=Math.max(leftDist,rightDist);
//     if(max+1==k){
//       System.out.println(root.data);
//     }

//     return max+1;
//   }



// public static void main (String args[]){
     
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);   

//         int n=5,k=2;


//    KthAncestor(root,n,k); 
       


// }
// }








//                                               Transform to sum treeee



import java.util.*;
public class BinaryTrees2{

  public static class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
      this.data=data;
      this.left=null;
      this.right=null;

    }
  }

  
  public static int  transform(Node root){

    if(root==null){
      return 0;
    }
       

    int leftChild=transform(root.left);
    int rightChild=transform(root.right);

    int newLeft=root.left==null ? 0:root.left.data;
    int newRight=root.right==null ? 0:root.right.data;
    
    int data=root.data;
    root.data=newLeft+leftChild+newRight+rightChild;

    return data;
    
  }

  public static void preOrder(Node root){
    if(root==null)return ;


    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
  }



public static void main (String args[]){
     
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);   

        int n=5,k=2;


   transform(root);
   preOrder(root); 
       


}
}

