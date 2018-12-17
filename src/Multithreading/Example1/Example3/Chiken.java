package Multithreading.Example1.Example3;

/**
 * Created by student on 05.12.2018.
 */
public class Chiken extends Thread{

    Integer leni;

    public  Chiken(Integer num){leni = num;}
    public  void run(){
        for(int i=0; i<leni; i++)
        {
            try{
                sleep(500);
            }catch (Exception ex){
                System.out.println(ex);
            }
            System.out.println("Курица");

        }
    }
}
