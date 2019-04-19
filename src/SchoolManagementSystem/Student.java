package SchoolManagementSystem;

public class Student {
    /**
     * created by sloan thomas 4/18/19
     * this class is responsible for keeping the track
     * of students fees, name, grade, & fees paid
     */

   private int id;
   private String name;
   private int grade;
   private int feesPaid;
   private int feesTotal;

    /**
     * to create a new student by initializing
     * fee for every student is $30,000
     * fees paid initially is 0
     * @param id id for the student; unique
     * @param name name of the student
     * @param grade grade of the student
     */
   public Student(int id, String name, int grade){
       this.feesPaid = 0;
       this.feesTotal=30000;
       this.id = id;
       this.name = name;
       this.grade = grade;


   }

   //not going to alter student's name, student's id,


    /**
     * used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
       this.grade = grade;

    }

    /**
     * keep adding the fees to feesPaid field.
     * add the fees to fees paid
     * the school is going to receive the funds
     * @param fees the fees that the student pays
     */

    public  void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);


    }

    /**
     *
     * @return id of student
     */


    public int getId() {
        return id;
    }

    /**
     *
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return grade
     */

    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return fees total
     */

    public int getFeesTotal() {
        return feesTotal;
    }

   public int getRemainingFees(){
        return feesTotal-feesPaid;
   }


    @Override
    public String toString() {
        return "student's name " +name+ " total fees paid so far $"+
                feesPaid;
    }
}
