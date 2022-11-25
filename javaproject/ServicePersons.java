import java.util.ArrayList;

public class ServicePersons {



    public Persons getInfo() {

        ArrayList<String> names = new ArrayList<String>();
        names.add("selva");
        names.add("dinesh");
        names.add("yogesh");
        Persons persons = new Persons();
        persons.setNames(names);
        return persons;
    }
}
