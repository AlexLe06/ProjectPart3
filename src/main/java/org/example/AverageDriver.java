package org.example;

public class AverageDriver {
    public static void main(String[] args) {
        Average avg = new Average(); //Creates new average object
        avg.calculateMean(); //Calls method with constructor
        avg.selectionSort(); //Calls method with constructor
        System.out.println(avg); //Prints object
    }
}

