class Patient{
    static String hospitalName="City Hospital";
    static int totalPatients = 0;
    String name;
    int age;
    final int patientID;
    String alignment;

    public Patient(String name, int age, String alignment, int patientID) {
        this.name = name;
        this.age = age;
        this.alignment = alignment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients(){
        System.out.println("Total Patients: "+totalPatients);
    }

    public void displayDetails(){
        if(this instanceof Patient){
            System.out.println("Patient ID: "+patientID);
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Alignment: "+alignment);
            Patient.getTotalPatients();
        }
    }

}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Siddharth",23,"Eyes",101);
        p1.displayDetails();
    }
}

//Patient ID: 101
//Name: Siddharth
//Age: 23
//Alignment: Eyes
//Total Patients: 1
