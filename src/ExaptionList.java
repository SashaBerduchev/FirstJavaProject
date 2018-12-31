import Array.Array;

import java.io.File;

import java.io.FileWriter;

public class ExaptionList {
    public void setExaption() throws Exception
    {
        try {

            File f = new File("a.txt");
        }
        catch (Exception e)
        {
            System.out.println(e);
            try {
                Array array = new Array(50);
                FileWriter writer = new FileWriter("a.txt");
                Integer[] arr = array.AddArray();
                for (int i=0; i<arr.length; i++)
                {
                    writer.write(arr[i]);
                }

            }catch (Exception exp)
            {
                System.out.print(exp);
            }
        }


    }

    public  void setNewExaption() throws  Exception
    {
        try {
            Array array = new Array(50);
            FileWriter writer = new FileWriter("a.txt");
            Integer[] arr = array.AddArray();
            for (int i=0; i<arr.length; i++)
            {
                writer.write(arr[i].toString());
            }

        }catch (Exception exp)
        {
            System.out.print(exp);
        }
    }
}
