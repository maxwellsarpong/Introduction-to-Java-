import java.io.*;

public class FileJava {

    public static void main(String[] args) throws IOException{

        FileWriter f = new FileWriter("/Users/user/Desktop/try.txt");
        

            f.write("Hello file written to a file");
            f.close();
       
    
    }
    
}
