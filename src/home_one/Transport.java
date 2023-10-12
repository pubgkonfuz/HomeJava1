package home_one;

public class Transport {
    private String model;
    private int wheels;
    private String engine;
    private int maxSpeed;
    private int privod;
    private ColorCar colorCar;
    private Audi numberCar;

    public Transport(String model, int wheels, String engine, int maxSpeed, int privod, ColorCar colorCar, Audi numberCar) {
        this.model = model;
        this.wheels = wheels;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.privod = privod;
        this.colorCar = colorCar;
        this.numberCar = numberCar;
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrivod() {
        return privod;
    }

    public ColorCar getColorCar() {
        return colorCar;
    }

    public Audi getNumberCar() {
        return numberCar;
    }
}
