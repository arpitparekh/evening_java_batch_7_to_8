package oopc;

class Banking {
  String name;
  int accountNumber;
  int balance;

}

public class OOPCExample {

  public static void main(String[] args) {

    Banking b1 = new Banking();
    b1.name = "HDFC";
    b1.accountNumber = 123456789;
    b1.balance = 10000;

    System.out.println(b1.name);
    System.out.println(b1.accountNumber);
    System.out.println(b1.balance);

    System.out.println("-----------------------------");
    Banking b2 = new Banking();
    b2.name = "ICICI";
    b2.accountNumber = 123456789;
    b2.balance = 10000;
    b2.balance = b2.balance + 1000;

    System.out.println(b2.name);
    System.out.println(b2.accountNumber);
    System.out.println(b2.balance);

  }

}
