package oop.lab02.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkWithArrays {

    /*
    * ADVICE:
    * If your method implements an algorithm, it doesn't necessarly need to contain
    * the whole code! You can decomopose your problem into simpler (non-trivial) ones,
    * writing a *private* utility method for each sub problem.
    * Moreover, if your utility method solves a common sub-problem, it may be
    * re-used by other methods within the same class.
    */


    public static int countOccurrencies(final int[] array, final int elem) {
        int nOccur = 0;
        for (final int currElem : array) {
            if (currElem == elem) {
                nOccur++;
            }
        }
        return nOccur;
    }

    // 1,2,3 -> [2]
    // 2,3,4 -> [2,4]

    public static Integer[] evenElements(final int[] array) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0)
                even.add(array[i]);
        }
        return even.toArray(new Integer[even.size()]);
    }

    public static Integer[] oddElements(final int[] array) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 1)
                odd.add(array[i]);
        }
        return odd.toArray(new Integer[odd.size()]);
    }

    public static int mostRecurringElement(final int[] array) {
        ArrayList<Integer> counters = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            counters.set(value, counters.get(value) + 1);
        }
        int max = 0;
        for (int i = 0; i < counters.size(); i++) {
            if (counters.get(i) > max) {
                max = counters.get(i);
            }
        }
        return max;     
    }

    /*
     * Testing methods
     */

    public static boolean expects(int actual, int expected){
        if(actual != expected){
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
        return actual == expected;
    }

    public static boolean testCountOccurrencies() {
        return expects(countOccurrencies(new int[] { 1, 2, 3, 4 }, 1), 1)
                && expects(countOccurrencies(new int[] { 0, 2, 3, 4 }, 1), 0)
                && expects(countOccurrencies(new int[] { 7, 4, 1, 9, 3, 1, 5 }, 2), 0)
                && expects(countOccurrencies(new int[] { 1, 2, 1, 3, 4, 1 }, 1), 3)
                && expects(countOccurrencies(new int[] {7, 1, 5, 6, 1, 3}, 1), 2);
    }

    public static boolean testEvenElements() {
        return Arrays.equals(
                        evenElements(new int[] { 1, 2, 3, 4 }),
                        new Integer[] { 1, 3 })
                && Arrays.equals(
                        evenElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                        new Integer[] { 1, 3, 5, 7, 9 })
                && Arrays.equals(
                        evenElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }),
                        new Integer[] { 4, 7, 1, 23, 73 })
                && Arrays.equals(
                        evenElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                        new Integer[] { 7, 1, 12, 23, 54 });
    }

    public static boolean testOddElements() {
        return Arrays.equals(oddElements(new int[] { 1, 2, 3, 4 }),
                new Integer[] { 2, 4 })
                && Arrays.equals(
                        oddElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                        new Integer[] { 2, 4, 6, 8 })
                && Arrays.equals(
                        oddElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }),
                        new Integer[] { 6, 9, 5, 11 })
                && Arrays.equals(
                        oddElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                        new Integer[] { 5, 24, 46, 11, 81 });
    }

    public static boolean testMostRecurringElement() {
        return mostRecurringElement(new int[] { 1, 2, 1, 3, 4 }) == 1
                && mostRecurringElement(new int[] { 7, 1, 5, 7, 7, 9 }) == 7
                && mostRecurringElement(new int[] { 1, 2, 3, 1, 2, 3, 3 }) == 3
                && mostRecurringElement(new int[] { 5, 11, 2, 11, 7, 11 }) == 11;
    }

    public static void main(final String[] args) {
        System.out.println("testCountOccurrencies: " + testCountOccurrencies());
        System.out.println("testEvenElems: " + testEvenElements());
        System.out.println("testOddElems: " + testOddElements());
        System.out.println("testGetMostRecurringElem: " + testMostRecurringElement());
    }
}
