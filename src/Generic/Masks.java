package Generic;

import java.util.ArrayList;
import java.util.List;

public class Masks {

    public void setMask(Integer intnum, String str, Double dnum)
    {
        List<Integer> listint = new ArrayList<>();
        listint.add(intnum);
        printList(listint);


        List<String> liststr = new ArrayList<>();
        liststr.add(str);
        printList(liststr);

        List<Double> dlist = new ArrayList<>();
        dlist.add(dnum);

        List<Object> objlist = new ArrayList<>();
        objlist.add(intnum);
        objlist.add(str);
        objlist.add(dnum);
        printList(objlist);

    }


    static void printList(List<?> somelist){
        System.out.println("Your collection");
        for (Object l : somelist){
            System.out.println(l);
        }
    }

}
