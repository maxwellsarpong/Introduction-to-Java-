public class MethodJava {
    public static void main(String[] args){

        /*

        A method is a block of code which only runs when it is called.

        You can pass data, known as parameters, into a method.

        Methods are used to perform certain actions, and they are also known as functions.

        Why use methods? To reuse code: define the code once, and use it many times.
        */

        int x = 8;
        int y = 9;

        System.out.println("result:" + add(x,y));
    }

     static int add(int a, int b){
        return a + b;
    }
}
