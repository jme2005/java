package com.edvinsson;
import java.lang.Math;
/**
 * Created by edvinj on 3/19/16.
 */
public class LinAlg {

    public static double[] linear(double[] vector1, double[] vector2){
        double[] output = new double[vector1.length];
        if(vector1.length != vector2.length){
            throw new RuntimeException("Illegal vector dimensions.");
        }else{
            for(int i =0; i < vector1.length; i++){
                output[i] = vector1[i] + vector2[i];
            }
        }
        return output;
    }
    public static double[] tanh(double[] vector){
        double[] output = new double[vector.length];
        int i = 0;
        for(double d : vector){
            output[i] = tanh(d);
            i++;
        }
        return output;
    }

    public static double tanh(double x){
        return (Math.exp(x)-Math.exp(-x))/(Math.exp(x)+Math.exp(-x));
    }
}
