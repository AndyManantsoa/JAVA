//11) WAP to create a bike object of 2 different properties with default constructor


public class Bike {
    //instance variable;
    String name;
    String engineType;
    int speed;

    public Bike(String name, String engineType){
        this.name = name;
        this.engineType = engineType;
        System.out.println("Bike created");
    }

    public Bike(int speed){
        this.speed = speed;
    }

    public void display(){
        System.out.println(b1.name+" "+b1.engineType+" "+ this.speed+"\n");

    }
    public static void main(String[] args) {
        Bike b1 = new Bike("Yamaha","v8");
        b1.display();
        b1.display();

    }

}
