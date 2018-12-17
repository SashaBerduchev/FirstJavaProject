package Generic;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Generic_Collection {
    public void Collection()

    {

        List<String> list = new LinkedList<>();
        list.add("Yaroslav");
        list.add("Victor");
        //list.add(123);

        for(String st : list){
            System.out.println(st);
        }
    }
}
