package assignment2;

public class Q3PerfectNumber {

    public static void main(String[] args) {
        Q3PerfectNumber test= new Q3PerfectNumber();
        test.printNumbers(10000);

    }
    public void printNumbers( int n ){
        for( int i=6; i<=n ; i++ ) {
            if (checkPerfectNumbers(i)){
                System.out.println(i);
            }
        }
    }

    public boolean checkPerfectNumbers(int n) {
        if (n == 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                if (i != n / i) {
                    sum = sum + n / i;
                }
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
