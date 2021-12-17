class WrapperClassJava {
    
    public static void main(String[] args){

        /*
            Java Wrapper Classes
            Wrapper classes provide a way to use primitive data types 
            (int, boolean, etc..) as objects.

            The table below shows the primitive type and the equivalent wrapper class:

            Primitive Data Type	        Wrapper Class
                byte	=>              Byte
                short	=>              Short
                int	    =>              Integer
                long	=>              Long
                float	=>              Float
                double	=>              Double
                boolean	=>              Boolean
                char	=>              Character
        */

        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());
        

    }
}