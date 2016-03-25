package com.edvinsson;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] vector1 = {1.0, 0.0, 1.0};
        double[] vector2 = {0.0, -1.0, -1.0};
        double[] vector3 = LinAlg.linear(vector1, vector2);
        for (double d : vector3) {
            System.out.println(d);
        }
        System.out.println(LinAlg.tanh(-1.0));
        System.out.println(LinAlg.tanh(1.0));
        System.out.println(LinAlg.tanh(0));
        vector3 = LinAlg.tanh(vector3);
        for (double d : vector3) {
            System.out.println(d);
        }
    }
}
