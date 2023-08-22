import java.util.List;
import java.util.Scanner;

public class Main {

    public static void saveDrivers(DriverList driverList){
        // Add data to driver list
        driverList.addDriver(new Driver("Leif Larsson", "buggati veyron", "hkd 614", "Sandviksgatan 19 Luleå", 1));
        driverList.addDriver(new Driver("Johan Bergson", "nissan 350z", "dkj 106", "Luleå Kajakklub", 2));
        driverList.addDriver(new Driver("Lisa Klyft", "mazda miata mx5", "gfd 456", "Luleå Gränsgatan 19", 3));
    }

    public static void displayDrivers(DriverList driverList){
        for(Driver driver : driverList.getDrivers()){
            System.out.println(" ");
            System.out.println("Name:" + " " +driver.getName());
            System.out.println("Car:" + " " +driver.getCar());
            System.out.println("Licence Plate" + " " + driver.getCarId());
            System.out.println("Location" + " " + driver.getLocation());
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        // Variables
        DriverList driverList = new DriverList();
        Scanner scanner = new Scanner(System.in);


        saveDrivers(driverList);

        System.out.println("Welcome to Iber :D ");
        displayDrivers(driverList);
        
        System.out.print("Please select a driver by typing in the id of the driver:");
        String userInput = scanner.nextLine();
        
        String pickupLocation = PickupService.requestPickupLocation();
        System.out.println("You have selected " + pickupLocation + " as pickup location");

        String dropOffLocation = DropOffPointService.requestDropOffLocation();
        System.out.println("You have selected " + dropOffLocation +" as drop off location");

        // Select a driver and write that info out aswell. 
    }
}