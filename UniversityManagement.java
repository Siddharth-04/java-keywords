class Student {
    static String universityName = "Chitkara University";
    static int totalStudents = 0;

    String name;
    int rollNumber;
    double cgpa;

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public Student(String name, int rollNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
        totalStudents++;
    }

    public void display() {
        if(this instanceof Student){
            System.out.println("University Name : " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("CGPA: " + cgpa);
            System.out.println("Total Students: " + totalStudents);
        }
    }
}
public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Siddharth Singh", 1360, 9.2);
        Student s2 = new Student("Rohit Sharma", 1450, 9.1);
        s1.display();
        System.out.println();
        s2.display();
    }
}

//University Name : Chitkara University
//Name: Siddharth Singh
//Roll Number: 1360
//CGPA: 9.2
//Total Students: 2
//
//University Name : Chitkara University
//Name: Rohit Sharma
//Roll Number: 1450
//CGPA: 9.1
//Total Students: 2
