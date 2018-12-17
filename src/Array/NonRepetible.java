package Array;

public class NonRepetible {
    public void Repetible(Integer[] array)
    {
        for(int i=0; i < array.length; i++)
        {
            boolean isUnique = true;
            for(int j=0; j<array.length; j++)
            {
                if(array[i] == array[j] && i!=j)
                {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                System.out.println(array[i]+" ");
            }
        }
    }
}
