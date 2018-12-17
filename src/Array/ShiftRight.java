package Array;

import java.util.Arrays;

public class ShiftRight {
    public void setShiftRight(Integer[] array, Integer numindex)
    {
        int k=3;
        for(int j =0; j<k; j++)
        {
            int temp = array[ array.length - 1];
            for(int i=array.length - 1; i>0; i--)
            {
                array[i] = array[i-1];
            }
            array[0] = temp;
        }

        int newArr[] = new int[array.length];
        for (int i = 0; i< array.length; i++){
            newArr[i]= array[(i-k+ array.length)%array.length];
        }

        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArr));
        //System.arraycopy(array,0, newArr,k , array.length - k);
        System.out.println(Arrays.toString(newArr));
        //System.arraycopy(array, array.length  -k ,newArr , 0, k);
        System.out.println(Arrays.toString(newArr));
    }


}
