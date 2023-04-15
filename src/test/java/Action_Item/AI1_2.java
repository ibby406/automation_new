package Action_Item;

public class AI1_2 {
    public static void main(String[] args) {
        String[] region = new String[]{"America", "India", "Pakistan", "Bangladesh"};
        int[] regionalCode = new int[]{1, 91, 92, 880};

        int i=0;
        while (i<region.length){
            System.out.println("My region is " + region[i] + " and my area code is " + regionalCode[i]);
            i++;
        }

    }
}
