import java.util.*;
/**
 * Write a description of class listimp2 here.
 *
 * @author (Sahil chhikara)
 * @version (a version number or a date)
 */
public class listimp2
{
    public static void main(String args[]){
        // Using LINKED LIST IS FASTER THAN ARRAYLIST
        // ArrayList is better for storing and accessing data.	
        //LinkedList is better for manipulating data.
        System.out.print('\u000C'); // to clear screen in BlueJ
        // Removing specfic number of element
        List<Integer> l1= new ArrayList<Integer>();
        l1.add(110);
        l1.add(98);
        l1.add(30);
        l1.add(19);
        l1.add(14);
        l1.add(60);
        System.out.println(l1);
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(35); // if no. not present then nothing happen
        arr.add(19);
        l1.removeAll(arr);
        System.out.println(l1);
        
        // Compare 2 list
        ArrayList<Integer> l11= new ArrayList<Integer>();
        l11.add(110);
        l11.add(98);
        l11.add(30);
        l11.add(19);
        l11.add(14);
        l11.add(60);
        System.out.println(l11);
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr.add(110); 
        arr.add(19);
        if(l11.equals(arr1)){
        System.out.println("Equals");}
        else {
            System.out.println("Not");
        }
        // size of list
        System.out.println(l1.size());
        // sorting list
        Collections.sort(l11);
        System.out.println(l11);
        //iterator
        Iterator<Integer> iterator = l11.iterator();
        while(iterator.hasNext()){
            int i = (int) iterator.next();
            System.out.println(i+ ", ");
        }
    }
}
