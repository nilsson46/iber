public class Driver {
    private String name;
    private String car;
    private String carId;
    private String location;

    public Driver(String name, String car, String carId, String location) {
        this.name = name;
        this.car = car;
        this.carId = carId;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getCar() {
        return car;
    }

    public String getCarId() {
        return carId;
    }

    public String getLocation(){
        return location;
    }
}

