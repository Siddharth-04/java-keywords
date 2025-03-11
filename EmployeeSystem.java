class Employee{
    static String companyName = "Siddharth Technologies";
    static int totalNumberOfEmployees = 0;
    final int employeeId;
    String name;
    String designation;

    public Employee(int employeeId,String name,String designation){
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        totalNumberOfEmployees++;
    }

    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Company Name: " + companyName);
    }

    static void totalEmployees(){
        System.out.println("Total employees: " + totalNumberOfEmployees);
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Ishaan", "Web Developer");
       Employee.totalEmployees();
        employee1.displayDetails();
    }
}

//Total employees: 1
//Employee ID: 101
//Name: Ishaan
//Designation: Web Developer
//Company Name: Siddharth Technologies