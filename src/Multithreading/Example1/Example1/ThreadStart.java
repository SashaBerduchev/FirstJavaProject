package Multithreading.Example1.Example1;

import Array.Array;

import java.security.interfaces.DSAPublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadStart extends Thread {

    Integer numpoint;
    Integer number;

    public ThreadStart(Integer num, Integer numb){numpoint = num; number = numb; }
    public void run()
    {
        Thread[] array = new Thread[numpoint];
        for (int i=0; i<numpoint; i++)
        {
            Thread thread = new Thread(this::someThread);  //Thread thread = new Thread(GetPhones);
            System.out.println("Thread RUN");
            array[i] = thread;
        }

        for(int i = 0; i < array.length; i++)
        {
            array[i].start();
        }
    }


    private void someThread()
    {
        for (int j=0; j<number; j++) {
            Integer[] arr;
            Array array = new Array(number);
            arr = array.AddArray();
            System.out.println(arr.toString());

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + ' ');
            }
        }
    }
}
