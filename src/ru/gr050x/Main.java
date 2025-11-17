package ru.gr050x;

public class Main {
    public static void main(String[] args) {
        var m1 = new Matrix(5, 3);
        System.out.println(m1);
        var arr2 = new int[][]{{1, 2}, {3, 4}};
        var m2 = new Matrix(arr2);
        System.out.println(m2);
        arr2[0][1] = 10000;
        System.out.println(m2);
        var arr1 = new int[]{5, 6, 7, 8};
        var m3 = new Matrix(2, 2, arr1);
        System.out.println(m3);
        var m4 = new Matrix(1, 4, arr1);
        System.out.println(m4);
        var m5 = new Matrix(4, 1, arr1);
        System.out.println(m5);

        var arr12 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        var m6 = new Matrix(3, 3, arr12);
        System.out.println(m6.getElem(5));
    }
}
