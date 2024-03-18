import java.util.*;
public class hashset1{
    public static void main(String[] args) {
        

        // creating hashset
        HashSet<Integer>set=new HashSet<>();
        

        // inserting 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); 

        // search 
        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        System.out.println(set);


        // remove
        // System.out.println(set.remove(1));


        // print all elements 
        System.out.println(set);

        //iterator 
        Iterator it=set.iterator();
        // hasNext ,  it.next

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}