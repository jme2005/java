package com.edvinsson;

/**
 * Created by edvinj on 3/19/16.
 */
public class BasicRNNCell implements RNNCell {

    private int numUnits;

    public BasicRNNCell(int numUnits) {
        this.numUnits = numUnits;
    }

    @Override
    public int inputSize() {
        return this.numUnits;
    }

    @Override
    public int outputSize() {
        return this.numUnits;
    }

    @Override
    public int stateSize() {
        return this.numUnits;
    }

    @Override
    public double[] zeroState() {
        return new double[this.numUnits];
    }

    @Override
    public double[] call(double[] input, double[] state) {
        return new double[0];
    }
}
