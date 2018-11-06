/**
 * Copyright (C) 2016 rats
 * <p/>
 *
 * @author : rats
 * @version : v1.0
 * @since : 2018/11/6
 */
public class MathApp {

    private static final double PI = Math.PI;


    public static void decimal() {
        int x = -3, y = 4;
        double z = 3.6789;
        int abs = Math.abs(x);
        System.out.printf("abs:%d=%d\n", x, abs);

        int max = Math.max(x, y);
        System.out.printf("max:%d,%d=%d\n", x, y, max);

        int min = Math.min(x, y);
        System.out.printf("min:%d,%d=%d\n", x, y, min);

        double pow = Math.pow(x, y);
        System.out.printf("pow:%d,%d=%f\n", x, y, pow);

        double log = Math.log(y);
        System.out.printf("log:%d=%f\n", y, log);

        double floor = Math.floor(z);
        System.out.printf("floor:%f=%f\n", z, floor);

        double ceil = Math.ceil(z);
        System.out.printf("ceil:%f=%f\n", z, ceil);

        double round = Math.round(z);
        System.out.printf("round:%f=%f\n", z, round);

    }

    public static void main(String[] args) {

        decimal();
    }
}
