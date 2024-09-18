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
        //TODO Write your code here for problem 2
        if (a+b>c && b+c>a && c+a>b){
            return true;
        }else
            return false;

    }
    public boolean isPrime(int number){
        //TODO Write your code here for problem 3
        Boolean isPrime(int a){
        Boolean isNotPrime = false;
        for (int i = 2; i <= a/2; i++){
            if (a % i == 0){
                isNotPrime = true;
                break;
            }
        }
        return false;
    }

    public  int hex2int(String hex) {
        //TODO Write your code here for problem 4
        return 0;
    }
    public String int2hex(int value) {
        //TODO Write your code here for problem 4
        return "";
    }


}
