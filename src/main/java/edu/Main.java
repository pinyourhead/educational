package edu;

public class Main {
  public static void main(String[] args) {

    Box box = new Box(); //10x10x10

    Box box1 = new Box(20); //20x20x20

    Box box2 = new Box(10,10,30); //10x10x30

    double testDensity = 6.3;

    System.out.println(
//        box2.getWeight(testDensity)
        box2.getWeight(6.3)
    );

    System.out.println(
        Box.getWeight(box2, testDensity)
    );
  }
}


/*
        [
            -----------------internal fields----------
            this
            super
            -----------------fields-------------------
            width
            height
            length
            ------------------------------------------
        ]
*/
