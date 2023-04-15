package day3_0304;

public class Multiple_conditions {
    public static void main(String[] args) {

        //using multiple conditional statements, verify when a+b >c,
        int a, b, c;
        a=2;
        b=3;
        c=5;

        if ( a+b > c){
            System.out.println("a and b is greater than c");
        } else if (a+b < c) {
            System.out.println("a and b is less than c");
        } else if (a+b == c){
            System.out.println("a and b is equal to c");
        } // end of multiple conditions

    } // end of main
} // end of class
