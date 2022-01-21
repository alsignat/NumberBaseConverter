import java.math.BigDecimal;
import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        if (n == 0) return BigInteger.ONE;
        BigInteger num = BigInteger.valueOf(n);
        for (int i = n - 2; i > 0; i -= 2) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        return num;
    }
}