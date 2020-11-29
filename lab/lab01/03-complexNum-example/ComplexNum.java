import java.text.DecimalFormat;

class ComplexNum {
    Double re;
    Double im;

    public ComplexNum(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        return num.re.equals(re) && num.im.equals(im);
    }

    void add(ComplexNum num) {
        /*
         * Implementare il metodo in modo che venga aggiunto il numero complesso
         * passato in input - Rif. Appendice A1 (slide)
         */
        this.re += num.re;
        this.im += num.im;
    }

    void sub(ComplexNum num) {
        this.re -= num.re;
        this.im -= num.im;
    }

    void mol(ComplexNum num){
        Double a = this.re;
        Double b = this.im;
        Double c = num.re;
        Double d = num.im;
        
        this.re = a*c - b*d;
        this.im = a*d + b*c;
    }

    void div(ComplexNum num) {
        Double a = this.re;
        Double b = this.im;
        Double c = num.re;
        Double d = num.im;

        this.re = (a*c + b*d) / (c*c + d*d);
        this.im = (b*c - a*d) / (c*c + d*d);
    }

    /*
      (a + bi)(c+di)
    = ac + adi + bic - bd
    = (ac -bd) + (ad + bc)i
    */

    // complex.add(complex2)
    // (3i + 4) + (2i + 5) = 5i + 9

    @Override
    public String toString() {
        
        DecimalFormat df = new DecimalFormat("###.#");
        /*
         * Implementare il metodo in modo che restituisca una rappresentazione testuale
         * del numero complesso
         */

        String real = df.format(re);
        String immaginary = df.format(im);

        if(im == 0) {
            return real;
        }

        if(re == 0) {
            return immaginary + "i";
        }

        if(im < 0) {
            return real +  immaginary + "i";
        }
        return real + "+" + immaginary + "i";
    }
}
