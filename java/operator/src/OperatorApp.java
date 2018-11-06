/**
 * Copyright (C) 2016 rats
 * <p/>
 *
 * @author : rats
 * @version : v1.0
 * @since : 2018/11/6
 */
public class OperatorApp {

    public static void assignOperation() {

        int x = 3;
        x += 3;
        x -= 3;
        x *= 3;
        x /= 3;
        x %= 3;

        x &= 3;
        x ^= 3;
        x |= 3;
        x <<= 3;
        x >>= 3;
        x >>>= 3;

    }

    public static void baseOperation() {
        int a = 1, b = 2;

        int sum = a + b;
        int diff = a - b;
        int result = a * b;
        int result2 = a / b;
        int result3 = a % b;

        a++;
        ++a;
    }


    public static void bitOperation() {
        int x = 3;
        int y = 4;
        int result = x << 3;
        int result2 = x >> 3;
        int result3 = x >>> 3;


        int result4 = ~x;
        int result5 = x | y;
        int result6 = x & y;
        int result7 = x ^ y;
    }


    public static void compareOperation() {
        int x = 3;
        int y = 4;
        boolean result = x > y;
        result = x >= y;
        result = x < y;
        result = x <= y;
        result = x == y;
        result = x != y;
    }

    public static void main(String[] args) {

    }
}
