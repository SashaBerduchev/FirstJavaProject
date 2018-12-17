package Generic;

public class Generic_Class {
    public void SetGeneric()
    {
        BoxPainter<Integer> valueInt = new BoxPainter<>(new Integer(10));
        System.out.println(valueInt);
        Integer valueInt2 = valueInt.getValue();
        BoxPainter<String> value2 = new BoxPainter<>("hello world");
        System.out.println(value2);

        String intValue2 = value2.getValue();
    }



    static  class BoxPainter<T>
    {
        private T val;

        public BoxPainter(T arg){this.val = arg;}

        public String toString() {return "{" + val + "}";
        }
        public  T getValue() {return val;}
    }
}
