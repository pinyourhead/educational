package edu.arrays;

public class ArrayUtil {

  public static void main(String[] args) {
    rotate();
  }

  static void rotate() {
    int[][] sourceArray = {// we define source square array with NxN dimensions
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

//    {
//      {7,4,1},
//      {8,5,2},
//      {9,6,3},
//    }

    // here we printing source array
    System.out.println("Source array");
    print2D(sourceArray);
    System.out.println("/////////////");

    //define result array, which will be rotated clockwise source array
    int[][] resultArray = new int[sourceArray.length][sourceArray.length];

    for (int i = 0; i < sourceArray.length; i++) {// for each row (subarray) in source array
      for (int j = 0; j < sourceArray[i].length; j++) { // for every cell in source array
        int k = j; // we define row (subarray index) for result array row, which equal to source subarray cell index
        int m = sourceArray[i].length - 1 - i; //we calculate result array subarray cell index
        resultArray[k][m] = sourceArray[i][j];// we put source array cell into specific result array cell
      }
      print2D(resultArray);// intermediate result printing? each row transformed to column
      System.out.println("/////////////");
    }
    //result array output
    System.out.println("result");
    print2D(resultArray);

  }

  //additional function which print 2d array
  static void print2D(int[][] array) {
    for (int i = 0; i < array.length; i++) {//for each row in array
      for (int j = 0; j < array[i].length; j++) {//for each cell in row
        System.out.print(array[i][j] + " ");//print cell value + space
      }
      System.out.println();// print empty line and move to the new line
    }
  }

}
