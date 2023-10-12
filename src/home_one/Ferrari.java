package home_one;

public final class Ferrari extends Car{
private ColorCar colorCar;
private Audi numberCar;

    public Ferrari(String model, int wheels, String engine, int maxSpeed, int privod, ColorCar colorCar, Audi numberCar) {
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
    public void ferrari(Ferrari ferrari){
        System.out.println("-----------------");
        System.out.println("car model - " + ferrari.getModel());
        System.out.println("car wheels - " + ferrari.getWheels());
        System.out.println("car engine - " + ferrari.getEngine());
        System.out.println("car maxSpeed - " + ferrari.getMaxSpeed());
        System.out.println("car privod - " + ferrari.getPrivod());
        System.out.println("car Color - " + ferrari.getColorCar());
        System.out.println("car Audi - " + ferrari.getNumberCar().getNumberCar());
    }

    public void car(Car car){
        System.out.println("car");
    }
}
