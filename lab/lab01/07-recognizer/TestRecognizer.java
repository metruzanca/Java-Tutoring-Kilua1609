class TestRecognizer {
     public static void main(String args[]) {
          /*
          * 1) Creare un oggetto della classe Recognizer
          *
          * 2) Realizzare i metodi check1, check2, check3 e check4, che accettano
          * in ingresso un intero, restituendo true soltanto se il valore passato
          * e uguale rispettivamente a 1, 2, 3, 4
          *
          * 3) Invocare i metodi check1, check2, ... passando in input una
          * sequenza corretta e stampando in output il valore di ritorno relativo
          * all'invocazione di ciascun metodo - far precedere l'invocazione di
          * ogni metodo check dall'invocazione di nextExpectedInt
          *
          * 4) Invocare il metodo reset al termine del test su ogni sequenza
          *
          * 5) Testare il riconoscimento per le seguenti sequenze con
          * procedimento analogo a quello appena descritto - 1,2,3,4,1,2 -
          * 1,2,3,4,5 - 1,2,3,4,5,2,3 - ...
          *
          * ESEMPIO DI INVOCAZIONE: riconoscimento sequenza 1,2,3,4,5
          * System.out.println("Next expected int is: " +
          * recognizer.nextExpectedInt());
          *
          * System.out.println("Now the result of the check is: " +
          * recognizer.check1(1)); System.out.println("Next expected int is: " +
          * recognizer.nextExpectedInt());
          *
          * System.out.println("Now the result of the check is: " +
          * recognizer.check2(2)); System.out.println("Next expected int is: " +
          * recognizer.nextExpectedInt());
          *
          * System.out.println("Now the result of the check is: " +
          * recognizer.check3(3)); System.out.println("Next expected int is: " +
          * recognizer.nextExpectedInt());
          *
          * System.out.println("Now the result of the check is: " +
          * recognizer.check4(4)); System.out.println("Next expected int is: " +
          *
          * System.out.println("Now the result of the check is: " +
          * recognizer.check1(5));
          *
          */
          int[] sequence1 = new int[] {1,2,3,4,1,2,5};
           //int[] sequence2 = new int[] {1,2,3,4};
          //int[] sequence3 = new int[] {1,2,3,4,5,2,3};

          Recognizer rec = new Recognizer(sequence1);

          /*
               0 % 4 = 0 + 1 = 1
               1 % 4 = 1 + 1 = 2
               2 % 4 = 2 + 1 = 3
               3 % 4 = 3 + 1 = 4
               4 % 4 = 0 + 1 = 1
               5 % 4 = 1 + 1 = 2
          */

          int[] repeatedSequence = new int[] {1,2,3,4};

          for(int i = 0; i < sequence1.length; i++){
               int value = i % repeatedSequence.length + 1;
               System.out.println("expected value: " + rec.nextInSequence() + "result: " + rec.check(value));
          }
     }
}

class Recognizer {
     private int[] sequence;
     private int position;

     public Recognizer(int[] sequence){
          this.sequence = sequence;
          position = 0;
     }

     /** Restituisce il prossimo intero atteso nella sequenza */
     public int nextInSequence(){
          return sequence[position];
     }

     /** Resetta lo stato corrente del riconoscitore */
     public void reset(){
          position = 0;
     }

     public boolean check(int value) {
          if(nextInSequence() == value) {
               position++;
               return true;
          }
          return false;
     }
}