package Generic;

import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public abstract class Generic_Method {

    public void setList(String listset, String listset1, String listset2) {
        List<String> list = new ArrayList<>();
        list.add(listset);
        list.add(listset1);
        list.add(listset2);


        System.out.println("For work" + list);
        SomeClass.doSomething(list, "2");
        System.out.println("After work" + list);
    }
}

    class SomeClass {
        public static <T> void doSomething(List<T> list, T val) {

            for (int i = 0; i < list.size(); i++) {
                list.set(i, val);
            }
        }
    }
