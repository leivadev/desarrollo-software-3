package pktEMS;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee() {
        super(0, "", "", "", 0.0f, 0);
    }
    public FullTimeEmployee(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
        super(id, firstName, lastName, hiringDate, salary, workedHours);
    }
}
