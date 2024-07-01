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

    public boolean turnOff(boolean on){
        return on = false;
    }

    public boolean turnOn(boolean on){
        return on = true;
    }

    public void increaseSpeed(boolean on, int speed){
        if(speed >=0 && speed<3 ){
            speed++;
        }
        else if(speed ==3){
            speed=3;
        }
    }

    public void decreaseSpeed(boolean on, int speed){
        if(speed >0 && speed<=3 ){
            speed--;
        }else if(speed ==1){
            speed=1;
        }
    }

    public static void main(String[] args){
        
    }




}


