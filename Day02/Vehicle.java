package Day02;

public class Vehicle {
    public String name;
    public int wheels;
    public int speed;
    public int engineCapacity;
    public String engineType;
    public String brand;
    public String model;
    public boolean isStarted = false;


    public void start() {
        this.isStarted = true;
    }

    public void stop() {     
        this.speed = 0;
        showSpeed();
    }

    public void turnOff(){
        if(speed != 0) System.out.println("You should stop the car first");
        else {
            System.out.println("Engiine turn off");
            isStarted = false;}
    }


    public void accelerate(int speed){
        if (!this.isStarted) System.out.println("You havent start the vehicle");
        else {
            this.speed += speed;
            showSpeed();
        }
    }
    
    public void brake() {
        this.speed -= 10;
        showSpeed();
        
    }
    
    public void showSpeed(){
        System.out.println("Current speed = " + speed);
    }

    
}
