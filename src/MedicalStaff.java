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

    public void displayStaffInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Working Hours: " + workingHours + " hours per week");
    }

    public abstract void performDuties();
}