package modules;

public class RevertVector {
    public static int[] reverseInt(int[] vector) {
        /*
         * Reads a vector of integers and returns that inverted vector
         * Params:
         * vector: integer vector passed by the call
         */

        int[] reversed_vector = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            reversed_vector[i] = vector[(vector.length - 1) - i];
        }

        return reversed_vector;
    }
}
