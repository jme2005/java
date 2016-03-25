package com.edvinsson;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] myArray = genRandomArray(50,1000);
        printArray(myArray);
        mergeSort(myArray);
        printArray(myArray);

    }
        public static int[] getIntegers(int num, Scanner scanner){
            int[] output = new int[num];
            System.out.println("Please enter " + num + " numbers\r");
            for (int i = 0; i < output.length; i++) {
                output[i] = scanner.nextInt();
            }
            return output;
        }

        public static void mergeSort(int[] array){
            int len = array.length;
            if (len > 1) {
                int midpoint = len / 2;
                int[] leftside = java.util.Arrays.copyOfRange(array,0,midpoint);
                int[] rightside = java.util.Arrays.copyOfRange(array,midpoint,len);
                mergeSort(leftside);
                mergeSort(rightside);
                int i = 0;
                int j = 0;
                int k = 0;

                while(i < leftside.length && j < rightside.length){
                    if(leftside[i] < rightside[j]){
                        array[k] = leftside[i];
                        i++;
                    }else{
                        array[k] = rightside[j];
                        j++;

                    }
                    k++;
                }


                for(int ii = i; ii < leftside.length; ii++){
                    array[k] = leftside[ii];
                    k++;
                    }
                for(int jj = j; jj < rightside.length; jj++){
                    array[k] = rightside[jj];
                    k++;
                }
                }
            }

        public static void printArray(int[] array){

            for(int i=0; i < array.length; i++){
                if(i < array.length-1) {
                    System.out.print(array[i]+", ");
                }else{
                    System.out.println(array[i]);
                }
            }
            System.out.println("\r");

        }
        public static int[] genRandomArray(int num, int range){
            Random rand = new Random();
            int[] output = new int[num];
            for(int i = 0; i < num; i++){
                output[i] = rand.nextInt(range);
            }
            return output;

        }

        }


