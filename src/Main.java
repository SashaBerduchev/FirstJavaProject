import Array.*;
import Array.ArraySum;
import Array.NonRepetible;
import Array.SwapPosition;
import Generic.Generic_Class;
import Generic.Generic_Collection;
import Generic.Masks;
import IO.*;
import Multithreading.Example1.Example1.ThreadStart;
import Multithreading.Example1.Example3.Chiken;
import Multithreading.Example1.Example3.Egg;
import Multithreading.Example1.Synchronize.Program;
import Serializable.DeSerializable;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
           Integer num = System.in.read();
            Array array = new Array(num);


            Integer[] arr = new Integer[num];
            arr = array.AddArray();
            System.out.println("arr1 - " + arr);
            Integer[] arr2 = new Integer[num];
            arr2 = array.PereborIndexArray();
            System.out.println("arr2 - " + arr2);
            NonRepetible nonRepetible = new NonRepetible();
            nonRepetible.Repetible(arr);

            ArraySum arraySum = new ArraySum(arr, num);
            Integer sum =  arraySum.arraySum();
            System.out.println("summa - " + sum);

            SwapPosition swapPosition = new SwapPosition();
            swapPosition.swapPosition(arr);


            Integer elem = System.in.read();
            ArrayFind arrayFind = new ArrayFind(arr, num, elem);
            Integer index = arrayFind.findIndex();
            System.out.println(index);
            ShiftRight shiftRight = new ShiftRight();
            shiftRight.setShiftRight(arr, num);


            Generic_Class generic_class = new Generic_Class();
            generic_class.SetGeneric();
            Generic_Collection generic_collection = new Generic_Collection();
            generic_collection.Collection();

            System.out.println("Westi chisla");
            Integer internum =Integer.parseInt(String.valueOf( System.in.read()));
            System.out.println("Westi stroky");
            String str = String.valueOf(System.in.read());
            System.out.println("Westi double");
            Double dbl = Double.parseDouble(String.valueOf(System.in.read()));


            Masks masks = new Masks();
            masks.setMask(internum, "str", dbl);


            System.out.println("Enter string");
            IO_BuffereStream io_buffereStream = new IO_BuffereStream();
            io_buffereStream.BufferedStream(String.valueOf(System.in.read()));
            IO_BufferedOutputStream io_bufferedOutputStream = new IO_BufferedOutputStream();
            io_bufferedOutputStream.bufferedStream(String.valueOf(System.in.read()));

            IO_FileInputOutputStream io_fileInputOutputStream = new IO_FileInputOutputStream();
            io_fileInputOutputStream.StreamFile();

            IO_FileReaderWriter io_fileReaderWriter = new IO_FileReaderWriter();
            io_fileReaderWriter.fileReadWrite();


            IO_FilterStream io_filterStream = new IO_FilterStream();
            io_filterStream.filterStream(String.valueOf(System.in.read()));


            IO_PipedStream io_pipedStream = new IO_PipedStream();
            io_pipedStream.PipedStream();

            DeSerializable deSerializable = new DeSerializable();
            deSerializable.deSerializable();


            System.out.println("Write weriable");
            Double pointer = (double)( System.in.read());
            System.out.println("Write weriable");
            Integer numb =  System.in.read();
            ThreadStart threadStart = new ThreadStart(pointer, numb);
            threadStart.run();


            Egg egg = new Egg(num);
            Chiken chiken = new Chiken(num);


            System.out.println("Спор начат");
            egg.start();
            chiken.start();

         Program program = new Program(num);
         program.ProgramSet();



        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
