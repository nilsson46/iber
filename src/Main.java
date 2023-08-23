import java.util.List;
import java.util.Scanner;

public class Main {

    public static void saveDrivers(DriverList driverList){
        // Add data to driver list
        driverList.addDriver(new Driver("Leif Larsson", 3,"buggati veyron", "hkd 614", "Sandviksgatan 19 Luleå", 1, 1 ));
        driverList.addDriver(new Driver("Johan Bergson", 4,"nissan 350z", "dkj 106", "Luleå Kajakklub", 4,2));
        driverList.addDriver(new Driver("Lisa Klyft", 5, "mazda miata mx5", "gfd 456", "Luleå Gränsgatan 19", 4,3));
    }

    public static void displayDrivers(DriverList driverList){
        for(Driver driver : driverList.getDrivers()){
            System.out.println(" ");
            System.out.println("Name:" + " " +driver.getName());
            System.out.println("Driver rating:" + " " + driver.getRating() + "/5");
            System.out.println("Driver id:" + " " + driver.getId());
            System.out.println("Car:" + " " +driver.getCar());
            System.out.println("Passenger capacity:" + " " + driver.getpassengerCapacity());
            System.out.println("Licence Plate" + " " + driver.getCarLicense());
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
        int userInput = scanner.nextInt();

        System.out.print("How many passengers: ");
        int passengerInput = scanner.nextInt();

        for(Driver driver : driverList.getDrivers()) {

            if (userInput == driver.getId()) {
                if(passengerInput > 0 && passengerInput <= driver.getpassengerCapacity()) {

                    System.out.println("");
                    System.out.println(driver.getName() + " is your driver today");

                    String pickupLocation = PickupService.requestPickupLocation();

                    System.out.println("You have selected " + pickupLocation + " as pickup location");

                    String dropOffLocation = DropOffPointService.requestDropOffLocation();
                    System.out.println("You have selected " + dropOffLocation + " as drop off location");
                    System.out.println("*******************************");
                    System.out.println("Information about your ride");
                    System.out.println("Driver : " + driver.getName());
                    System.out.println("Car : " + driver.getCar());
                    System.out.println("Amount of passengers: " + (passengerInput));
                    System.out.println("License plate : " + driver.getCarLicense());
                    System.out.println("Pickup location: " + pickupLocation);
                    System.out.println("Drop off location: " + dropOffLocation);
                    System.out.println("*******************************");
                }
            } //else{
                //System.out.println("Couldn't find a car with enough capacity");
            }
        System.out.print("Rate the driver(1-5):");
        int rateInput = scanner.nextInt();
        System.out.println(driverList.getDrivers().get(userInput).getName() + "got "+ rateInput + "out of 5 from you");
        }


    // Select a driver and write that info out aswell.
    }
