package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integers = getIntegers(5);
        printArrays(integers);
        int[] sortedIntegers = sortIntegers(integers);
        printArrays(sortedIntegers);
    }

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        IntStream.range(0, values.length).forEach(i -> values[i] = scanner.nextInt());
        return values;
    }

    public static void printArrays(int[] tab) {
        IntStream.range(0, tab.length).forEach(i -> System.out.println("Element nr " + i + " equals " + tab[i]));
    }

    public static int[] sortIntegers(int[] tab) {
        int[] sortedArray = new int[tab.length];
        System.arraycopy(tab, 0, sortedArray, 0, tab.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
/*
        int counter = tab.length;
        while(counter != 2){
            System.out.println(tab[counter]);
            System.out.println(tab[counter-1]);
           if(tab[counter] < tab[counter-1]){
               int i = tab[counter];
               int j = tab[counter-1];
               tab[counter] = j;
               tab[counter-1] = i;
               System.out.println(counter);
               counter --;
               System.out.println(counter);
           }
           else
               counter--;
        }
*/
    }
}
