import java.util.*;
public class listimp{
    public static void main(String [] args){
        System.out.print('\u000C'); // to clear screen in BlueJ
    // Creating first list
    List<Integer> l1 = new ArrayList<Integer>();
    l1.add(0,1);
    l1.add(1,2);
    System.out.println(l1);
    
    // Creating another list
    List<Integer> l2 = new ArrayList<Integer>();
    l2.add(1);
    l2.add(2);
    l2.add(2,3);
    l2.add(2);
    l2.add(35);
    l2.add(64);
    l2.add(78);
    System.out.println(l2);
    // Add both list
    l1.addAll(2,l2);
    System.out.println(l1);
    
    //Remove element
    l1.remove(3);
    System.out.println(l1);
    // Print specfic element
    System.out.println(l1.get(1));
    // Replace specfic element
    l1.set(2,36);
    System.out.println(l1);
    // finding index of element (When present)
    System.out.println("Index of element is " + l1.indexOf(36));
    // finding index of element (When not present) if -1 then not present
    System.out.println("Index of element is " + l1.indexOf(37));
    // Sublist from main list
    List<Integer> sub = new ArrayList<Integer>();
    sub = l1.subList(2,5);
    System.out.println(sub);
    // Removing sub list
    l1.subList(2,5).clear();
    System.out.println(l1);

    }
}