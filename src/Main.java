import Array.*;
import Array.ArraySum;
import Array.NonRepetible;
import Array.SwapPosition;
import Cycles.*;
import Generic.Generic_Class;
import Generic.Generic_Collection;
import Generic.Masks;
import IO.*;
import List.ArrayList;
import List.MyArrayList;
import List.MyArrayListAdd;
import MatrixWork.Matrix;
import Multithreading.Example1.Example1.ThreadMatrix;
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


           /* Egg egg = new Egg(num);
            Chiken chiken = new Chiken(num);


            System.out.println("Спор начат");
            egg.start();
            chiken.start();*/

         Program program = new Program(num);
         program.ProgramSet();

         Integer it =  System.in.read();

         Integer elementlist=  System.in.read();

         ArrayList arrayList = new ArrayList();
         arrayList.arrayListSample(num, it);

         MyArrayListAdd myArrayListAdd = new MyArrayListAdd();
         for(int i=0; i<5; i++)
          myArrayListAdd.MyListAdd(elementlist);


         BreakSample breakSample = new BreakSample();
         breakSample.breakSample();

         ContinueRunner continueRunner = new ContinueRunner();
         continueRunner.setRunner(num);

         DoWhileRunner doWhileRunner = new DoWhileRunner();
         doWhileRunner.doWhileRunner(num);

         Embedded embedded = new Embedded();
         embedded.doEmbedded(num, elem);

         FirstTask firstTask = new FirstTask();
         firstTask.Task(num);


         ForRunner forRunner = new ForRunner();
         forRunner.Runner();


         SecondTask secondTask = new SecondTask();
         secondTask.Task(num);


         Tab_task tab_task = new Tab_task();
         tab_task.tab_task(num);
         TherdTask therdTask = new TherdTask();
         therdTask.Task(num);


         Integer arrayLength;
         System.out.println("Enter of massiv length");
         arrayLength = System.in.read();
         ArrayOne arrayOne = new ArrayOne();
         arrayOne.setArray(arrayLength);



         ExaptionList exaptionList = new ExaptionList();
         exaptionList.setExaption();

         exaptionList.setNewExaption();

         System.out.println("Wwesti column");
         Integer column = System.in.read();
         System.out.println("Wwesti column");
         Integer row = System.in.read();
         System.out.println("Wwesti number");
         Integer number = System.in.read();


         Matrix matrix = new Matrix(column, row);
         matrix.AddMatrix();

         ThreadMatrix threadMatrix = new ThreadMatrix(row, column, number);
         threadMatrix.run();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
