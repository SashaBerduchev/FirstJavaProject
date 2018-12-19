package Cycles;

public class Tab_task {
    public void tab_task(Integer num)
    {
        System.out.print("   ");
        for (int k=2; k<num; k=k+1){
            System.out.print(String.format("%3d", k));
        }
        System.out.println();
        for (int i=2; i<num; i++) {
            System.out.print(String.format("%3d",i ));
            for (int j=2; j<num; j++) {
                System.out.print(String.format("%3d",i*j));
            }
            System.out.println();
        }
    }
}
