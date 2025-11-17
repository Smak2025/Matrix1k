package ru.gr050x;

import java.util.Arrays;

public class Matrix {
    private final int[][] elem;

    public Matrix(int rows, int cols){
        elem = new int[rows][cols];
    }

    public Matrix(int[][] elem){
        this(elem.length, elem[0].length);
        for (int i = 0; i < elem.length; i++){
            this.elem[i] = Arrays.copyOf(elem[i], elem[i].length);
//            for (int j = 0; j < elem[i].length; j++){
//                this.elem[i][j] = elem[i][j];
//            }
        }
    }

    public Matrix(int rows, int cols, int[] elems){
        //TODO: Исправить!
        this(rows, cols);
        for (int i = 0; i < rows; i++){
            elem[i] = Arrays.copyOfRange(elems, cols*i, cols*(i+1));
        }
    }


    public String toString(){
        var sMatrix = new StringBuilder();
        for (int i = 0; i < elem.length; i++){
            sMatrix.append('[');
            for(int j = 0; j < elem[i].length; j++){
                sMatrix.append(elem[i][j]);
                if (j < elem[i].length - 1) sMatrix.append(' ');
            }
            sMatrix.append("]\n");
        }
        return sMatrix.toString();
    }

    public int rowCount(){
        return elem.length;
    }

    public int colCount(){
        return elem[0].length;
    }

    public int getElem(int i, int j) {
        return elem[i][j];
    }

    public int getElem(int index){
        return elem[index / colCount()][index % colCount()];
    }


}
