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

    public final class GraphicDesigner extends FullTimeEmployee {

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


      public final class FinancialConsultant extends FullTimeEmployee {

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

      public final class AdministrativeAssistant extends FullTimeEmployee {

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




