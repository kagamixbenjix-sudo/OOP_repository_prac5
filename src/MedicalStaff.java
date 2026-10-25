public abstract class MedicalStaff {

    String name;
    String employeeID;
    String department;
    int workingHours;

    public MedicalStaff(String name, String employeeID, String department, int workingHours) {
        System.out.println(">> CONSTRUCTOR: Creating staff member " + name);
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
        this.workingHours = workingHours;
    }
}