package Action_Item;

public class AI2_1 {

    public static void main(String[] args) {
        //create grade variable
        int grade = 0;

        // if grade is between 90 and including 100, print "A"

        if (grade>= 90 && grade <=100){
            System.out.println("Grade: A");
        }

        // if grade is between 80 and  90, print "B"
        else if (grade>= 80 && grade <90){
            System.out.println("Grade: B");
        }

        // if grade is between 70 and  80, print "C"
        else if (grade>= 70 && grade <80){
            System.out.println("Grade: C");
        }

        // if grade is between 60 and  70, print "D"
        else if (grade>= 60 && grade <70){
            System.out.println("Grade: D");
        }
        // if grade is below 60, print "F"
        else if (grade<60){
            System.out.println("Grade: F");
        }


    } // end of main
} // end of class
