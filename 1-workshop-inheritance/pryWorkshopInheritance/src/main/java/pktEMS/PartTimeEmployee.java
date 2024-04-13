package pktEMS;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee() {
        super(0, "", "", "", 0.0f, 0);
    }
    public PartTimeEmployee(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
        super(id, firstName, lastName, hiringDate, salary, workedHours);
    }
}
