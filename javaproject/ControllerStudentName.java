public class ControllerStudentName {




    public static void main(String[] args){

        ServiceStudentName serviceStudentName = new ServiceStudentName();

        StudentName student = serviceStudentName.getInfo();
        System.out.println(student.getAddress().city);
    }
}
