package Multithreading.Example1.Example1;

import Array.Array;

import java.security.interfaces.DSAPublicKey;

public class ThreadStart extends Thread {

    Double numpoint;
    Integer number;

    public ThreadStart(Double num, Integer numb){numpoint = num; number = numb; }
    public void run()
    {
        for (int i=0; i<numpoint; i++)
        {
            Thread thread = new Thread(this::someThread);  //Thread thread = new Thread(GetPhones);
            thread.run();
            System.out.println("Thread stop");
        }

    }


    void someThread()
    {
        Integer[] arr;
        Array array = new Array(number);
        arr = array.AddArray();
        System.out.println(arr.toString());

        for (int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
