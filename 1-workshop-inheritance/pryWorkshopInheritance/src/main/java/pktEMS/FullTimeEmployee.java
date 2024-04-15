package pktEMS;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee() {
        super(0, "", "", "", 0.0f, 0);
    }
    public FullTimeEmployee(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
        super(id, firstName, lastName, hiringDate, salary, workedHours);
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

  }
}




