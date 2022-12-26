package edu.types;

public class Main {

  public static void main(String[] args) {
    int someVariable; //define variable
    int var2 = 10; //define + init

    int i = 0;

    for (; i < 10; i++) {

    }

    for (; i < 10; i++) {

    }

    {
      int x = 0;
      {
        int y=10;
      }
      int y =10;
    }
    int x = 0;

  }

  static void someMethod() {
    byte b = 100;
    int x = b;
    b = (byte)200;
    System.out.println(100);
    System.out.println(200.200);
    System.out.println("200.200");
    System.out.println('2');
    System.out.println(true);
  }


}
