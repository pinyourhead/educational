package edu.arrays;

import java.util.Random;

public class Functions {

  public static void main(String[] args) {
    System.out.println(
        2*pow(2,2)
        //2*fn result
        //move to fn
        //2* fn_result (e.g 4)
        //2*4
        //8
    );

    fib(1,1, 200);
    int x = 100500;
    int z =200;
  }

  static int pow(int what, int x) {
    return (int)Math.pow(what, x);
  }

  static void fib(int prev, int curr, int limit) {
    int result = prev+curr;
    if(result > limit) {
      System.out.println(result);
    }else{
      fib(curr, result, limit);
    }
  }

  static void someFn(int x) {
    x = 100;
  }

  static void printFibToLimit(int limit) {
    int x = fnfn(limit);
    System.out.println("random close to limit " +limit + " = ");
  }

  static int fnfn(int limit) {
    return new Random().nextInt(limit);
  }


}
