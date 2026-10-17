public class Super{
  String first;
  String last;

  Super(String first, String last){
    this.first = first;
    this.last = last;
  }

  void showName(){
    System.out.println(this.first+ " "+ this.last);
  }
}

class Students extends Super{
  double gpa;
  Students(String first, String last, double gpa){
    super(first, last);
    this.gpa = gpa;
  }

  void showGPA(){
    System.out.println(this.first + " 's gpa is: " + this.gpa);
  }
}

class Employee extends Super{
  int salary;
  Employee(String first, String last, int salary){
    super(first, last);
    this.salary = salary;
  }

  void showSalary(){
    System.out.println(this.first+ " 's salary is: $"+this.salary);
  }
}

class Mainse{
  public static void main(String[] args) {
    Super person = new Super("Tom", "Riddle");
    person.showName();
    Students student = new Students("Amey", "Karoo", 10.0);
    Employee employee = new Employee("Ruby", "Hegrid", 50000);
    student.showName();
    student.showGPA();
    employee.showSalary();
  }
}

