package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double result = (firstDouble + secondDouble) * 100.00;
        double remainder = result % 40.00;
        boolean isRemainderZero = (remainder == 0) ? true : false;
        System.out.println(isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}
