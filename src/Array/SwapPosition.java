package Array;

import java.util.Arrays;

public class SwapPosition {

    public void swapPosition(Integer[] array) {
        int beginInd = 0;
        int endInd = array.length - 1;
        while (beginInd < endInd) {
            while (array[beginInd] < 0 && beginInd < endInd) {
                beginInd++;
            }
            while (array[endInd] < 0 && beginInd < endInd) {
                endInd--;
            }
            if (beginInd < endInd) {
                int tmp = array[beginInd];
                array[beginInd] = array[endInd];
                array[endInd] = tmp;
                beginInd++;
                endInd--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
