

// import java.util.*;

// public class Hashing1 {
//   public static void main(String[] args) {
//     //create
    // HashMap<String,Integer>hm=new HashMap<>();

    // //insert - O(1)
    // hm.put("india",100);
    // hm.put("china",80);
    // hm.put("russia",90);

//     // get - O(1)
//     int population=hm.get("india");

//     System.out.println(population);

//     System.out.println(hm.get("indonesia "));

//     // contains key -O(1)

//     System.out.println(hm.containsKey("india"));
//     System.out.println(hm.containsKey("Indiana"));

//     //REMOVE- O(1)

//     // System.out.println(hm.remove("china"));
//     // System.out.println(hm);

//     // size()
//     System.out.println(hm.size());

//     // to clear the map 
//     hm.clear();
//     System.out.println(hm.isEmpty()); 
     
//   }
    
// }



//                     iteration on hashmap



// import java.util.*;
// public class Hashing1 {
//   public static void main(String[] args) {

//     HashMap<String,Integer>hm=new HashMap<>();

//     //insert - O(1)
//     hm.put("india",100);
//     hm.put("china",80);
//     hm.put("russia",90);
//     hm.put("Indonesia",40);
//     hm.put("Nepal",55);


//     //iterate -- keySet(to give all the keys ) , 
//     // Set<String>keys=hm.keySet();
//     System.out.println(hm.keySet());


//     // hm.entrySet()-- gives the keys with its values too
//     System.out.println(hm.entrySet());


//     // for (String k : keys) {
//     //   System.out.println("keys"+' '+ k +' ' +"values"+' '+ hm.get(k));
//     // }
    
//   }
// }




//                implementation HashMap

// import java.util.*;

// public class Hashing1 {
 
//   public static void main(String[] args) {

//     HashMap<String,Integer>map1=new HashMap<>();

//     map1.put("rishu",101);
//     map1.put("raghav",102);
//     map1.put("roman",103);
//     map1.put("rehan",104);
    

//     // for each loop
//     int arr[]={2,3,4,5,6,7,8};
//     for(int i:arr){
//       System.out.println(i);
//     }

//     // for iteration on map
//     for(Map.Entry<String,Integer>e:map1.entrySet()){
//       System.out.println(e.getKey());
//       System.out.println(e.getValue());
//     }

//     System.out.println(map1.keySet());

//   }
  
// }



///    ***********************majority element*********** 


// import java.util.*;

// public class Hashing1 {

//   public static void majorityElement(int nums[]){

//     HashMap<Integer,Integer>map1=new HashMap<>();
//     int n=nums.length;

//     for(int i=0;i<n;i++){ // true
//       if(map1.containsKey(nums[i])){
//         map1.put(nums[i],map1.get(nums[i])+1);
//       }
//       else{ // false
//         map1.put(nums[i],1);
//       }
//     }


//     for(int key:map1.keySet()){
//       if(map1.get(key)>n/3){
//         System.out.println(key);
//       }
//     }
 
//   }
 
//   public static void main(String[] args) {

//     int nums[]={1,3,3,3,1,5,1,3,1,5,1};

//      majorityElement(nums);
    
//   }
// }



//     ************************ union of array(using hashmap) ***********

// import java.util.HashMap;

// /**
//  * Hashing1
//  */
// public class Hashing1 {

//   public static void majorityElement(int arr1[],int arr2[]){

//     HashMap<Integer,Integer>map=new HashMap<>();

//     for(int value:arr1){
//       map.put(value,1);
//     }


//     for(int value:arr2){
//       map.put(value,1);
//     }


//     for(int key:map.keySet()){
//       System.out.println(key);
//     }

//     System.out.println(map.size());

    
//   }

  

//   public static void main(String[] args) {
    
//     int arr1[]={1,2,3,4,5};
//     int arr2[]={1,2,3};
    
//     majorityElement(arr1,arr2);

//   }
// }





//              union of two arrays (using hashset)


// import java.util.*;

// public class Hashing1 {

//   public static void union(int arr1[],int arr2[]){

//     HashSet<Integer>set=new HashSet<>();

//     for(int value:arr1){
//       set.add(value);
//     }

//     for(int value:arr2){
//       set.add(value);
//     }

//     for(int len:set){
//        System.out.println(len);
//     }

//     System.out.println("size"+" "+set.size());

//   }

  
//   public static void main(String[] args) {
    
//     int arr1[]={1,2,3,4,5};
//     int arr2[]={1,2,3};
    
//     union(arr1,arr2);

//   }
// }


import java.util.*;
public class Hashing1{

  public static int intersection (int arr1[],int arr2[]){

    HashSet<Integer>set=new HashSet<>();

    int count=0;

    for(int i=0;i<arr1.length;i++){
      set.add(arr1[i]);
    }

    for(int j=0;j<arr2.length;j++){
      if(set.contains(arr2[j])){
        set.remove(arr2[j]);
        count++;
      }
    }

     return count;
     
  } 
  public static void main(String args[]){
      
    int arr1[]={4,9,5};
    int arr2[]={9,4,9,8,4};

    System.out.println(intersection(arr1,arr2));
  }
}