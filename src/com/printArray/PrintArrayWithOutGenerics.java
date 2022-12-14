package com.printArray;

public class PrintArrayWithOutGenerics {

    //Compile Time Polymorphism
    //Method Overloading : same method name but different parameters
    public static void toPrint(Integer[] inputArray) {
        for (int element : inputArray) {
            System.out.printf("%s", element);

        }
        System.out.println();
    }

    //Method Overloading
    public static void toPrint(Double[] inputArray) {
        for (double element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    //Method Overloading
    public static void toPrint(Character[] inputArray) {
        for (char element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    //Method Overloading
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

       PrintArrayWithOutGenerics.toPrint(integers);                // toPrint(integers);
        PrintArrayWithOutGenerics.toPrint(doubles);                //toPrint(doubles);
        PrintArrayWithOutGenerics.toPrint(characters);            //toPrint(characters);
        PrintArrayWithOutGenerics.toPrint(strings);               // toPrint(strings);


    }
}
