package Question1.Dao;

import Question1.Student;

public interface StudentDao {
    Student findStudentById(int id);
    String saveStudent(Student student);
    String deleteStudentById(int id);
    String updateStudentCGPA(int id, int cgpa);
}
