public class Driver {
    private String name;
    private String car;
    private String carLicense;
    private String location;
    private int passengerCapacity;
    private int id;

    public Driver(String name, String car, String carLicense, String location,int passengerCapacity, int id) {
        this.name = name;
        this.car = car;
        this.carLicense = carLicense;
        this.location = location;
        this.passengerCapacity = passengerCapacity;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public String getCar() {
        return car;
    }

    public String getCarLicense() {
        return carLicense;
    }

    public String getLocation(){
        return location;
    }

    public int getpassengerCapacity() {return passengerCapacity;}

    public int getId() {
        return id;
    }
}

