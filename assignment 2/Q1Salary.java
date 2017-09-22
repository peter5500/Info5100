package assignment2;

/* Q1
 */
public class Q1Salary {
    double hours;
    public double employeeSalary( double hours ) {
        if (hours <= 36) {
            return hours * 15;
        } else if (hours <= 41 && hours > 36) {
            return 36 * 15 + (hours - 36) * 15 * 1.5;
        } else if (hours < 48 && hours > 41) {
            return 36 * 15 + 5 * 15 * 1.5 + (hours - 41) * 15 * 2;
        } else {
            return 36 * 15 + 5 * 15 * 1.5 + 7 * 15 * 2;
        }
    }
        public static void main(String [] args){
            Q1Salary count=new Q1Salary();
            System.out.println(count.employeeSalary(2));
            System.out.println(count.employeeSalary(47));
    }
}

/*Q2
*/
public class Q2AddDigit {
    public int addDigits( int input ){
        while ( input >= 10 ){
            input = input/10 + input%10;
        }
        return input;
    }

    public static void main(String[] args) {
        Q2AddDigit add= new Q2AddDigit();
        System.out.println(add.addDigits(11));
        System.out.println(add.addDigits(111));
        System.out.println(add.addDigits(99));
    }
}

/*Q3
*/
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

/*Q6
*/
public class Q6IsoscelesTriangle {
    public static void main(String[] args) {
        Q6IsoscelesTriangle test= new Q6IsoscelesTriangle();
        test.printTriangle(8);
    }
    public void printTriangle(int n){
        for(int x=1 ; x<=n ; x++) {
            for (int y = 1; y <= x; y++) {
                if ( y == 1 || x == n ){
                    System.out.print("*");
                }
                else if ( x == y ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        }
    
    }
