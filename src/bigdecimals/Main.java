package bigdecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        double x = 100;
        double y = 3;


        var result = x /y;


        var end= result * 1_000_000_000;
        double x1 = 33.333333333333333 * 1_000_000_000;
        System.out.println(x1);
        System.out.println(end);
        System.out.println(x1 - end);

//        Floating point problem

        BigDecimal bigDecimal = new BigDecimal("10"); // the preferred way of
        // instantiating a BD, because iot treats the numbers representation as a string

        BigDecimal bd2 = BigDecimal.valueOf(result); // inherits the same problems as we have seen before
        System.out.println(bd2.toString());

        var bd100 = new BigDecimal("100");
        var bd3 = new BigDecimal("3");
        var bdResult = bd100.divide(bd3, 15, RoundingMode.HALF_UP);
        System.out.println(bdResult);

        var rSum= bd3.add(BigDecimal.TEN);

//        bd3 + bd100

        double what = 1.0 - 0.9; // 0.1
        System.out.println(what);

        double a = 0.1;
        double b = 0.2;
        double c = 0.3;

        if (a + b == c) {
            System.out.println("Equal");
        } else {
            System.out.println(a + b );
            System.out.println(c);
            System.out.println("Not Equal");
        }




    }
}
