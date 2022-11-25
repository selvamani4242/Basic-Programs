package streamfunctions;

import java.util.ArrayList;

public class ServicePersonNames {


    public ArrayList<PersonNames> getInfo(){

        PersonNames p1 = new PersonNames();
        p1.setName("selva");
        p1.setAge(20);

        PersonNames p2 = new PersonNames();
        p2.setName("dinesh");
        p2.setAge(20);

        PersonNames p3 = new PersonNames();
        p3.setName("yogesh");
        p3.setAge(30);

        PersonNames p4 = new PersonNames();
        p4.setName("rajesh");
        p4.setAge(30);

        ArrayList<PersonNames> persondetails = new ArrayList<>();
        persondetails.add(p1);
        persondetails.add(p2);
        persondetails.add(p3);
        persondetails.add(p4);
        return persondetails;


    }
}
