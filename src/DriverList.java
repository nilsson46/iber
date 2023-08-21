import java.util.ArrayList;
import java.util.List;
public class DriverList {
    private List<Driver> driverList;

    public DriverList(){
        driverList = new ArrayList<>();
    }

    public void addDriver(Driver driver){
        driverList.add(driver);
    }

    public List<Driver> getDrivers() {
        return driverList;
    }
}
