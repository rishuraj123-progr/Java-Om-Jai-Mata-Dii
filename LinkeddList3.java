import java.util.LinkedList;
import java.util.Scanner;

public class LinkeddList3{
    public static void main (String args[]){
        
        Scanner sc=new Scanner(System.in);
        //create 
        LinkedList <Integer>list = new LinkedList<>();

        // add
        list.addLast(sc.nextInt());
        list.addLast(sc.nextInt());
        list.addFirst(sc.nextInt());
        //0-->1-->2
        System.out.println(list);

        //remove
        list.removeLast();
        list.removeFirst();
        System.out.println(list);


    }
}
