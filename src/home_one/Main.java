package home_one;

public class Main {
    public static void main(String[] args){
        Audi audi = new Audi(699);
        Car car = new Car(
                "жигули",
                4,
                "V6",
                260,
                2,
                ColorCar.BLACK,
                audi
        );
    Ferrari ferrari = new Ferrari(
                "F8",
            4,
            "V12",
            450,
            4,
            ColorCar.WHITE,
            audi
    );
    Ferrari ferrari2 =new Ferrari(
            "F430",
            4,
            "V8",
            400,
            2,
            ColorCar.BROWN,
            audi
    );
    car.car(car);
    ferrari.car(car,ferrari);
    ferrari.car(car,ferrari2);
        ferrari2.ferrari(ferrari2);
        ferrari.ferrari(ferrari);
    }
}