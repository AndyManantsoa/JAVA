//10. Write a java program for Method overloading and Constructor overloading

public class P10 {
    int age;
    int number=123456;

    public P10(){
        this.age=30;
    }

    public P10(int age){
        this.age=age;
    }
    public P10(int age, int number){
        this.age=age;
        this.number=number;
    }

    public void display(){
        System.err.println("Age:"+this.age+"  Number: "+this.number);
    }

    public static void main(String[] args) { 
        P10 one = new P10();
        P10 two = new P10(12);
        P10 three = new P10(24,8141176);
        one.display();
        two.display();
        three.display();

    }
}
