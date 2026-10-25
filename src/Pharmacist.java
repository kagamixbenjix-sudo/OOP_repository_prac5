public class Pharmacist extends MedicalStaff {

    String pharmacySection;

    public Pharmacist(String name, String employeeID, String department, int workingHours, String pharmacySection) {
        super(name, employeeID, department, workingHours);
        System.out.println(">> CONSTRUCTOR: Pharmacist created");
        this.pharmacySection = pharmacySection;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Pharmacist (" + pharmacySection + ")");
        System.out.println("Duties: dispenses prescribed medicine and advises patients on how to use it.");
    }
}