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
  
  public void display(){
        System.out.println("Name : "+this.name+"\n"+
                          "id : "+this.id+"\n"+
                          "GPA : "+this.gpa+"\n\n");
    }

    public void main(String[] args){
        Student s1 = new Student("Lambo", "Urus", 2019);
        s1.display();

  
}
