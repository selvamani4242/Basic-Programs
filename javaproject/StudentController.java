import java.util.ArrayList;
import java.util.stream.Collectors;

public class StudentController {



    public static void main(String[] args){


        StudentService studentService  = new StudentService();
        ArrayList<StudentNames> studentinfo = studentService.getInfo();
        // System.out.println(studentinfo.get(7).getName());
        ArrayList studentNames = (ArrayList)studentinfo.stream().filter((it) ->
                { return it.getAge() > 18;}).collect(Collectors.toList());
    System.out.println(studentNames);
       // studentinfo.stream().filter((p) ->{ return p.getGender().equals("m");})
         //       .forEach(System.out::println);
    }
}
