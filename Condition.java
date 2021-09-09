public class Condition {
    public static void main(String[] args){
        /*
        Use 'if' to specify a block of code to be executed, if a specified condition is true
        Use 'else' to specify a block of code to be executed, if the same condition is false
        Use 'else if' to specify a new condition to test, if the first condition is false
        Use 'switch' to specify many alternative blocks of code to be executed

        ternary operator:
        variable = (condition) ? expressionTrue :  expressionFalse;
        */

        int val1 = 10;
        int val2 = 20;

        // itenary 1
        int max = val1 >= val2 ? val1 : val2;
        System.out.println(max);

        // itenary 2
        String result = (val2 > val1) ? "True" : "False";
        System.out.println(result);

        int even = 22;
        int odd = 21;

        //itenary 3
        String state1 = (even % 2 == 0) ? "True" : "False";
        System.out.println(state1);
        
        //itenary 4
        String state2 = (odd % 2 == 0) ? "True" : "False";
        System.out.println(state2);
    }
    
}
