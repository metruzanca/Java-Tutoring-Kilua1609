class ComplexNum {

  Double re;
  Double im;

    public ComplexNum(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        if (num == this) {
            return true;
        }else return false;
    }

    void add(ComplexNum num) {
        /*
         * Implementare il metodo in modo che venga aggiunto il numero complesso
         * passato in input - Rif. Appendice A1 (slide)
         */
        this.re += num.re;
        this.im += num.im;
    }
    // complex.add(complex2)
    // (3i + 4) + (2i + 5) = 5i + 9

    @Override
    public String toString() {
        /*
         * Implementare il metodo in modo che restituisca una rappresentazione
         * testuale del numero complesso
         */
        if(im == 0) {
            return re.toString();
        }

        if(re == 0) {
            return im + "i";
        }

        if(re < 0) {
            return im + "i" + re;
        }
        return im + "i+" + re;
    }
}
