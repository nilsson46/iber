import java.util.Scanner;

public class DropOffPointService {
    public static String requestDropOffLocation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your drop off location: ");
        String dropOffLocation = scanner.nextLine();
        return dropOffLocation;
    }
}
