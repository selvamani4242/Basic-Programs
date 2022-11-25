package streamfunctions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ContollerPersonName {



    public static void main(String[] args){


        ServicePersonNames servicepersonnames = new ServicePersonNames();

        ArrayList<PersonNames> personinfo = servicepersonnames.getInfo();

       ArrayList<PersonNames> Names = (ArrayList) personinfo.stream()
       .filter(p -> p.getAge()>=20)
       .collect(Collectors.toList());
       Names.forEach(x -> System.out.println(x.getName()));



    }
}

