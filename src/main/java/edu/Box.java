package edu;

public class Box {

  int height;
  int width;
  int length;

  int volume;

  /**
   * Creates new box with default values (cubic box 10x10x10)
   */
  public Box() {
    height = 10;
    width = 10;
    length = 10;
    volume = width * length * height;
  }

  /**
   * Creates new cubic box with specific values (cubic box VxVxV)
   * @param value the value which used to be assigned to all measurements
   */
  public Box(int value) {
    height = value;
    width = value;
    length = value;
    volume = width * length * height;
  }

  public Box(int height, int width, int length) {
    this.height = height;
    this.width = width;
    this.length = length;
    volume = width * length * height;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public int getLength() {
    return length;
  }

  public int getVolume() {
    return volume;
  }

  public double getWeight(double density) {
    return ((double) volume) * density;
  }

  public static double getWeight(double volume, double density) {
    return volume * density;
  }

  public static double getWeight(Box box, double density) {
    return box.volume * density;
  }

}
