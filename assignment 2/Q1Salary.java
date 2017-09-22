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
        } else (hours <= 48 && hours > 41) {
            return 36 * 15 + 5 * 15 * 1.5 + (hours - 41) * 15 * 2;
        } 
    }
        public static void main(String [] args){
            Q1Salary count=new Q1Salary();
            System.out.println(count.employeeSalary(2));
    }
}
