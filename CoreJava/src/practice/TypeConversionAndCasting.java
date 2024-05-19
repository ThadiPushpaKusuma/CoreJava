package practice;
public class TypeConversionAndCasting {
    public static void main(String[] args) {
        byte b = 127;

        int  n = b;   //Implicit conversion
    
        System.out.println(n);

        // /////////////////////////////////////////////////
        int k = 126;

        byte be = (byte)k;  //Explicit conversion

        System.out.println(be);

        /////////////////////////////////////////////////

        float f = 5.7f;

        //int a = f; //we can't convert directly float value into integer value

        int a = (int)f;  //Explicit conversion ....Here we will loss .point values
        System.out.println(a);
        
        //////////////////////////////////////////////

        double d = 2.8;

        //int i = d; //we can't convert directly double value into integer value

        int i = (int)d; //Explicit conversion ....Here we will loss .point values

        System.out.println(i);
    }
    
}
// Integer, float, long and double values will work for conversion
