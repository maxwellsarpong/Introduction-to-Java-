public class RecursionJava {
    public static void main(String[] args){
        /*

        Java Recursion
        Recursion is the technique of making a function call itself. 
        This technique provides a way to break complicated problems down 
        into simple problems which are easier to solve.

        Recursion may be a bit difficult to understand. 
        The best way to figure out how it works is to experiment with it.
        */

        int val = recursion(10);

        int test = add(5, 10);

        System.out.println(val);

        System.out.println("===========================");
        System.out.println(test);
        System.out.println("===========================");
        System.out.println(count(6));
    }

    static int recursion(int x){
        if( x < 1 ){
            return 1;
        }
        else {
            return x + recursion(x-1);
        }
    }


    public static int add(int start, int end){
        if( start < end){
            return end + add(start, end - 1);
        }
        else{
            return end;
        }
    }


    public static int count(int x){
        if (x < 1){
            return 1;
        }
        else{
            return count(x-1);
        }
    } 
}
