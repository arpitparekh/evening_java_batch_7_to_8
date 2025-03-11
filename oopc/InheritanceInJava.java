package oopc;

class Animal {  // parent // base class
  String name;
  int no_of_leg;

  void run() {
    System.out.println("Animal is running");
  }
}

class Dog extends Animal {  // child class // derived class

}

public class InheritanceInJava {

  public static void main(String[] args) {

    // inheritance
    // when we use one class property and function into another class then it is called inheritance
    // code reusability

    Dog d = new Dog();
    d.name = "Lab";
    d.no_of_leg = 4;
    d.run();


  }

}
