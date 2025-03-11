package oopc;

// single inheritance
class A{

}

class B extends A {

}

// multilevel inheritance
class C extends B {

}

// hierarchical inheritance  // one parent multiple child
class a1 {

}

class b1 extends a1 {

}

class c1 extends a1 {

}

// multiple inheritance  // is not possible in java
class Parent1{
  void dance() {
    System.out.println("Parent1 is dancing");
  }
}

class Parent2 {
  void dance() {
    System.out.println("Parent2 is dancing");
  }
}


// class Child extends Parent1,Parent2{   // solve

// }

// diamond problem



public class DifferentTypesOfInheritance {
  public static void main(String[] args) {

  }
}
