import java.util.ArrayList;    // Import the ArrayList class
import java.util.Collections;  // Import the Collections class

public class ArrayListJava {
    
    public static void main(String[] args){
        /*
        Java ArrayList
        The ArrayList class is a resizable array, which can be found in the java.util package.

        The difference between a built-in array and an ArrayList in Java, 
        is that the size of an array cannot be modified (if you want to add 
        or remove elements to/from an array, you have to create a new one). 
        While elements can be added and removed from an ArrayList whenever you want. 
        The syntax is also slightly different:
        */

        // declaring the arraylist with name cars
        ArrayList<String> cars = new ArrayList<String>();
        
        //adding to the array
        cars.add("lamborghini");
        cars.add("rolls royce");
        cars.add("bentley");
        cars.add("jaguar");
        System.out.println(cars);


        System.out.println("====================");

        //looping through the array
        for (String x:cars){
            System.out.println(x);
        }

        
        System.out.println("====================");

        //accessing an item
        System.out.println(cars.get(0));

        System.out.println("====================");


        //setting the item
        cars.set(0,"opel");
        System.out.println(cars);

        //getting the arraylist size
        System.out.println(cars.size());

        System.out.println("====================");

        //remove an item from the arraylist
        cars.remove(1);
        System.out.println(cars);

        //clearing the content of the arraylist
        cars.clear();
        System.out.println(cars.size());

        //arraylist reinitialised with items
        cars.add("lamborghini");
        cars.add("rolls royce");
        cars.add("bentley");
        cars.add("jaguar");

        System.out.println("====================");
        System.out.println("for loop");
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        System.out.println("====================");
        System.out.println("do loop");
        int x = 0;
        int a = cars.size();
        do{
            System.out.println(cars.get(x));
            x++;
        }while(x < a);

        /*
        Sort an ArrayList
        Another useful class in the java.util package is the Collections class,
         which include the sort() method for sorting lists alphabetically or numerically:
        */

        System.out.println("====================");


        // sorted arraylist
        Collections.sort(cars);
        System.out.println(cars);
        

        System.out.println("====================");


        Collections.reverse(cars);
        System.out.println(cars);


    }
}
