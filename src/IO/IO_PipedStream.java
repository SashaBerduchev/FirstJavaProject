package IO;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Created by student on 04.12.2018.
 */
public class IO_PipedStream {

    public void PipedStream()
    {
        try
        {
            PipedReader Reader = new PipedReader();
            PipedWriter Writer = new PipedWriter();

            Reader.connect(Writer);

            //Записываем поток в одном конце
            for (int i = (int)('A'); i < ((int) ('z')) + 1; i++)
                Writer.write((char) i );

            //Считываем поток в другом конце
            for (int i = (int)('A'); i < ((int) ('z')) + 1; i++ ) {
                int chr = Reader.read();
                System.out.print((char) chr);
            }

        } catch (IOException Ex)
        {
            System.out.println(Ex.getMessage());
        }
    }
}
