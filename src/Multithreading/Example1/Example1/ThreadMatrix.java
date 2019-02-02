package Multithreading.Example1.Example1;

import MatrixWork.Matrix;

public class ThreadMatrix extends Thread {
    Integer row, column, number;

    public  ThreadMatrix(Integer row, Integer column, Integer number)
    {
        this.row = row;
        this.column = column;
        this.number  = number;
    }

    public void run()
    {
        for (int i=0; i<number; i++)
        {
            Thread matrixthread = new Thread(this::threadMatrix);
            matrixthread.run();
            System.out.println("Thread of matrix stop");
        }
    }

    void threadMatrix()
    {
        Matrix matrix = new Matrix(column, row);
        matrix.AddMatrix();
    }




}
