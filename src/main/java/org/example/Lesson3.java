package org.example;

public class Lesson3 {


    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
        System.out.println(makeBricks(3, 10, 8));
        System.out.println(makeBricks(2, 10, 8));
        System.out.println(makeBricks(12, 0, 11));
    }


    public static boolean makeBricks(int small, int big, int goal) {
        int totalLength = small + big * 5;
        if (totalLength < goal) {
            return false;
        } else if (small >= goal || goal % 5 <= small) {
            return true;
        } else {
            return false;
        }

    }
}
