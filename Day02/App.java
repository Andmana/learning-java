package Day02;

public class App {
    public static void main(String[] args) {
        Vehicle motor = new Vehicle();

        motor.name = "Supra Bapak";
        motor.brand ="Kawasaki";
        motor.model = "ZR250";
        motor.wheels = 2;
        motor.engineCapacity = 250;
        motor.engineType = "cylinders";


        System.out.println(String.valueOf(motor.name));
        System.out.println(String.valueOf(motor));

        motor.accelerate(10);
        motor.start();
        motor.accelerate(10);
        motor.accelerate(10);
        motor.brake();
        motor.stop();
        motor.turnOff();

        Car myCar = new Car();
        myCar.rev();

        MotorBike myBike = new MotorBike();
        myBike.rev();

        














    }


}
