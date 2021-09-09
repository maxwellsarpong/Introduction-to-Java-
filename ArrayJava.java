public class ArrayJava {
    public static void main(String[] args){

        /*
        Java Arrays
        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

        To declare an array, define the variable type with square brackets:
        */

        String[] cars = {"volvo", "honda", "camry"};
        System.out.println("==============================");
        // looping through the array to 
        // to print out the content
        // for each loop
        for(String i : cars){
            System.out.println(i);
        }

        // looping through the array 
        // for loop
        System.out.println("==============================");


        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        System.out.println("==============================");
        // reinitialising the array index with a different value
        cars[0] = "bugatti";

        // accessing the array by index
        System.out.println(cars[0]);


        /*
        Array Length
        To find out how many elements an array has, use the length property:
        */
        System.out.println("==============================");
        System.out.println("the size of array: " + " " + cars.length);

        System.out.println("==============================");

        // multidimensional array
        int[][] num = {{1,2,3,4,5,6},{2,4,6,8,10}};

        int x = num[1][2];
        int y = num[0][2];
        System.out.println(num[0]);
        System.out.println(x);
        System.out.println(y);

        System.out.println("==============================");

        for (int z = 0; z < num.length; ++z){
            for(int w = 0; w < num[z].length; ++w)
            System.out.println(num[z][w]);
        }


        
    }
    
}
