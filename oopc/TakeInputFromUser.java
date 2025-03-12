package oopc;

import java.util.*;

public class TakeInputFromUser {

  public static void main(String[] args) {

    // int a = 12; // static type

    // stream // sequence of data

    Scanner sc = new Scanner(System.in);


    int num = sc.nextInt(); // compiler will wait for user input
    System.out.println(num);

    float f = sc.nextFloat();  // "\n"
    System.out.println(f);

    sc.nextLine(); // consume the leftover "\n" from the previous nextFloat()

    String name = sc.nextLine();
    System.out.println(name);

    sc.close(); // clean the scanner object from the memory // memory leak

    // String data =  sc.nextLine(); // for character
    // if(data.length()>1){

    // }


  }

}
