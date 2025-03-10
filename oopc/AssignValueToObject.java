package oopc;

class Employee {

  // variables and properties
  String name;
  int age;
  String address;

  void assignValues(String n, int a, String ad) {
    name = n;
    age = a;
    address = ad;
    // System.out.println("Name: " + name);
    // System.out.println("Age: " + age);
    // System.out.println("Address: " + address);
    display();  // calling function inside a function
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Address: " + address);
  }

}

public class AssignValueToObject {

  public static void main(String[] args) {
    // using method
    Employee e1 = new Employee();
    e1.assignValues("John", 23, "Vastrapur");
    // e1.display();

    System.out.println("-------------------------");
    Employee e2 = new Employee();
    e2.assignValues("Jane", 22, "Vastrapur");
    // e2.display();

  }

}
