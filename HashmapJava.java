import java.util.HashMap;
public class HashmapJava {
    
    public static void main(String[] args){
        /*
        Java HashMap
        In the ArrayList chapter, you learned that Arrays store items as an ordered collection,
        and you have to access them with an index number (int type). 
        A HashMap however, store items in "key/value" pairs, and you can access
        them by an index of another type (e.g. a String).

        One object is used as a key (index) to another object (value). 
        It can store different types: String keys and Integer values, or the same type, 
        like: String keys and String values:
        */

        HashMap<String, String> country = new HashMap<String, String>();

        // adding to the Hashmap (key, value) eg:( country, capitals)
        country.put("England", "London");
        country.put("Ghana", "Accra");
        country.put("USA", "Washington");
        country.put("Germany", "Berlin");
        System.out.println(country);

        System.out.println("==============");

        // accessing an item. use get() function. gets England from the list
        String k = country.get("England");
        System.out.println(k);


        System.out.println("==============");

        //remove an item. use remove() function. removes Ghana from the list
        country.remove("Ghana");
        System.out.println(country);

        System.out.println("==============");

        //get the size of the list
        int s = country.size();
        System.out.println(s);

        System.out.println("==============");
        //loop through to get all the keys of the list
        for (String c : country.keySet()){
            System.out.println(c);
        }


        System.out.println("==============");
        //loop through to get all the keys and values pair of the list
        for (String k_v : country.keySet()){
            System.out.println("the countries are " + k_v + ":" + country.get(k_v));
        }
    }
}
