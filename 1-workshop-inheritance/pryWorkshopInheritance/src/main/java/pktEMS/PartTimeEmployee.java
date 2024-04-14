package pktEMS;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee() {
        super(0, "", "", "", 0.0f, 0);
    }
    public PartTimeEmployee(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
        super(id, firstName, lastName, hiringDate, salary, workedHours);
    }

    public float calculateSalary() {
        return this.getSalary() * this.getWorkedHours();
    }

    public void requestAbscentPermit(int abscentDays) {
        System.out.println("Abscent permit for "+ abscentDays +" successfully requested.");
    }

    public void organizeInventory() {
        System.out.println("Product inventory organized.");
    }

    public void attendClients() {
        System.out.println("Attending clients during work hours...");
    }

    public final class DataAnalyst extends PartTimeEmployee {
        public DataAnalyst(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
            super(id, firstName, lastName, hiringDate, salary, workedHours);
        }

        public void AnalyzeData(String dataSet) {
            System.out.println("analyzing " + dataSet + " file...");
        }

        public void generateAnalysisReport(String dataSet) {
            System.out.println("Generating a report for " + dataSet + "file...");
        }

        public void developPredictiveModel(String dataSet) {
            System.out.println("Developing a predictive model from " + dataSet +" ...");
        }

    }

}
