package Multithreading.Example1.Synchronize;

public class Program {
    Integer numpoint;

    public Program(Integer num){numpoint = num;}
    public  void ProgramSet()
    {
        CommonResource commonResource = new CommonResource();
        for (int i=1; i<numpoint; i++) {
            Thread t = new Thread(new CountThread(commonResource, numpoint));
            t.start();
        }
    }
}


class CommonResource{
    int x=0;
}

class CountThread implements Runnable{
    CommonResource res;
    Integer count;
    CountThread(CommonResource res, Integer numpoint) {this.res = res; count = numpoint;}
    public void run(){
        res.x = 1;
        for(int i = 1; i < count; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + res.x);
            res.x++;
            try{
                Thread.sleep(100);
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
