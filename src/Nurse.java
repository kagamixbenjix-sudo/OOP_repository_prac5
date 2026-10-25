public class Nurse extends MedicalStaff {

    String ward;

    public Nurse(String name, String employeeID, String department, int workingHours, String ward) {
        super(name, employeeID, department, workingHours);
        System.out.println(">> CONSTRUCTOR: Nurse created");
        this.ward = ward;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Nurse (" + ward + ")");
        System.out.println("Duties: monitors patients, administers medication and assists the doctors.");
    }
}