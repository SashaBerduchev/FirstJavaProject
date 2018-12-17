package Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.Period;

/**
 * Created by student on 04.12.2018.
 */
public class DeSerializable {

    public  void deSerializable()
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat")))
        {
            Person p=(Person)ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        } catch(Exception ex){

            System.out.println(ex.getMessage());
        }

    }
}
