package IO;

import java.io.*;
import java.rmi.server.ExportException;

/**
 * Created by student on 03.12.2018.
 */
public class IO_BuffereStream {

    public  void BufferedStream(String string)
    {
        byte[] buffer = string.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);

        try(BufferedInputStream bis = new BufferedInputStream(in)) {
            int c;
            while ((c = bis.read()) != -1) {
                System.out.println((char) c);
            }

            while ((c = bis.read()) != -1) {
                System.out.println((char) c);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}

