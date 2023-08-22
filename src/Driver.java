public class Driver {
    private String name;
    private String car;
    private String carId;
    private String location;

    private  int id;

    public Driver(String name, String car, String carId, String location, int id) {
        this.name = name;
        this.car = car;
        this.carId = carId;
        this.location = location;
        this.id = id;
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

    public int getId(){
        return id;
    }
}

