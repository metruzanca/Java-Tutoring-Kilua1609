class TestCalculator {
  public static void main(String[] args) {
	  /*
	   * Uncomment the code below once Calculator has been created!
	   */
	  
      Calculator calc = new Calculator();
      System.out.println("1 + 2 =" + calc.add(1, 2));
      System.out.println("-1 - 2 =" + calc.sub(-1, 2));
      System.out.println("6 * 3 =" + calc.mul(6, 3));
      System.out.println("8 / 4 =" + calc.div(8, 4));
      System.out.println("Last Result: " + calc.lastResult);
      System.out.println("Number of operations completed: " + calc.operationsCompleted);
  }
}

class Calculator {
  int operationsCompleted;
  double lastResult;

  public Calculator(){
    lastResult = 0;
    operationsCompleted = 0;
  }

  public double add (double addendo1, double addendo2){
    operationsCompleted++;
    lastResult = addendo1 + addendo2;
    return lastResult;
  }

  public double sub (double minuendo, double sottraendo) {
    operationsCompleted++;
    lastResult = minuendo - sottraendo;
    return lastResult;
  }

  public double mul (double moltiplicando, double multiplicatore) {
    operationsCompleted++;
    lastResult = moltiplicando * multiplicatore;
    return lastResult;
  }

  public double div (double dividendo, double divisore) {
    operationsCompleted++;
    lastResult = dividendo / divisore;
    return lastResult;
  }
}
