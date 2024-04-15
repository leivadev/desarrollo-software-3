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

    public final class GraphicDesigner extends PartTimeEmployee {

        public GraphicDesigner(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
          super(id, firstName, lastName, hiringDate, salary, workedHours);
        }
      
        // Method 1: Create a design
        public void createDesign(String projectName) {
          System.out.println("Creating a design for project: " + projectName);
        }
      
        // Method 2: Revise a design
        public void reviseDesign(String projectName, int revisionNumber) {
          System.out.println("Revising design for project: " + projectName + ", Revision: " + revisionNumber);
        }
      
        // Method 3: Present a design
        public void presentDesign(String projectName) {
          System.out.println("Presenting design for project: " + projectName);
        }
      }


      public final class FinancialConsultant extends PartTimeEmployee {

        public FinancialConsultant(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
          super(id, firstName, lastName, hiringDate, salary, workedHours);
        }
      
        // Method 1: Conduct a Financial Assessment
        public void conductFinancialAssessment(String clientName) {
          System.out.println("Conducting financial assessment for client: " + clientName);
        }
      
        // Method 2: Develop a Financial Plan 
        public void developFinancialPlan(String clientName) {
          System.out.println("Developing a financial plan for client: " + clientName);
        }
      
        // Method 3: Recommend Investment Strategies
        public void recommendInvestmentStrategies(String clientName) {
          System.out.println("Recommending investment strategies for client: " + clientName);
        }
      }

      public final class AdministrativeAssistant extends PartTimeEmployee {

        public AdministrativeAssistant(int id, String firstName, String lastName, String hiringDate, float salary, int workedHours) {
          super(id, firstName, lastName, hiringDate, salary, workedHours);
        }
      
        // Method 1: Schedule Meetings
        public void scheduleMeeting(String meetingTopic, String attendees) {
          System.out.println("Scheduling meeting: " + meetingTopic + ", Attendees: " + attendees);
        }
      
        // Method 2: Prepare Documents
        public void prepareDocuments(String documentType, String recipient) {
          System.out.println("Preparing " + documentType + " for " + recipient);
        }
      
        // Method 3: Manage Travel Arrangements
        public void manageTravelArrangements(String employeeName, String destination) {
          System.out.println("Managing travel arrangements for " + employeeName + " to " + destination);
        }
      }

}
