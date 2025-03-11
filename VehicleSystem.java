class Vehicle {
    static int registrationFee = 5000;
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayDetails() {
        if(this instanceof Vehicle){
            System.out.println("Registration Number : " + registrationNumber);
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);;
        }
    }

    static void uodateRegistration(int newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Siddharth", "SUV", 101);
        v1.displayDetails();
    }
}

//Registration Number : 101
//Owner: Siddharth
//Vehicle Type: SUV
