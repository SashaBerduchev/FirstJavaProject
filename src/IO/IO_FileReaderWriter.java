package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by student on 04.12.2018.
 */
public class IO_FileReaderWriter {

    public void fileReadWrite()
    {
        FileReader reader = null;
        FileWriter writer = null;


        try {
            reader = new FileReader("copied_file.txt");
            writer = new FileWriter("file.txt");

            int i;

            while ((i = reader.read()) != -1) {
                writer.write(i);
            }
        }catch (FileNotFoundException e){
            System.out.println("Not Found" + e);
        }catch (IOException e){
            System.out.println("Error Read" + e);
        }
        /*finally {
            if (reader != null) {
                reader.close();
            }

            if (writer != null){
                writer.close();
            }
        }*/
    }

}

