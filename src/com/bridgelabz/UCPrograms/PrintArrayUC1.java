package com.bridgelabz.UCPrograms;

public class PrintArrayUC1 {
    public static void toPrint(Integer[] inputArray) {
        for (int element : inputArray) {
            System.out.printf("%s", element);

        }
        System.out.println();
    }

    public static void toPrint(Double[] inputArray) {
        for (double element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void toPrint(Character[] inputArray) {
        for (char element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void toPrint(String[] inputarray) {
        for (String element : inputarray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {5.6, 8.9, 4.7, 6.1} ;
        Character[] characters ={'@', '$', '*'};
        String[] strings = {"Manjunath S Belagavi"} ;

        com.bridgelabz.UCPrograms.PrintArrayUC1.toPrint(integers);
        com.bridgelabz.UCPrograms.PrintArrayUC1.toPrint(doubles);
        com.bridgelabz.UCPrograms.PrintArrayUC1.toPrint(characters);
        com.bridgelabz.UCPrograms.PrintArrayUC1.toPrint(strings);
    }
}
