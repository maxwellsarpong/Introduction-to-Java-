public class InterfaceJava {
    
    public static void main(String[] args){
        /*
        Interfaces
        Another way to achieve abstraction in Java, is with interfaces.

        An interface is a completely "abstract class" that is used to group 
        related methods with empty bodies:

        To access the interface methods, the interface must be "implemented" 
        (kinda like inherited) by another class with the implements keyword (instead of extends). 
        The body of the interface method is provided by the "implement" class:
        */


        Specialization obj = new Specialization();

        obj.activity();

        obj.category();
    }
}


interface Profession{

    public void category();

    public void activity();

}


class Specialization implements Profession{

    public void category(){
        System.out.println("Big-Data, Mobile App Development and Web Development");
    }

    public void activity(){
        System.out.println("Writes codes in Java, Python, C#, and C++");
    }

}
