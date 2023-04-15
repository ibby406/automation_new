package day2_226;

import java.util.ArrayList;

public class T3_ForLoop {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("india");
        countries.add("pakistan");
        countries.add("bangladesh");

        ArrayList <Integer> areacode = new ArrayList<>();
        areacode.add(777);
        areacode.add(222);
        areacode.add(333);
        areacode.add(444);

        for(int i=0;i<=3;i++){
            System.out.println("Countries are: " + countries.get(i) + " areacode are: " + areacode.get(i));
        }
    }
}
