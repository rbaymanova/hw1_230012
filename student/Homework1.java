package student;

public class Homework1 {

    public double shippingCalculator(int n) {
        if (n == 1) {
            return 10.95;
        } else if (n > 1) {
            return 10.95 + (2.95 * (n - 1));
        } else {
            return 0;
        }
    }

    public boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }

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

    public int hex2int(String hex) {
        if(num.length()>1)
            return -1;
        if(Character.isDigit(num.charAt(0)))
            return Integer.valueOf(num);
        if(num.charAt(0)=='A'||num.charAt(0)=='a')
            return 10;
        if(num.charAt(0)=='B'||num.charAt(0)=='b')
            return 11;
        if(num.charAt(0)=='C'||num.charAt(0)=='c')
            return 12;
        if(num.charAt(0)=='D'||num.charAt(0)=='d')
            return 13;
        if(num.charAt(0)=='E'||num.charAt(0)=='e')
            return 14;
        if(num.charAt(0)=='F'||num.charAt(0)=='f')
            return 15;
        return -1;
    }
    
    public String int2hex(int value) {
        if(num<0||num>15)
            return "-1";
        if(num<10)
            return String.valueOf(num);
        if(num==10)
            return "A";
        if(num==11)
            return "B";
        if(num==12)
            return "C";
        if(num==13)
            return "D";
        if(num==14)
            return "E";
        return "F";

    }
}
