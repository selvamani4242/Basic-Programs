import java.util.ArrayList;
public class StudentService {


        public ArrayList<StudentNames> getInfo() {

            StudentNames s1 = new StudentNames();
            s1.setName("dines");
            s1.setGender("m");
            s1.setAge(12);

            StudentNames s2 = new StudentNames();
            s2.setName("selva");
            s2.setGender("M");
            s2.setAge(14);

            StudentNames s3 = new StudentNames();
            s3.setName("yogesh");
            s3.setGender("m");
            s3.setAge(17);

            StudentNames s4 = new StudentNames();
            s4.setName("rajesh");
            s4.setGender("M");
            s4.setAge(21);

            StudentNames s5 = new StudentNames();
            s5.setName("harish");
            s5.setGender("m");
            s5.setAge(22);

            StudentNames s6 = new StudentNames();
            s6.setName("moni");
            s6.setGender("F");
            s6.setAge(32);

            StudentNames s7 = new StudentNames();
            s7.setName("manu");
            s7.setGender("f");
            s7.setAge(14);

            StudentNames s8 = new StudentNames();
            s8.setName("kani");
            s8.setGender("F");
            s8.setAge(16);

            StudentNames s9 = new StudentNames();
            s9.setName("preethi");
            s9.setGender("f");
            s9.setAge(25);

            StudentNames s10 = new StudentNames();
            s10.setName("jeni");
            s10.setGender("F");
            s10.setAge(31);

            ArrayList <StudentNames> studentdetails = new ArrayList<StudentNames>();
            studentdetails.add(s1);
            studentdetails.add(s2);
            studentdetails.add(s3);
            studentdetails.add(s4);
            studentdetails.add(s5);
            studentdetails.add(s6);
            studentdetails.add(s7);
            studentdetails.add(s8);
            studentdetails.add(s9);
            studentdetails.add(s10);

            return studentdetails;
        }
        }