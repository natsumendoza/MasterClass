package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Challenge
        byte myByte = 1;
        short myShort = 1;
        int myInt = 1;
        long myTotalLong = 5000L + 10L *
                (myByte + myShort + myInt);
        System.out.println(myTotalLong);

        short myShortTotal = (short) (10000 + 10 * (myByte + myShort + myInt));

    }
}
