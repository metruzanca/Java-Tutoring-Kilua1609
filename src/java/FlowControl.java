import java.util.ArrayList;

public class FlowControl {
  public static void main(String[] args) {
    // int[] lista = new int[5];
    // lista[0] = 1;
    // lista[1] = 2;
    // lista[2] = 3;
    // lista[3] = 4;
    // lista[4] = 5;

    // Non toccare questa parte del main
    int[][] listaDiListe = new int[][] { { 1, 2, 3, 4, 5 }, { 20, 5, -2, 0, 21 } };
    for (int[] lista : listaDiListe) {
      int max = getMax(lista);
      System.out.println(max);
    }
  }

  // Per metru
  // TODO break;
  // TODO continue;
  // TODO exercise with while, do while and for

  public static ArrayList<Integer> multiplesOf2(Integer[] list) {
    ArrayList<Integer> response = new ArrayList<Integer>();
    for (int item : list) {
      if (item % 2 == 0) {
        response.add(item);
      }
    }
    return response;
  }

  // TODO
  // public static int[][] generateMatrix() {

  // }

  /* questa è definita come la signature del metodo */
  public static void printAll(int[] listoni) {
    // System.out.println("---- While ----");
    // int i = 0;
    // do {
    // System.out.println(listoni[i]);
    // i++;
    // } while (i < listoni.length);

    // System.out.println("---- Do While ----");

    // int ii = 0;
    // while (ii < listoni.length) {
    // System.out.println(listoni[ii]);
    // ii++;
    // }

    // System.out.println("---- For ----");

    // // For (definizione contatore; condizione di loop; incremento)
    // for (int iii = 0; iii < listoni.length; iii++) {
    // System.out.println(listoni[iii]);
    // }

    // for (int iii = listoni.length - 1; iii > 0; iii--) {
    // System.out.println(listoni[iii]);
    // }

    // System.out.println("---- For-Each ----");

    for (int item : listoni) {
      System.out.println(item);
    }

  }

  // public static int[] fillRange(int min, int max) {
  // int[] list;

  // return list;
  // }

  // public static int[] reverse(int[] list) {
  // int[] invertedList;

  // return invertedList;
  // }

  public static int getMax(int[] list) {
    return 10;
  }

  // public static int getMin(int[] list) {

  // }

}
