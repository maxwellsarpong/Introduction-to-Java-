public class EncapsulationJava {

    private String name;
    private String profession;

    //getting the name
    public String getName(){
        return name;
    }

    //getting the profession
    public String getProfession(){
        return profession;
    }

    //setting the name
    public void setName(String name){
        this.name = name;
    }

    // setting the profession
    public void setProfession(String prof){
        this.profession = prof;
    }


    public static void main(String[] args){
        /*
        The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
        To achieve this, you must:

        declare class variables/attributes as private
        provide public get and set methods to access and update the value of a private variable
        */

        EncapsulationJava myObj = new EncapsulationJava();

        myObj.setName("MAXWELL");
        myObj.setProfession("Software Engineer");

        System.out.println(myObj.getName());
        System.out.println(myObj.getProfession());


    }
}
