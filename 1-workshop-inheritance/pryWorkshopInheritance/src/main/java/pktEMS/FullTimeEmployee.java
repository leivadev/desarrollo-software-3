package pktEMS;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee() {
        super(0, "", "", "", 0.0f, 0);
    }
    public FullTimeEmployee(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
        super(id, firstName, lastName, hiringDate, salary, workedHours);
    }

    public double CalculateSalary() {
        // Implement salary calculation
        return this.getSalary() * this.getWorkedHours();
    }
    
    public void requestVacation(int vacationDays) {
        System.out.println("Vacation request for " + vacationDays + " days in process.");
        // Implement logic to handle vacation requests (deduct days, send for approval, etc.)
    }
    
    public void registerAttendance() {
        System.out.println("Welcome, " + this.getName() + ". Registering your presence...");
        this.setPresentAttendance(this.getPresentAttendance() + 1);
        System.out.println("Attendance recorded as present.");
    }

    public void receiveBonus() {
        double bonusAmount = this.getSalary() * 0.1; // Bonus is 10%
        System.out.println("Recieve a bonus of $" + bonusAmount + ".");
        this.setSalary(this.getSalary() + bonusAmount);
    }

}




