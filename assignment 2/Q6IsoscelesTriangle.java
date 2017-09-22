package assignment2;


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
