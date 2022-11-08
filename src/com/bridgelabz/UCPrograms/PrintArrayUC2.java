package com.bridgelabz.UCPrograms;

public class PrintArrayUC2 {
    public static <E> void toPrint(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6};
        Double[] doubleArray = {7.4,5.9,1.4,5.3};
        Character[] charArray = {'M','A','N','J','U'};

        PrintArrayUC2.toPrint(intArray);
        com.bridgelabz.UCPrograms.PrintArrayUC2.toPrint(doubleArray);
        com.bridgelabz.UCPrograms.PrintArrayUC2.toPrint(charArray);
    }

}
