package Multithreading.Example1.Synchronize;

public class Program {
    Integer numpoint;

    public Program(Integer num){numpoint = num;}
    public  void ProgramSet()
    {
        CommonResource commonResource = new CommonResource();
        for (int i=1; i<numpoint; i++) {
            Thread t = new Thread(new CountThread(commonResource));
            t.start();
        }
    }
}


class CommonResource{
    int x=0;
}

class CountThread implements Runnable{
    CommonResource res;
    CountThread(CommonResource res) {this.res = res;}
    public void run(){
        res.x = 1;
        for(int i = 1; i < 5; i++)
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
