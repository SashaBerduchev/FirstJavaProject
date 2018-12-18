package List;

import java.util.Arrays;

public class MyArrayListAdd {
    public void MyListAdd(Integer elem)
    {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(elem);
        System.out.println(Arrays.toString(myArrayList.toArray(new Integer[0])));
    }

}
