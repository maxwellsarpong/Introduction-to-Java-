import java.util.HashSet; // Import the HashSet class


public class HashSetJava {
    public static void main(String[] args){
        /*
        Java HashSet
        A HashSet is a collection of items where every item is unique, 
        and it is found in the java.util package:
        */

        // integer list
        HashSet<Integer> even = new HashSet<Integer>();

        //string list
        HashSet<String> words = new HashSet<String>();



        // adding items to the even list
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        even.add(10);
        System.out.println(even);

        
        if (even.contains(1)){
            System.out.println("found");
        }else{
             System.out.println("not found");
        }

    //adding to the words list
    words.add("food");
    words.add("water");
    words.add("dance");
    words.add("yogurt");

    if (words.contains("milk")){
        System.out.println("milk was found");
    }else{
        System.out.println("milk was not found");
    }


        
    }
}
