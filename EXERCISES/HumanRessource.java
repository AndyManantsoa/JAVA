// 12) WAP to create human ressource management system, where stores the required properties of an organization. Display all the data

public class HumanRessource {
    String name;
    String post;
    int age;
    int salary;

    public HumanRessource(String name, String post, int age, int salary) {
        this.name = name;
        this.post = post;
        this.age = age;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Name: "+this.name+"\n"+
                            "Designation: "+this.post+"\n"+
                            "Age: "+ this.age+"\n"+
                            "Salary: "+this.salary+"\n"+"\n");
    }

    public static void main(String[] args) {
        HumanRessource hr1 = new HumanRessource("Lolo", "Manager",30,1000000 );
        HumanRessource hr2 = new HumanRessource("Lili", "Assistant",30,400000 );
        HumanRessource hr3 = new HumanRessource("Lala", "Acountant",30,300000 );
        HumanRessource hr4 = new HumanRessource("Lulu", "Marketing manager",30,200000 );
        HumanRessource hr5 = new HumanRessource("Lele", "Security",30,22000 );

        hr1.display();
        hr2.display();
        hr3.display();
        hr4.display();
        hr5.display();

    }
    
}
