// Create a class called "Fan" with the following attributes:
// speed (int) - This can be a value from 1 (slow) to 3 (fast)
// on (boolean) - Indicates whether the fan is on or off
// Write a program that:
// * Defines the Fan class with the mentioned attributes.
// * Creates an object of the Fan class with initial values for speed and on state.
// * Add methods to the Fan class for:
// * turnOn - Sets the on attribute to true.
// * turnOff - Sets the on attribute to false.
// * increaseSpeed - Increases the speed by 1 (if the speed is already 3, it stays at 3).
// * decreaseSpeed - Decreases the speed by 1 (if the speed is already 1, it stays at 1).
// * Use the defined methods to change the fan's state (on/off) and speed.
// * Print the current state (on/off) and speed of the fan after each change.

public class Fan{
    int speed=0;
    boolean on;
    
    public Fan(int speed, boolean on){
        this.speed = speed;
        this.on = on;
    }

    public void turnOn() {
        this.on = true;
        System.out.println("Fan turned on");
    }

    public void turnOff() {
        this.on = false;
        System.out.println("Fan turned off");
    }

    public void increaseSpeed() {
        if (this.speed < 3) {
            this.speed++;
            System.out.println("Speed increased to " + this.speed);
        } else {
            System.out.println("Speed is already at max=3");
        }
    }

    public void decreaseSpeed() {
        if (this.speed > 1) {
            this.speed--;
            System.out.println("Speed decreased to " + this.speed);
        } else {
            System.out.println("Speed is already at the minimum =1");
        }
    }

    public void printState() {
        System.out.println("Fan is " + (this.on ? "on" : "off") + " with speed " + this.speed);
    }

    public static void main(String[] args){
        Fan fan = new Fan(1, false);

        fan.turnOn();
        fan.printState();
        fan.increaseSpeed();
        fan.printState();
        fan.decreaseSpeed(); 
        fan.printState();
        fan.turnOff();
    }
}


