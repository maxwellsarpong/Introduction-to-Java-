import java.lang.String;
public class JavaString {
    public static void main(String[] args){
        
        // length() function to count the text
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());

        // toLowerCase() to convert all text to lower case
        System.out.println(txt.toLowerCase());

        // indexOf() returns the position of a specified text
        String sent = "The boy is going to 'school' "; // find position of school
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(sent.indexOf("School"));
        System.out.println(txt2.indexOf("locate"));
    }
}
