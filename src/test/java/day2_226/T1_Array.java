package day2_226;

public class T1_Array {

    public static void main(String[] args) {
        //create list of cities
        String[] cities = new String[] {"Bronx", "Brooklyn", "Bronx", "Manhattan", "staten island"};

        System.out.println("Amount of cities are " + cities.length);

        System.out.println("length of S.I is " + cities[4].length());

        System.out.println("my cities are " + cities[0] + " " + cities[4] + '\n');

        //create list of zipcodes
        int[] zipcodes = new int[] {11111, 22222, 33333, 44444};
        //count of zipcodes
        System.out.println("zipcode Count are " + zipcodes.length);
        //print 1111 and 3333
        System.out.println("my zipcodes are " + zipcodes[0] + " and " + zipcodes[2]);

    }
}
