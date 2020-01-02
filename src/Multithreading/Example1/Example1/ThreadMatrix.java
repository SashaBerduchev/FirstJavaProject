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
        Thread[] threads = new Thread[this.number];
        for (int i=0; i<number; i++)
        {
            Thread matrixthread = new Thread(this::threadMatrix);
            threads[i] = matrixthread;
            System.out.println("Thread of matrix run");
        }

        for (int j=0; j < threads.length; j++){
            threads[j].start();
            System.out.println("START");
        }
    }

   private void threadMatrix()
    {
        for (int i=0; i<number; i++) {
            Matrix matrix = new Matrix(column, row);
            matrix.AddMatrix();
        }
    }
}
