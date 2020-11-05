import java.util.Random;

public class MinMax {
  public static void main(String[] args) {
    Integer[] numbersInOrder = fillArray(4);
    System.out.println("In         order:" + formatArrayString(numbersInOrder));

    Integer[] numbersInReverse = reverse(numbersInOrder);

    System.out.println("In         order:" + formatArrayString(numbersInOrder));
    System.out.println("In reverse order:" + formatArrayString(numbersInReverse));
  }

  public static String formatArrayString(Integer[] arr) {
    String s = "";
    for (Integer i : arr) {
      s += i.toString() + " ";
    }
    return s;
  }

  public static Integer getRandomNumberUsingNextInt(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min) + min;
  }

  public static Integer[] fillArray(int cap) {
    Integer[] arr = new Integer[cap];
    for (int i = 0; i < cap; i++) {
      arr[i] = getRandomNumberUsingNextInt(0, 9);
    }
    return arr;
  }

  public static Integer getMax(Integer[] arrayNumeri) {
    for (int i : arrayNumeri) {
      boolean isCurrent = true;
      for (int ii : arrayNumeri) {
        if (i == ii)
          continue;
        if (ii > i) {
          isCurrent = false;
        }
      }
      if (isCurrent) {
        return i;
      }
    }
    return -1;
  }

  public static Integer getMaxV2(Integer[] arrayNumeri) {
    Integer state = null;
    for (int i = 0; i < arrayNumeri.length - 1; i++) {
      state = arrayNumeri[i] > arrayNumeri[i + 1] ? arrayNumeri[i] : arrayNumeri[i + 1];
    }
    return state;
  }

  public static Integer getMin(Integer[] arrayNumeri) {
    Integer status = null;
    for (int i = 0; i < arrayNumeri.length - 1; i++) {
      status = arrayNumeri[i] < arrayNumeri[i + 1] ? arrayNumeri[i] : arrayNumeri[i + 1];
    }
    return status;
  }

  public static Integer[] reverse(Integer[] arrayNumeri) {
    Integer[] newArray = new Integer[arrayNumeri.length];
    for (int i = 0; i < Math.floor(newArray.length / 2); i++) {
      newArray[i] = arrayNumeri[arrayNumeri.length - 1 - i];
      newArray[newArray.length - 1 - i] = arrayNumeri[i];
    }
    return newArray;
  }

  public static int compareNum(int a, int b) {
    if (a < b) {
      return b;
    } else {
      return a;
    }

  }
}
