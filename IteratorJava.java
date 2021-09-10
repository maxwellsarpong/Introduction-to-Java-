// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorJava {
    public static void main(String[] args ){
        /*
        Java Iterator
        An Iterator is an object that can be used to loop through collections, l
        ike ArrayList and HashSet. It is called an "iterator" 
        because "iterating" is the technical term for looping.

        To use an Iterator, you must import it from the java.util package.
        */

        ArrayList<Integer> val = new ArrayList<Integer>();

        //adding items to the list
        val.add(2);
        val.add(3);
        val.add(5);
        val.add(7);
        val.add(9);
        val.add(28);
        val.add(19);

        // initializing the iterator
        Iterator<Integer> it = val.iterator();

        //output the first value in the list
        //System.out.println(it.next());

        // outputs all the items in the list 
        while(it.hasNext()){
        Integer i = it.next();
        if (i < 10){
            it.remove();
        }
        }
        System.out.println(val);

    }
}
