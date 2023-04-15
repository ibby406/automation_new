package day3_0304;

import java.util.ArrayList;

public class LoopConditions {

    public static void main(String[] args) {

        //iterate thru fruits list, print grape or apple

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("strawberry");
        fruits.add("grape");

        for(int i=0; i < fruits.size(); i++ ){
           /* if(fruits.get(i) == "apple") {
                System.out.println("fruit=apple");
            } else if (fruits.get(i) == "grape"){
                System.out.println("fruits: grape");
            } // end of conditions
            */

            if(fruits.get(i) == "apple" || fruits.get(i) == "grape"){
                System.out.println("Fruit: " + fruits.get(i));

            } // end of conditions

        } // end of loop
    } // end of main
} // end of class
