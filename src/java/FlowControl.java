public class FlowControl {
  public static void main(String[] args) {
    int[] lista = new int[5];
    lista[0] = 1;
    lista[1] = 5;
    lista[2] = 7;
    lista[3] = 3;
    lista[4] = 9;
    
    printAll(lista);

  }

  public static void printAll(int[] listoni) {          /*questa è definita come la signature del metodo*/
    
    int count = 0;

    while(count != listoni.length) {
      System.out.println(listoni[0]);
      System.out.println(listoni[1]);
      System.out.println(listoni[2]);
      System.out.println(listoni[3]);
      System.out.println(listoni[4]);
      count++;
    }    
    
    
    return ;
  }

  public static int getMax(int[] list) {

    return 0;
  }

  public static int getMin(int[] list) {

    return 0;
  }

}
