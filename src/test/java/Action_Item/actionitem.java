package Action_Item;

import java.sql.Array;
import java.util.ArrayList;

public class actionitem {

    public static void main(String[] args){

        String[] region = new String[] {"USA", "Pakistan", "India", "bangladesh"};
        int[] areaCode = new int[] {1,92,91,880};

        int i=0;
        while (i<region.length){
            System.out.println("My region is: " + region[i] + " and my area code is: " + areaCode[i]);
            i++;
        }


    }
}
