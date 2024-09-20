package student;

public class Homework1 {

    // Shipping calculator
    public double shippingCalculator(int n) {
        // Return the calculated value instead of printing
        if (n == 1) {
            return 10.95;
        } else if (n > 1) {
            return 10.95 + (2.95 * (n - 1));
        } else {
            System.out.println("Enter a positive number.");
            return 0;
        }
    }

    // Check if a triangle is valid
    public boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }

    // Prime number checker
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hexadecimal to integer converter
    public int hex2int(String hex) {
        if (hex.length() > 1) {
            return -1;
        }
        char ch = hex.charAt(0);
        if (Character.isDigit(ch)) {
            return Integer.parseInt(hex);
        }
        switch (ch) {
            case 'A':
            case 'a':
                return 10;
            case 'B':
            case 'b':
                return 11;
            case 'C':
            case 'c':
                return 12;
            case 'D':
            case 'd':
                return 13;
            case 'E':
            case 'e':
                return 14;
            case 'F':
            case 'f':
                return 15;
            default:
                return -1;
        }
    }

    // Integer to hexadecimal converter
    public String int2hex(int value) {
        if (value < 0 || value > 15) {
            return "-1";
        }
        if (value < 10) {
            return String.valueOf(value);
        }
        switch (value) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return "-1";
        }
    }
}
