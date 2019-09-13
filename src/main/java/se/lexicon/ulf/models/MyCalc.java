package se.lexicon.ulf.models;

public class MyCalc {

    public static double addition(double numberA, double numberB) {
        return numberA + numberB;
    }

    public static double subtraction(double numberA, double numberB) {
        return numberA - numberB;
    }

    public static double multiplication(double numberA, double numberB) {
        return numberA * numberB;
    }

    public static double divison(double numberA, double numberB) {
        return numberA / numberB;
    }

    public static double addition(double[] numbers) {

        double sum = 0;

        for (double x : numbers)
        {
            sum += x;// sum = sum + x;
        }

        return sum;
    }

    public static double subtraction(double[] numbers) {

        if (numbers.length == 0)
        {
            return 0;
            //throw new ArithmeticException();
        }

        if (numbers.length == 1)
        {
            return numbers[0];
        }

        double sum = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            sum -= numbers[i];
        }

        return sum;
    }
}
