package Cycles;

public class Embedded {
    public  void doEmbedded(Integer num, Integer point)
    {

        System.out.println("");
        for(int i=0; i<num; i+=10)
        {
            for(int j=0; j<10; j++)
            {
                if(i+j==point)
                    break;

                System.out.println(String.format("@2d",  i+j)+" ");
            }
            System.out.println();

        }
    }

}
