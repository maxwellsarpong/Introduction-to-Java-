import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaJava {
    public static void main(String[] args){
        /*

        Java Lambda Expressions
        Lambda Expressions were added in Java 8.

        A lambda expression is a short block of code which takes in parameters and returns a value.
        Lambda expressions are similar to methods, but they do not need a name and they can
        be implemented right in the body of a method.

        The simplest lambda expression contains a single parameter and an expression:

        parameter -> expression 


        To use more than one parameter, wrap them in parentheses:

        (parameter1, parameter2) -> expression
        */

        ArrayList<String> alpha = new ArrayList<String>();


        ArrayList<Integer> al = new ArrayList<Integer>();

        // adding to alpha
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        alpha.add("d");


        // lambda function to output the list in alpha
       alpha.forEach( (n) -> System.out.println(n));


       // using the Consumer interface to assign variable to lambda function
       al.add(1);
       al.add(2);
       al.add(3);
       al.add(4);
       

       //initialising the consumer interface
       Consumer<Integer> result = (n) -> System.out.println(n + 2);
       al.forEach(result);




    }
}
