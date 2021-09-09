public class ConstructorsJava {

    int modelYear;
    String modelName;

    public ConstructorsJava(int year, String name){
        modelName = name;
        modelYear = year;
    }


    public static void main(String[] args){

        ConstructorsJava myObj = new ConstructorsJava(1666, "buggati");

        System.out.println(myObj.modelName + " "+ "was developed in"+ " " + myObj.modelYear);
    }
}
