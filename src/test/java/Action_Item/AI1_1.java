package Action_Item;

import java.util.ArrayList;

public class AI1_1 {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>();
        country.add("USA");
        country.add("India");
        country.add("Pakistan");
        country.add("Bangladesh");

        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(1);
        countryCode.add(91);
        countryCode.add(92);
        countryCode.add(880);

        for(int i=0; i< countryCode.size(); ++i){
            System.out.println("My country is " + country.get(i) + " and my country code is: " + countryCode.get(i));
        }

    }
}
