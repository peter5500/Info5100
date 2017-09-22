package assignment2;

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
