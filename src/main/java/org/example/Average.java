package org.example;
import java.util.Scanner;

public class Average {
    private int[] data = new int[5];
    private double mean;

    public Average(){
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < data.length; i++){
            System.out.printf("Enter score %d: " ,i+1);
            int score = userInput.nextInt();

            data[i] = score;
        }
    }
    public void calculateMean(){
        double sum = 0;
        for (int i = 0; i < data.length; i++){
            sum += data[i];
        }
        mean = (sum/data.length);
    }
    public String toString() {

        return String.format("%d, %d, %d, %d, %d, %f" ,
                data[0],data[1],data[2],data[3],data[4], mean);
    }

//    public void selectionSort(){
//        for (int score : data){
//            if score
//        }
//    }

}
