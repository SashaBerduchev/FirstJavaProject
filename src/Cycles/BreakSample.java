package Cycles;

public class BreakSample {
    public void breakSample()
    {
        int i=2;
        while (i<=1024)
        {
            if (i != 1024) System.out.println(i+"; ");
            else System.out.println(i);
            i*=2;
        }
    }

}
