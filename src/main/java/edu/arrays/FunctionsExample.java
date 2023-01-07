package edu.arrays;

import java.util.Scanner;

public class FunctionsExample {
  //create calculator app which allow us to perform simple math operations on two integer values
  //steps/operations list
  //print menu
  //read selected menu item number
  //process selected menu item
  // - read first number
  // - read second number
  // - perform selected item
  // - show result

  public static void main(String[] args) {
    //we start infinite loop, that will work until we manually exit
    while(true) {
      //print menu
      printMenu();
      //request user for selected operation number
      int selection = readMenuSelection();
      //check if operation number == 0 to exit program execution
      if (selection == 0) {
        // manually break infinite loop and exit
        break;
      }
      // start operation selection processing
      processSelection(selection);
    }
  }

  //this method used to print menu
  static void printMenu() {
    String[] menuItems = new String[] {
        "Choose operation",
        "1 - sum (+)",
        "2 - diff (-)",
        "3 - div (/)",
        "4 - mult (*)",
        "0 - to exit"
    };
    for(String item : menuItems) {
      System.out.println(item);
    }
  }

  //read menu item (item number) selection, integer value from console
  static int readMenuSelection() {
    Scanner scanner = new Scanner(System.in);
    int selectedItem = scanner.nextInt();
    return selectedItem;
  }

  //read double value from console
  static double readDoubleValue() {
    Scanner scanner = new Scanner(System.in);
    double value = scanner.nextDouble();
    return value;
  }

  //this method process selected operation by it number
  static void processSelection(int selection) {
    //request operands for arithmetic operation
    System.out.println("enter left operand");
    double left = readDoubleValue();
    System.out.println("enter right operand");
    double right = readDoubleValue();

    //according to selection value we choose operation to perform and output result
    switch (selection) {
      case 1:
        System.out.println("a + b = " + (left + right));
        break;//sum
      case 2: System.out.println("a - b = " + (left - right));
        break;//diff
      case 3: System.out.println("a / b = " + (left / right));
        break;//div
      case 4: System.out.println("a * b = " + (left * right));
        break;//mult
      default:
        System.out.println("Incorrect operation code");
    }
  }
}
