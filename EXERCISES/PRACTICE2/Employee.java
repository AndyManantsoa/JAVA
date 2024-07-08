// 4) Develop a class Employee with name, department, and salary as instance variables.
//    Create constructors for full information and another with just name and department (assuming salary can be assigned later).

public class Employee {
    String name;
    String department;
    float salary;

    public Employee(String name, String department, float salary){
        this.name= name;
        this.department= department;
        this.salary=salary;
      }
      
      public Employee(String name, String department){
        this.name= name;
        this.department= department;
      }
      
      public void display(){
            System.out.println("name : "+this.name+"\n"+
                              "department : "+this.department+"\n"+
                              "Salary : "+this.salary+"\n\n");
        }

        public static void main(String[] args){
            Employee b1 = new Employee("Manantsoa","Shake Spear", 8);
            b1.display();
            Employee b2 = new Employee("Claudino", "lolo");
            b2.salary=100000;
            b2.display();
    
        }

}
