public class InnerClassJava {
    
    public static void main(String[] args ){
        /*

            Java Inner Classes
            In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

            To access the inner class, create an object of the outer class, and then create an object of the inner class:
        */

        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass();

        System.out.println(out.x + in.y);


    }
}

class OuterClass{

    int x = 10;

    class InnerClass{

        int y = 10;
    }
}