package SchoolManagementSystem;

import java.util.List;

/**
 * many teachers, many students
 * implement teachers and student
 * using an array list
 */
public class School {

    private List<Teachers> teacher;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    /**
     * new school object is created
     * @param teacher list of teachers in school
     * @param students list of students in school
     */
    public School(List<Teachers> teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return list of teachers
     */
    public List<Teachers> getTeachers() {
        return teacher;
    }

    /**
     * add a teacher to school
     * @param teachers the teacher to be added
     */
    public void addTeachers(Teachers teachers) {
        teacher.add(teachers);
    }

    public List<Student> getStudent() {
        return students;
    }

    /**
     * add a student
     * @param student the student to be added
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds total money earned by the school
     * @param MoneyEarned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update money that is spent by the school which is
     * the salary given by the school to its teachers
     * @param MoneySpent
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
