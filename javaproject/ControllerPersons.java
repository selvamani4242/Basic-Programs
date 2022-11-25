import java.util.ArrayList;
import java.util.List;

public class ControllerPersons {





    public static void main(String[] args){

        ServicePersons servicepersons = new ServicePersons();


        Persons persons = servicepersons.getInfo();

        System.out.println(persons.getNames());



    }
}
