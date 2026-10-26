public class Doctor extends MedicalStaff {

    String specialization;

    public Doctor(String name, String employeeID, String department, int workingHours, String specialization) {
        super(name, employeeID, department, workingHours);
        System.out.println(">> CONSTRUCTOR: Doctor created");
        this.specialization = specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Doctor (" + specialization + ")");
        System.out.println("Duties: examines patients, diagnoses illnesses and prescribes treatment.");
    }
}