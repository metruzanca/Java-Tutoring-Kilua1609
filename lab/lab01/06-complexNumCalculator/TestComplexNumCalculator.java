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
    }
}

class CompleNumeCalculator {
    int operationsCompleted;
    Double lastResultReale;
    Double lastResultImmginario;
    Double reale1;
    Double immaginario1;
    Double real2;
    Double immaginario2;

    public void CalculatorVariables () {
        operationsCompleted = 0;
        lastResultReale = 0.0;
        lastResultImmginario = 0.0;
    }

    public void ComplexNumber(Double reale1, Double reale2 Double immaginario1, Double immaginario2) {
        this.reale1 = reale1;
        this.immaginario1 = immaginario1;
        this.real2 = reale2;
        this.immaginario2 = immaginario2;
    }

    public Double complexAdd (Double reale1, Double reale2, Double immaginario1, Double immaginario2) {
        operationsCompleted++;
        lastResultReale = reale1 + reale2;
        lastResultImmginario = immaginario1 + immaginario2;
    }

    public Double complexSub (Double reale1, Double reale2, Double immaginario1, Double immaginario2) {
        operationsCompleted++;
        lastResultReale = reale1 - reale2;
        lastResultImmginario = immaginario1 - immaginario2;
    }






}
