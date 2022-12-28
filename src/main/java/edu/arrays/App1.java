package edu.arrays;

import java.util.Arrays;
import java.util.Random;

public class App1 {

  static int[] a; //define array, default value = null

  public static void main(String[] args) {
    int[] x; //define variable, no default value
    x = new int[10]; // init variable
    int[] y = new int[10]; //define and init
    int[] z = {1,2,3,4,5}; //define and init

//    System.out.println(x[0]);
//    x[0] = 15;
//    System.out.println(x[0]);

//    forLoop();
//    twoDim();
    shreddedArrays();
  }

  static void forLoop(){
    int[] x = new int[20];
    System.out.println(Arrays.toString(x));
    for (int i = 0; i < x.length; i++) {
      x[i] = (int)(Math.random()*10);
    }
    System.out.println(Arrays.toString(x));

    for (int i = 0; i < x.length; i++) {
      if(x[i]%3 == 0) {
        System.out.print(x[i] +" ");
      }
    }
    System.out.println();

    for (int i = 0; i < x.length; i++) {
      if(x[i]%5 == 0 && x[i] != 0) {
        System.out.println("first index = " + i);
        System.out.println("x[i] = " + x[i]);
        break;
      }
    }

    int summ = 0;
//    for (int i = 0; i < x.length; i++) {
//      summ = summ + x[i];
//    }

    for (int i : x) {
      summ = summ + i;
    }

    System.out.println("summ = " + summ);

  }

  static void twoDim() {
    int[][] x = {
        {1,2,3,4,5,6,7},
        {2,3,4,5,6,7,8},
        {2,3,4,5,6,7,8}
    };

    for(int i = 0; i < x.length; i++) {
      //print inner array
      for(int j = 0; j < x[i].length; j++) {
        System.out.print(x[i][j] + " ");
      }
      System.out.println();
    }

  }

  static void shreddedArrays() {
    int[][] x = {
        {1,2,3},
        {1,2,3,4,5,6},
        {5,6},
        null,
        {1,1,1,1,1,1,1,1,1,1}
    };

    int[][] y = new int[4][];
    for (int i = 0; i < y.length; i++) {
      y[i] = new int[new Random().nextInt(10)];
    }
    print2D(y);
  }

  static void print2D(int[][] x) {
    for(int[] i : x) {
      for(int j : i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

/*

              [[],[],[],[],[]]
numeration =>  1  2  3  4  5
indexation =>  0  1  2  3  4

int[][]

[0] =>  {[],[],[]}
[1] =>  {[],[],[]}
[2] =>  {[],[],[]}


 */

}
