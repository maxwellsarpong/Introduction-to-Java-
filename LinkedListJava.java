import java.util.LinkedList;

public class LinkedListJava {
    public static void main(String[] args){
        /*
        Java LinkedList
        In the previous chapter, you learned about the ArrayList class. 
        The LinkedList class is almost identical to the ArrayList:

        ArrayList vs. LinkedList
        The LinkedList class is a collection which can contain many objects of the same type, 
        just like the ArrayList.

        The LinkedList class has all of the same methods as the ArrayList class because 
        they both implement the List interface. This means that you can add items, change items, 
        remove items and clear the list in the same way.

        However, while the ArrayList class and the LinkedList class can be used in the same way, 
        they are built very differently.

        How the ArrayList works
        The ArrayList class has a regular array inside it. When an element is added, 
        it is placed into the array. If the array is not big enough, a new, 
        larger array is created to replace the old one and the old one is removed.

        How the LinkedList works
        The LinkedList stores its items in "containers." 
        The list has a link to the first container and each container has a link to the next container 
        in the list. To add an element to the list, the element is placed into a
         new container and that container is linked to one of the other containers in the list.
        */

        LinkedList<Integer> num = new LinkedList<Integer>();

        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        num.add(10);
        num.add(12);

        // printing out the content of the linkedlist
        System.out.println(num);

        // addfirst() function to the linkedlist
        num.addFirst(1);
        System.out.println(num);

         // addlast() function to the linkedlist
         num.addLast(13);
         System.out.println(num);
    }
}
