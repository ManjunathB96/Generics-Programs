package com.bridgelabz.gnerics.UC.Maximum;

public class StringMaxUC3 {
    public static class MaximumTest<T extends Comparable<T>> {
        T x, y, z;

        public MaximumTest(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public T maximum() {
            return (T) com.bridgelabz.gnerics.UC.Maximum.MaximumTest.maximum(x, y, z);
        }

        //determine the largest of three comparable objects
        public static String testMaximum(String x, String y, String z) {
            String max = x;
            if (y.compareTo(max) > 0) {
                max = y;
            }
            if (z.compareTo(max) > 0) {
                max = z;
            }
            printMax(x, y, z, max);
            return max;
        }

        private static <T extends Comparable<T>> void printMax(T x, T y, T z, T max) {
            System.out.printf("Max of %s,%s and %s is %s\n", x, y, z, max);
        }

        public static void main(String[] args) {
            String xStr = "Manjunath", yStr = "Sadashiv", zStr = "Belagavi";

            System.out.println();
            System.out.println("Given Three String value  Maximum is");   //UC 3: Maximum among String values
            new com.bridgelabz.gnerics.UC.Maximum.MaximumTest(xStr,yStr,zStr).maximum();
        }
    }
}
