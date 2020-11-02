public class Loops {

  public static void main(String[] args) {
    int[] arr = getArrayV2(10);
    for (int value : arr) {
      System.out.println(value);
    }
    // 0 1 2 3 4 5 6 7 8 9 10

    String[] fruits = new String[] { "banana", "pear", "apple", "kiwi", null };
    printFruitsV2(fruits);
    // banana pear apple kiwi
  }

  /**
   * Method returns array from 0 to endRange
   * 
   * @param endRange inclusive value ending the range
   * @return array of integers of a range of numbers
   */
  public static int[] getArray(int endRange) {
    int[] returnArray = new int[endRange + 1];
    int i = 0;

    do {
      returnArray[i] = i;
      i++;
    } while (i <= endRange);

    return returnArray;
  }

  public static int[] getArrayV2(int endRange) {
    int[] returnArray = new int[endRange + 1];

    for (int i = 0; i <= endRange; i++) {
      returnArray[i] = i;
    }

    return returnArray;
  }

  /**
   * Loop thru and print all fruits
   * 
   * @param fruits fruits to print
   */
  public static void printFruits(String[] fruits) {
    for (int j = 0; j < fruits.length; j++) {
      System.out.println(fruits[j]);
    }
  }

  public static void printFruitsV2(String[] fruits) {
    for (String fruitElement : fruits) {
      System.out.println(fruitElement);
    }
  }
}
