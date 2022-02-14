package casting;

public class TypeCasting {
    public void wideningCasting(){
        // WideningCasting For Converting small data types into big data types
        int myInt = 5;
        double myDouble = myInt;
        System.out.println(myDouble);
    }
    public void narrowingCasting(){
        // Narrowing Casting for converting big data types into small data types
        double d = 3.14d;
        int mi = (int)d;
        System.out.println(mi);
    }
}
