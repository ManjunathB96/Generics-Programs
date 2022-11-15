package com.printArray;

public class PrintArrayWithGenerics{
    public static <E> void toPrint(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {7.4, 5.9, 1.4, 5.3};
        Character[] charArray = {'M', 'A', 'N', 'J', 'U'};
        String[] stringArray = {"Manjunath","Sdaashiv","Belagavi"};

        PrintArrayWithGenerics.toPrint(intArray);                              //toPrint(intArray);
        PrintArrayWithGenerics.toPrint(doubleArray);
        PrintArrayWithGenerics.toPrint(charArray);
        PrintArrayWithGenerics.toPrint(stringArray);
    }

}
