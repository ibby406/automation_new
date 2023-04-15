package day2_226;

public class T4_WhileLoop {

    public static void main(String[] args) {
        //create a linear array of countries
        String[] countries = new String[]{"USA","Canada","Bangladesh","Argentina"};
        //create a liner array of areaCode
        int[] areaCode = new int[]{111,222,333,444};


        int count = 0;
        System.out.println("countries begin" + "\n");

        while(count < countries.length){
            System.out.println("Country is " + countries[count] + " area code is " + areaCode[count]);

            count++;
        }//end of loop

        System.out.println("\n" + "countries end");
    } //end of main

} //end of java




