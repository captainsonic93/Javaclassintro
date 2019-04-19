package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Teachers lizzy = new Teachers(1,"Lizzy", 500);
        Teachers mellisa = new Teachers(2,"Mellisa",700);
        Teachers vanderhorn = new Teachers(3,"Vanderhorn",600);

        List<Teachers> teachersList = new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(mellisa);
        teachersList.add(vanderhorn);

        Student tamasha = new Student(1,"Tamsha",4);
        Student sloan = new Student(2,"Sloan",12);
        Student john = new Student(3,"John",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(sloan);
        studentList.add(john);

        School ghs = new School(teachersList,studentList);

        Teachers megan = new Teachers(6,"Megan",900);
        ghs.addTeachers(megan);

        tamasha.payFees(5000);
        john.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());


        System.out.println("------Making GHS pay teachers----------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has paid " + lizzy.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has paid " +vanderhorn.getName()
        + " and now has $"+ ghs.getTotalMoneyEarned());

        mellisa.receiveSalary(mellisa.getSalary());


        System.out.println(sloan);
        System.out.println(john);
        System.out.println(vanderhorn);
        System.out.println(lizzy);
        System.out.println(tamasha);
        System.out.println(mellisa);
        System.out.println(teachersList);

    }

}
