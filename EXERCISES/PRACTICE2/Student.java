//2) Design a class Student with name, id, and gpa as instance variables.
//   Implement constructors for full information and another for just name and id (assuming GPA can be calculated later).

public class Student{
    String name;
    int id;
    float gpa;
  
    public Student(String name, int id, float gpa){
      this.name= name;
      this.id= id;
      this.gpa= gpa;
    }
    
    public Student(String name, int id){
        this.name= name;
        this.id= id;
      }
    
    public void display(){
          System.out.println("Name : "+this.name+"\n"+
                            "id : "+this.id+"\n"+
                            "GPA : "+this.gpa+"\n\n");
      }
  
      public static void main(String[] args){
          Student s1 = new Student("Manantsoa", 1234, 8);
          s1.display();
          Student s2 = new Student("Claudino", 1235);
          s2.gpa=9;
          s2.display();
  
      }
  }
