import java.util.List;

public class Main {

    public static void saveDrivers(DriverList driverList){
        // Add data to driver list
        driverList.addDriver(new Driver("Leif Larsson", "buggati veyron", "hkd 614", "Sandviksgatan 19 Luleå"));
        driverList.addDriver(new Driver("Johan Bergson", "nissan 350z", "dkj 106", "Luleå Kajakklub"));
        driverList.addDriver(new Driver("Lisa Klyft", "mazda miata mx5", "gfd 456", "Luleå Gränsgatan 19"));
    }
    public static void main(String[] args) {
        // Variables
        DriverList driverList = new DriverList();


        saveDrivers(driverList);



        // Test: if drivers are stored in driverList
        for(Driver driver : driverList.getDrivers()){
            System.out.println(" ");
            System.out.println("Name:" + " " +driver.getName());
            System.out.println("Car:" + " " +driver.getCar());
            System.out.println("Licence Plate" + " " + driver.getCarId());
            System.out.println("Location" + " " + driver.getLocation());
            System.out.println(" ");

        }

        System.out.println("Welcome to Iber :D ");
        String pickupLocation = PickupService.requestPickupLocation();
        System.out.println("You have selected " + pickupLocation + " as pickup location");

        String dropOffLocation = DropOffPointService.requestDropOffLocation();
        System.out.println("You have selected " + dropOffLocation +" as drop off location");

        // Select a driver and write that info out aswell. 
    }
}