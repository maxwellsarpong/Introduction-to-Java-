import java.lang.String;

public class Variable {

    public void main(String[] args){
        /*
        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false
        */

        String name;
        name = "maxwell";
        int price = 23;
        float volume = 0.08f;
        char choice = 'Y';
        boolean state = false;
        double quantity = 4.67;

        System.out.println(name);
        System.out.println(price);
        System.out.println(volume);
        System.out.println(choice);
        System.out.println(state);
        System.out.println(quantity);
        
    }
}
