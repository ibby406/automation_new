package day3_0304;

public class Split {
    public static void main(String[] args) {

        //declare strong variable
        String message = "My_name_is_ ...._John";
        //split message by space
        String[] arrayMessage = message.split(" ");
        //arrayMessage has 2 indexes, split second array to get John
        String[] arrayMessage1 = arrayMessage[1].split("...._");

        System.out.println("Result: " + arrayMessage1[1]);


        String newMessage = "My name is John";

        String[] newArray = newMessage.split(" ");
        System.out.println("Result: " + newArray[3]);

    } // end of main
}//ed of class
