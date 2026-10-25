public class LabTechnician extends MedicalStaff {

    String labType;

    public LabTechnician(String name, String employeeID, String department, int workingHours, String labType) {
        super(name, employeeID, department, workingHours);
        System.out.println(">> CONSTRUCTOR: Laboratory technician created");
        this.labType = labType;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Laboratory Technician (" + labType + ")");
        System.out.println("Duties: collects samples, runs laboratory tests and reports the results to the doctors.");
    }
}