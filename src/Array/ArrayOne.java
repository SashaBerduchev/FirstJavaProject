package Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayOne {
    public void setArray(Integer num)
    {

        Random random = new Random();

        Integer arrayDimensions = num;

        Integer[] array = new Integer[arrayDimensions];

        for (int i=0; i<array.length; i++)
        {
            array[i] = random.nextInt(50);
        }

        System.out.println("Array - " + array);

        for (int i=0; i<array.length; i++)
        {
            System.out.println();
        }

        int minElem, minElementIndex;

        minElem = array[0];
        minElementIndex = 0;

        for (int i=1; i<array.length; i++)
        {
            if(array[i] <minElem){
                minElem = array[i];
                minElementIndex = i;
            }
            System.out.println("MinElement - "+ minElem +"Index - "+ minElementIndex);
        }
    }
}
