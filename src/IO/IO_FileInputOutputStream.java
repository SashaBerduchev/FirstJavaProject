package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by student on 04.12.2018.
 */
public class IO_FileInputOutputStream {

    public void StreamFile(){


        try (FileOutputStream fileOutputStream  = new FileOutputStream("copied_file.txt");
        FileInputStream fileInputStream = new FileInputStream("file.txt"))
        {
        int a;
        while ((a=fileInputStream.read())!= -1)
            {
                fileOutputStream.write(a);
            }
        }catch ( IOException e)
        {
            System.out.println(e);
        }



    }

}
