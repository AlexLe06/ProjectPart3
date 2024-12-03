package org.example;
import java.util.Arrays;
import java.util.Scanner;

//Created class Average
public class Average {
    //Date fields
    private int[] data = new int[5]; //Array with 5 elements
    private double mean;

    //Created constructor Average
    public Average(){
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < data.length; i++){
            System.out.printf("Enter score %d: " ,i+1);
            int score = userInput.nextInt();

            data[i] = score;
        }
    }

    //Methods that calculates average
    public void calculateMean(){
        double sum = 0;
        for (int i = 0; i < data.length; i++){
            sum += data[i]; //Adds every element after the loop
        }
        mean = (sum/data.length);
    }
    public String toString() {
        return String.format("%d, %d, %d, %d, %d, %.2f" ,
                data[0],data[1],data[2],data[3],data[4], mean);
    }

    //Method that sorts the Array
    public void selectionSort(){
        Arrays.sort(data); //Sorts array in ascending order

        //Loop that sorts array to descending order
        for (int i = 0; i < data.length / 2; i++) {
            int t = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = t;
        }
    }

}
