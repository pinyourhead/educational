package edu.l1;

import java.util.Scanner;

public class Main {

  static String[] names = {"vasia", "petia", "kolia"};
  static String[][] example = new String[3][4]; // равномерный массив 3 массива по 4 эл-та
  static String[][] example2 = new String [3][];
  static String[][] example3 ;
  static String[][] example4 = {{"a"}, {"a", "b"}, {"c"}, {}} ;

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean exit = false;
    while(!exit) {
      System.out.println("1 - Say hello");
      System.out.println("2 - Say goodbye");
      System.out.println("3 - Exit");
      System.out.println("Select operation");
      int choise = readInput();

      switch (choise) {
        case 1: sayHello(); break;
        case 2: sayGoodbye(); break;
        case 3: exit = true; break;
        default:
          exit = true;
          System.out.println("unknown operation, bye");
      }

    }

  }

  static void sayHello() {
//    System.out.println("inside sayHello");
    String name = chooseName();
    System.out.println("Hello " + name);
  }

  static void sayGoodbye() {
//    System.out.println("inside sayGoodbye");
    String name = chooseName();
    System.out.println("Goodbye " + name);
  }

  static int readInput() {
    return scanner.nextInt();
  }

  static String chooseName() {
    printNames();
    System.out.println("Select name");
    int choise = readInput();
    return names[choise-1];
  }

  static void printNames() {
    int i = 0;
    for(String name : names) {
      System.out.println(
          String.format("%d - %s", ++i, name)
      );
    }
  }


}
