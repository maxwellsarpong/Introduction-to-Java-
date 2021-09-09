import java.util.*;

public class PackagesJava {
    public static void main(String[] args){
        /*
        Java Packages & API
        A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

        Built-in Packages (packages from the Java API)
        User-defined Packages (create your own packages)
        */

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your username");
        String name = obj.nextLine();

        System.out.println("welcome" + " " + name);


    }
}
