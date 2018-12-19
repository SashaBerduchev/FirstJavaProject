package Cycles;

public class TherdTask {
    public void Task(Integer num){
        int i=2;
        while (i<=num){
            if (i != 1024) System.out.println(i + "; ");
            else System.out.println(i);
            i*=2;
        }
    }
}
