public class EnumJava {
    enum Skills{
        BIG_DATA,
        MACHINE_LEARNING,
        MOBILE_APPS
    }
    

    public static void main(String[] args){
        /*
        Enums
        An enum is a special "class" that represents a group of constants (unchangeable variables,
        like final variables).

        To create an enum, use the enum keyword (instead of class or interface), 
        and separate the constants with a comma. Note that they should be in uppercase letters:
        */

        // accessing a single element of an enum ( class )
        Class obj = Class.EASY;
        System.out.println(obj);


        // accessing a single element of an enum ( skills )
        Skills obj1 = Skills.MACHINE_LEARNING;
        System.out.println(obj1);


        // switch case in enums
        switch(obj){
            case EASY:
                System.out.println("Easy class");
                break;
            case MEDIUM:
                System.out.println("Medium class");
                break;
            case HARD:
                System.out.println("Hard class");

        }

        // looping through an enum ( class )
        for (Class x : Class.values()){
            System.out.println(x);
        }

    }
}


// enum outside a class
enum Class {
    EASY,
    MEDIUM,
    HARD
}
