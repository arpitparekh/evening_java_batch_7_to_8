package oopc;

class Vehicle {

  int wheels;
  String color;

  Vehicle(int w, String c) {
    wheels = w;
    color = c;
    display();
  }

  void display() {
    System.out.println("wheels: " + wheels);
    System.out.println("color: " + color);
  }

}

class Circle {

  double radius;

  Circle(double r) {
    radius = r;
  }

  void area() {
    double a = 3.14 * radius * radius;
    System.out.println("area: " + a);
  }

  void perimeter() {
    double p = 2 * 3.14 * radius;
    System.out.println("perimeter: " + p);
  }
}

public class ConstrcutorInClass {

  public static void main(String[] args) {

    // constrcutor
    // constructor is a special method that is used to initialize the object
    // constructor is called automatically when an object is created
    // constructor does not have a return type
    // constructor name should be same as class name

    Vehicle v = new Vehicle(4, "red");
    Vehicle v2 = new Vehicle(2, "blue");

    Circle c = new Circle(5.5);
    c.area();

    Circle c2 = new Circle(10.5);
    c2.area();

    Circle c3 = new Circle(15.5);
    c3.area();

  }

}
