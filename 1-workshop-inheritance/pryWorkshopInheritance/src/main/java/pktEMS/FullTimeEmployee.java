package pktEMS;

public class FullTimeEmployee extends Employee {
    String department;
    float bonus;

    public FullTimeEmployee() {
        super(0, "", "", "", 0.0f, 0);
    }

    // constructor for Manager
    public FullTimeEmployee(int id, String firstName, String lastName, String hiringDate, float salary,
                            int workedHours, String department) {
        super(id, firstName, lastName, hiringDate, salary, workedHours);
        this.department = department;
    }

    // constructor for other roles
    public FullTimeEmployee(int id, String firstName, String lastName, String hiringDate, float salary,
                            int workedHours, float bonus) {
        super(id, firstName, lastName, hiringDate, salary, workedHours);
        this.bonus = bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public double CalculateSalary() {
        return this.getSalary() * this.getWorkedHours();
    }
    
    public void requestVacation(int vacationDays) {
        System.out.println("Vacation request for " + vacationDays + " days in process.");
    }
    
    public void registerAttendance() {
        System.out.println("Daily attendance recorded for: " + this.getFirstName() + " " + this.getLastName());
    }

    public void receiveBonus() {
        double bonusAmount = this.getSalary() * 0.1; // Bonus is 10%
        System.out.println("Receive a bonus of $" + bonusAmount + ".");
        this.setSalary((float) (this.getSalary() + bonusAmount));
    }

    public final class Manager extends FullTimeEmployee{
        public Manager(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours, String department, float bonus) {
            super(id, firstName, lastName, hiringDate, salary, workedHours, department);
        }

        public void assignTask(String name){
            System.out.println("Assigning a task for " + name + ".");
        }

        public void manageTeam(String team){
            System.out.println("Managing the  " + team + " team...");
        }

        public void generateReport(){
            System.out.println("Generating a report for " + this.department + "...");
        }
    }

    public final class Secretary extends FullTimeEmployee{
        public Secretary(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours, String department, float bonus) {
            super(id, firstName, lastName, hiringDate, salary, workedHours, bonus);
        }

        public void manageAgenda(){
            System.out.println("Including new meets to manager at this week...");
        }

        public void writeCorrespondence(String company){
            System.out.println("Writing a letter to the CEO of "+ company +" ...");
        }

        public void organizeDocuments(){
            System.out.println("Organizing the documents of the Boss...");
        }
    }

    public final class SoftwareEngineer extends FullTimeEmployee {
        public SoftwareEngineer(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours, String department, float bonus) {
            super(id, firstName, lastName, hiringDate, salary, workedHours, bonus);
        }

        public void developSoftware() {
            System.out.println("Developing new updates...");
        }

        public void testingSoftware() {
            System.out.println("Testing the new implementations in the software...");
        }

        public void maintenanceSystem() {
            System.out.println("Starting system maintenance...");
        }
    }

    public final class SupportTechnician extends FullTimeEmployee {
        public SupportTechnician(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours, String department, float bonus) {
            super(id, firstName, lastName, hiringDate, salary, workedHours, bonus);
        }

        public void solveIssue() {
            System.out.println("Solving an issue...");
        }

        public void updateSoftware() {
            System.out.println("Updating the software to all computers...");
        }

        public void provideGuidance() {
            System.out.println("Provide guidance to users...");
        }
    }

}




