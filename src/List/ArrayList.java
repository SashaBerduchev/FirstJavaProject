package List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public  void arrayListSample(Integer num, int it)
    {
        List<Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(num);

       // System.out.println(arrayList.get(it));
        //arrayList.remove(it);
        System.out.println(arrayList.size());

        Iterator<Integer> ii = arrayList.iterator();
        for(;ii.hasNext();)
        {
            Integer val = ii.next();
            System.out.println(val);
        }

        System.out.println(arrayList);
        Integer[] arr = arrayList.toArray(new Integer[]{});
        arrayList = Arrays.asList( 2 ,3, 4 ,4 ,5);
        System.out.println(arrayList);
    }
}
