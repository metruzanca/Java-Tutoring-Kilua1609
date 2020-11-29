class TestComplexNumCalculator {
    public static void main(String[] args) {
        /*
         * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
         *    tra numeri complessi:
         *
         * - add(1+2i, 2+3i) = 3+5i
         *
         * - sub(4+5i, 6+7i) = -2-2i
         *
         * - mul(8+2i, 3-i) = 26 - 2i
         *
         * - ... altre a piacere
         *
         * 2) Verificare il corretto valore dei campi nOpDone, lastRes
         *
         * 3) Fare altre prove con operazioni a piacere
         */
        CompleNumeCalculator calc = new CompleNumeCalculator();
        ComplexNum n1 = new ComplexNum(1, 2);
        ComplexNum n2 = new ComplexNum(10, 20);
        ComplexNum n3 = new ComplexNum(5, 5);
        ComplexNum r1 = calc.add(n1, n2);
        ComplexNum r2 = calc.sub(r1, n3);
        System.out.println(r1);
        System.out.println(r2);

        ComplexNum m1 = new ComplexNum(2, 5);
        ComplexNum m2 = new ComplexNum(4, -3);
        ComplexNum r3 = calc.mul(m1, m2);
        System.out.println(r3);
        ComplexNum r4 = calc.div(r3, m2);
        System.out.println(r4);
    }
}

class CompleNumeCalculator {
  int operationsCompleted;
  ComplexNum lastResult;

    public CompleNumeCalculator(){
        lastResult = null;
        operationsCompleted = 0;
    }

    public ComplexNum add(ComplexNum addendo1, ComplexNum addendo2){
        operationsCompleted++;
        ComplexNum result = new ComplexNum(0, 0);
        result.add(addendo1);
        result.add(addendo2);
        lastResult = result;
        return result;
    }

    public ComplexNum sub(ComplexNum minuendo, ComplexNum sottraendo) {
        operationsCompleted++;
        ComplexNum result = new ComplexNum(0, 0);
        result.add(minuendo);
        result.sub(sottraendo);
        lastResult = result;
        return result;
    }

  public ComplexNum mul (ComplexNum moltiplicando, ComplexNum multiplicatore) {
    operationsCompleted++;
    ComplexNum result = new ComplexNum(0, 0);
    result.add(moltiplicando);
    result.mol(multiplicatore);
    lastResult = result;
    return result;
  }

  public ComplexNum div (ComplexNum dividendo, ComplexNum divisore) {
    operationsCompleted++;
    ComplexNum result = new ComplexNum(0, 0);
    result.add(dividendo);
    result.div(divisore);
    lastResult = result;
    return result;
  }
}