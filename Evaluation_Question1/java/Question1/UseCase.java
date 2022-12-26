package Question1;

import Question1.Dao.StudentDao;
import Question1.Dao.StudentImpl;

public class UseCase {
    public static void main(String[] args) {
        StudentDao TY=new StudentImpl();
        Student t=new Student();
        t.setEmail("saksham@gmail.com");
        t.setAddress("delhi");
        t.setCgpa(261);
        String s=TY.saveStudent(t);
        System.out.println(s);
    }
}
