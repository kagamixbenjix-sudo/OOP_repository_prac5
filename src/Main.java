public class Main {
    public static void main(String[] args) {
        System.out.println("Mukono Hospital staff system started");

        // MedicalStaff staff = new MedicalStaff("Unknown", "EMP000", "None", 0);
        // The line above does not compile: MedicalStaff is abstract and cannot be instantiated.

        System.out.println("--- Creating staff members ---");
        MedicalStaff[] team = new MedicalStaff[4];
        team[0] = new Doctor("Okello James", "EMP001", "Surgery", 40, "Surgeon");
        team[1] = new Nurse("Namukasa Rose", "EMP002", "Maternity", 45, "Maternity Ward");
        team[2] = new Pharmacist("Mugisha Peter", "EMP003", "Pharmacy", 40, "Outpatient Pharmacy");
        team[3] = new LabTechnician("Achieng Grace", "EMP004", "Laboratory", 42, "Haematology");
    }
}