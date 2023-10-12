package home_one;
public class Car extends Transport{
    private ColorCar colorCar;
    private Audi numberCar;

    public Car(String model, int wheels, String engine, int maxSpeed, int privod, ColorCar colorCar, Audi numberCar) {
        super(model, wheels, engine, maxSpeed, privod, colorCar, numberCar);
        this.numberCar = numberCar;
        this.colorCar = colorCar;
    }

    @Override
    public ColorCar getColorCar() {
        return colorCar;
    }

    @Override
    public Audi getNumberCar() {
        return numberCar;
    }

    public void car(Car car) {
        System.out.println("----------------");
        System.out.println("car model - " + car.getModel());
        System.out.println("car wheels - " + car.getWheels());
        System.out.println("car engine - " + car.getEngine());
        System.out.println("car maxSpeed - " + car.getMaxSpeed());
        System.out.println("car privod - " + car.getPrivod());
        System.out.println("car Color - " + car.getColorCar());
        System.out.println("car Audi - " + car.getNumberCar().getNumberCar());
    }
    public final void car(Car car,Ferrari ferrari){
        System.out.println("hello");
    }

}
