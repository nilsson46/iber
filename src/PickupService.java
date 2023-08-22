import java.util.Scanner;

public class PickupService {
    public static String requestPickupLocation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your pickup location: ");
        String pickupLocation = scanner.nextLine();
        return pickupLocation;
    }
}
