package com.bridgelabz.gnerics.UC.Maximum;

public class MaximumTest < T extends Comparable<T>> {
    T x,y,z;
    public MaximumTest(T x, T y, T z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public  T maximum(){
        return MaximumTest.maximum(x,y,z);
    }
        //determine the largest of three comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;                         // assume x is initially the largest
        if (y.compareTo(max) > 0){
            max = y;                        // Y is the largest so far
        }
        if (z.compareTo(max) > 0){
            max = z;                    // z IS THE LARGEST NOW
        }
        printMax(x, y, z, max);
        return max;                     //returns the largest object

    }

    public static String testMaximum(String x,String y,String z){
        String max = x ;
        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        printMax(x,y,z,max);
        return  max;
    }

    private static <T extends Comparable<T>> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
    }

    public static void main(String[] args) {
        Integer xInt = 13, yInt = 4, zInt = 5;

        Float xFl = 6.6f, yFl = 8.8f, zFl = 9.7f;

        String xStr = "Manjunath", yStr = "Sadashiv", zStr = "Belagavi";

      // MaximumTest.testMaximum(xStr,yStr,zStr);

        System.out.println();
        System.out.println("Given Three Integer value  Maximum is");    //UC 1: Maximum among integer values
        new MaximumTest(xInt,yInt,zInt).maximum();

        System.out.println();
        System.out.println("Given Three Float value  Maximum is");    //UC 2: Maximum among float values
        new  MaximumTest(xFl,yFl,zFl).maximum();

        System.out.println();
        System.out.println("Given Three String value  Maximum is");   //UC 3: Maximum among String values
        new  MaximumTest(xStr,yStr,zStr).maximum();
    }
}
