
import java.util.ArrayList;


public class Employee {

    public Employee() {
    }

    public static void main(String[] args)  {

        Edetails emp = new Edetails();
        Employeeinfo empinfo = emp.getInfo();

        System.out.println(empinfo.getName()+empinfo.getAge());

    }
}