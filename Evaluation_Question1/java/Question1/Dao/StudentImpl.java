package Question1.Dao;

import Question1.Student;
import org.w3c.dom.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentImpl implements StudentDao{
    @Override
    public Student findStudentById(int id) {
        Student message=null;
        EntityManagerFactory r=Persistence.createEntityManagerFactory("Student");
        EntityManager J=r.createEntityManager();
        Student st=J.find(Student.class,id);


        return st;
    }

    @Override
    public String saveStudent(Student student) {
        String masage="Data not found";
        EntityManagerFactory Em= Persistence.createEntityManagerFactory("Student");
        EntityManager T=Em.createEntityManager();
        T.getTransaction().begin();
        T.persist(student);
        T.getTransaction().commit();
        System.out.println("Succesfully added");
        T.close();
        return masage;
    }

    @Override
    public String deleteStudentById(int id) {
        String masage=null;
        EntityManagerFactory u=Persistence.createEntityManagerFactory("Student");
        EntityManager W=u.createEntityManager();
        Student s=W.find(Student.class,id);
        if(s!=null){
            W.getTransaction().begin();
            W.remove(s);
            W.getTransaction().commit();
            System.out.println("Deleted Successfully");
        }
        return masage;
    }

    @Override
    public String updateStudentCGPA(int id, int cgpa) {

        String masage=null;
        EntityManagerFactory t=Persistence.createEntityManagerFactory("Student");
        EntityManager R=t.createEntityManager();
        R.getTransaction().begin();
        Student a=R.find(Student.class,id);
        a.setCgpa(cgpa);
        R.persist(a);
        R.getTransaction().commit();
        R.close();



        return message;
    }
}

