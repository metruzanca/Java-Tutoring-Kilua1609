class CallByValue {

    void increment(Integer a) {
        a++;
    }

    public static void main(final String[] args) {
        Integer x = 1;
        CallByValue cbv = new CallByValue();
        cbv.increment(x);
        System.out.println("x=" + x);
    }
}
