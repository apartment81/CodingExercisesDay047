package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        ASimpleWithdraw simpleWithdraw = new ASimpleWithdraw();

        int [] result = simpleWithdraw.withdraw(370);


/*
        for (int aResult : result) {
            System.out.println(aResult);
        }*/

        System.out.println("370" + java.util.Arrays.toString(result));


        System.out.println( "250" +java.util.Arrays.toString(simpleWithdraw.withdraw(250)));
    }
}
