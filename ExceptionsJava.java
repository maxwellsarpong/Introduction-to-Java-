public class ExceptionsJava {

    public static void checkNum(int num){
        if (num >= 18){
            System.out.println("number approved");
        }else{
            throw new ArithmeticException("Inappropriate number");
        }
    } 
    
    public static void main(String[] args) {
    
        /*
        Java Exceptions
        When executing Java code, different errors can occur: 
        coding errors made by the programmer, errors due to wrong input,
        or other unforeseeable things.

        When an error occurs, Java will normally stop and generate an error message. 
        The technical term for this is: Java will throw an exception (throw an error).
        */

        int[] arr = {1,2,3,4,5};

        
        try{
            System.out.println(arr[10]);
        }catch(Exception e){    
            System.out.println("something went wrong: " + e);
        }finally{
            System.out.println("try catch finished");
        }


        // using the throw new keyword 

        System.out.println("");

        System.out.println("========================");
        checkNum(19);
        System.out.println("========================");
        
    }
}
