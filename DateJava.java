import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateJava {
    
    public static void main(String[] args){
        /*
        Java Dates

        Java does not have a built-in Date class, 
        but we can import the java.time package to work with the date and time API. 
        The package includes many date and time classes. For example:
        */

        // getting the current date.
        LocalDate obj = LocalDate.now();
        System.out.println(obj);


        System.out.println("=========================");
        // getting the current date and time unformatted
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        System.out.println("=========================");
        // getting the current date and time formatted
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-dd-MM hh:mm:ss");
        String ct = fmt.format(dt);
        System.out.println(ct);
    }
}
