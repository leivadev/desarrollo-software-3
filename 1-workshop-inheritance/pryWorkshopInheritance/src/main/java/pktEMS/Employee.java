package pktEMS;

public class Employee {
    private int id;
    protected String firstName;
    protected String lastName;
    private String hiringDate;
    public float salary;
    public int workedHours;

    //Constructor
    public Employee(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiringDate = hiringDate;
        this.salary = salary;
        this.workedHours = workedHours;
    }

    // Getter & Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

}
