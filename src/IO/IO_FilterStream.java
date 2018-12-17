package IO;

import java.io.FileReader;
import java.io.FilterReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.WeakHashMap;

/**
 * Created by student on 04.12.2018.
 */
public class IO_FilterStream {

    public  void filterStream(String str) throws Exception
    {
        FilterReader fr = null;
        Reader r = null;
        int i=0;
        char c;

        try {
            r= new StringReader(str);

            fr = new FilterReader(r){

            };

            while ((i = fr.read()) !=-1)
            {
                c = (char)i;

                System.out.println("Symbol" + c);
            }
        }catch ( Exception e){
            e.printStackTrace();
        }finally {
            if(r!=null)
                r.close();
            if(fr!=null)
                fr.close();
        }
    }
}
