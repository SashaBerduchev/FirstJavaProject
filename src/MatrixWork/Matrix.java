package MatrixWork;

import IO.IO_BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.util.Random;

public class Matrix {

    Integer column;
    Integer row;
    Integer[][] matrix;

    public Matrix(Integer column, Integer row)
    {
        this.column = column;
        this.row = row;
        matrix = new Integer[column*column][row*row];
        System.out.println(matrix);
    }

    public void AddThread(){
        for (int i=0; i<2; i++){
            Thread thread = new Thread(this::AddMatrix);
            System.out.println(thread);
            thread.start();
        }
    }
    public  void AddMatrix()
    {
        System.out.println("AddMatrix");
        IO_BufferedOutputStream outputStream = new IO_BufferedOutputStream();
        for(int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                Random random = new Random();
                matrix[i][j] = random.nextInt(100);
            }
        }


        for(int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]);
                outputStream.bufferedStream(String.valueOf(matrix[i][j]));
            }
            System.out.println();
        }


        for(int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                MatrixStreamWrite write = new MatrixStreamWrite();
                write.setMatrixStream(matrix[i][j].toString());
            }

        }

    }
}
