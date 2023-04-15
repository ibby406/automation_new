package day2_226;

import java.util.ArrayList;

public class T2_ArrayList {

    public static void main(String[] args) {

        //create arraylist of countries
        ArrayList <String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("india");
        countries.add("pakistan");
        countries.add("bangladesh");

        //count of list
        System.out.println("Countries list: " + countries.size());
        //print only bangla and india
        System.out.println("Countries are: " + countries.get(3) + ", " + countries.get(1));

        countries.add("Russia");
        //count of list
        System.out.println("Countries list: " + countries.size());
        //print russia
        System.out.println(countries.get(4));
        //print last value
        System.out.println(countries.get(countries.size()-1));

        // numbers

        ArrayList <Integer> areacode = new ArrayList<>();
        areacode.add(777);
        areacode.add(222);
        areacode.add(333);
        //count of list
        System.out.println("areacode list: " + areacode.size());
        //print only bangla and india
        System.out.println("areacode are: " + areacode.get(2) + ", " + areacode.get(1));

        areacode.add(111);
        //count of list
        System.out.println("areacode list: " + areacode.size());
        //print last
        System.out.println(areacode.get(3));
        //print last value
        System.out.println(areacode.get(areacode.size()-1));


    }
}
