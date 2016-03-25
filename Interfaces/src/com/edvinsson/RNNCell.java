package com.edvinsson;

/**
 * Created by edvinj on 3/19/16.
 */
public interface RNNCell {

    public int inputSize();

    public int outputSize();

    public int stateSize();

    public double[] zeroState();

    public double[] call(double[] input, double[] state);

}
