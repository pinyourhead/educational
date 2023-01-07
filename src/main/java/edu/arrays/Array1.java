package edu.arrays;

import java.util.Arrays;
import java.util.Random;

public class Array1 {
  public static void main(String[] args) {
//    arrayWhileLoopExample();
    int[] sourceArray = createArray(10);
    System.out.println(Arrays.toString(sourceArray));
    System.out.println(
        Arrays.toString(
          shift(sourceArray,3)
        )
    );

  }

  static void arrayWhileLoopExample() {
    int[] array = createArray(10);

    int arrayIndex = 0;
    while(arrayIndex < array.length) {
      System.out.print(array[arrayIndex] + " ");
      arrayIndex++;
    }

    System.out.println();
    int length = 100;
    createArray(length);

  }

  static int[] createArray(int length) {
    int[] array = new int[length];
    Random r = new Random();// random numbers generator
    for (int i = 0; i < length; i++) {
      array[i] = r.nextInt(100);// request int value from generator and set it to the array cell
    }
    return array;
  }

//  [1,2,3,4,5,6,7,8] =>2 [0,0,1,2,3,4,5,6]
//  [1,2,3,4,5,6,7,8] <=2 [3,4,5,6,7,8,0,0]
  static int[] shift(int[] source, int shiftNumber){//source array - array to shift, shift number - number of positions
    int[] dest = new int[source.length];
    System.arraycopy(source,0, dest, shiftNumber, source.length-shiftNumber);
    return dest;
  }

  //  [1,2,3,4,5,6,7,8] =>2 [7,8,1,2,3,4,5,6]

}
