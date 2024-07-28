
public class Employee {

    String name, departement , designation;
    int age;
    double salary;

    public Employee(String name,int age, String departement, String designation,  double salary) {
        this.name = name;
        this.age = age;
        this.departement = departement;
        this.designation = designation;
    }

    public void print(){
        System.out.println("Name: "+this.name+"\n"+
                            "Age:"+this.age+"\n"+
                            "Departement:"+this.departement+"\n"+
                            "Designation:"+this.designation+"\n"+
                            "Salary: "+this.salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Manantsoa", 25, "IT", "Software Engineer",80000);
        emp1.print();
        Employee emp2 = new Employee("Alex", 34, "IT", "Software developper",65000);
        emp2.print();
    }

}
