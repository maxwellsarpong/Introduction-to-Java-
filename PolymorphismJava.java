public class PolymorphismJava {
    public static void main(String[] args){
        /*
        Java Polymorphism
        Polymorphism means "many forms", and it occurs when we have many
        classes that are related to each other by inheritance.

        Like we specified in the previous chapter; 
        Inheritance lets us inherit attributes and methods from another class.
        Polymorphism uses those methods to perform different tasks. 
        This allows us to perform a single action in different ways.
        */

        Animal obj = new Animal();

        Animal pig = new Pig();

        Animal cow = new Cow();

        obj.animalSound();

        pig.animalSound();

        cow.animalSound();
    }
}


class Animal{

    public void animalSound(){
        System.out.println("this is an animal sound");
    }
}


class Pig extends Animal{

    public void animalSound(){

        System.out.println("pig says wee wee");
    }
}


class Cow extends Animal{

    public void animalSound(){

        System.out.println("Cow says moo mooo");
    }
}
