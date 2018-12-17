package Multithreading.Example1.Example3;

/**
 * Created by student on 05.12.2018.
 */
public class Egg extends Thread {

    Integer leni;
    public  Egg(Integer num){leni = num;}

    public  void run()
    {
        for(int i=0; i<leni; i++)
        {
            try{
                sleep(500);
            }catch (Exception ex){
                System.out.println(ex);
            }
            System.out.println("Яйцо");


        }
    }
}
