package converter;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static String fromDecimal(int num, int base) {
        switch (base) {
            case 2: return Integer.toBinaryString(num);
            case 8: return Integer.toOctalString(num);
            case 16: return Integer.toHexString(num);
            default: return String.valueOf(num);
        }
    }

    public static int toDecimal(String num, int base) {
        return Integer.parseInt(num, base);
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            String input = scanner.next();
            if ("/exit".equals(input)) {
                running = false;
                break;
            }
            if ("/from".equals(input)) {
                System.out.print("Enter number in decimal system: ");
                int number = scanner.nextInt();
                System.out.print("Enter target base: ");
                int base = scanner.nextInt();
                System.out.println("Conversion result: " + fromDecimal(number, base));
            } else if ("/to".equals(input)) {
                System.out.print("Enter source number: ");
                String num = scanner.next();
                System.out.print("Enter source base: ");
                int base = scanner.nextInt();
                System.out.println("Conversion to decimal result: " + toDecimal(num, base));
            }
        }
    }
}
