package oopc;

class Student {
  String name;
  int age;
  String address;

  void fun() {
    System.out.println("Student is having fun");
  }

}

public class ClassObject {

  public static void main(String[] args) {

    // class
    // dividing the program into small parts called class
    // class is a blueprint
    // class is a template
    // class never occupy memory
    // class is a collection of variables and methods(functons)

    // object
    // object is an instance of a class
    // objetc is used to access the variables and methods of a class
    // object is a real world entity bacause is used to store the data
    // object always occupy memory
    // new => heap memory

    Student s = new Student();
    s.name = "John";
    s.age = 23;
    s.address = "123 Main St";

    Student s2 = new Student();
    s2.name = "Jane";
    s2.age = 24;
    s2.address = "123 Main St";

    Student s3 = new Student();
    s3.name = "John";
    s3.age = 23;
    s3.address = "123 Main St";

    s.fun();
    s2.fun();
    s3.fun();

    // is java a pure oop language ?
    // no
    // because of primitive data types java is not a pure oop language

  }

}
