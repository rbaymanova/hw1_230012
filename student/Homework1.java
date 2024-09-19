   package student;

public class Homework1 {

    public double shippingCalculator(int n){
        //TODO Write your code here for problem 1
        if (n==1){
            System.out.println("10.95$");
        }else if (n>=1){
            System.out.println(10.95+(2.95*(n-1)) + "$");
        }else System.out.println("Enter positive number.");
        return 0;
    }
    public boolean isValidTriangle(int a, int b, int c){
        if (a+b>c && b+c>a && c+a>b) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isPrime(int number){
        //TODO Write your code here for problem 3
        Boolean isPrime = true;
        if(items<1){
            isPrime = false;
        }
        for(int i=2; i<=Math.sqrt(items); i++){
            if(items%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

public  int hex2int(String hex) {
    //TODO Write your code here for problem 4
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
