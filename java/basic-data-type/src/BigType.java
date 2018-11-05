import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Copyright (C) 2016 rats
 * <p/>
 *
 * @author : rats
 * @version : v1.0
 * @since : 2018/11/5
 */
public class BigType {

    public static void main(String[] args) {

        BigInteger num1 = new BigInteger("123456789");
        BigInteger num2 =  new BigInteger("987654321");
        BigInteger result = num1.multiply(num2);
        System.out.println("123456789 * 987654321=" + result.longValue());


        BigDecimal dec1 = new BigDecimal("0.1234");
        BigDecimal dec2 =  new BigDecimal("0.5678");
        BigDecimal result2 = dec1.divide(dec2,10,BigDecimal.ROUND_DOWN);
        System.out.println("0.1234 / 0.5678=" + result.doubleValue());


    }
}
