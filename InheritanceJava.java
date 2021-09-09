public class InheritanceJava extends Car{
    protected int modelYear = 1994; 

    public String getBrand(){
        return brand;
    }

    public int getModel(){
        return modelYear;
    }
    public static void main(String[] args){
        /*
        Java Inheritance (Subclass and Superclass)
        In Java, it is possible to inherit attributes and methods from one class to another. 
        We group the "inheritance concept" into two categories:

        subclass (child) - the class that inherits from another class
        superclass (parent) - the class being inherited from
        To inherit from a class, use the extends keyword.
        */

        InheritanceJava obj = new InheritanceJava();

        System.out.println(obj.getModel());

        System.out.println(obj.getBrand());
        
        obj.honk();


        System.out.println("==================");


        System.out.println(obj.modelYear);
        System.out.println(obj.brand);


    }
}

class Car {
    protected String brand = "Ford";

    public void honk(){
        System.out.println("tututu tutu");
    }
}
