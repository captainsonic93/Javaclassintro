package SchoolManagementSystem;

/**
 * this class is responsible for keeping track of teacher's
 * name, id, salary.
 */
public class Teachers {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creates a new teacher object
     * @param id id for the teacher
     * @param name name for the teacher
     * @param salary salary for the teacher
     */


    public Teachers(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;


    }

    /**
     *
     * @return the id
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return the name
     */
    public String getName(){
        return name;

    }

    /**
     *
     * @return the salary
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * adds to salary
     * removes from the total earned
     * @param salary
     */

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher " +name +
                " total salary earned so far $"+ salaryEarned;
    }
}
