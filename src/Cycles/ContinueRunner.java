package Cycles;

public class ContinueRunner {
    public void setRunner(Integer num)
    {
        for(int i = 1; i < num; i++)
        {
            if(i % 3 == 0 || i % 5 == 0 || i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

}
