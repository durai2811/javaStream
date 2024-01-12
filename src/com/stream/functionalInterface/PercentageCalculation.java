package com.stream.functionalInterface;

/**
 * if you have 20 apples out of a total of 50 apples, the percentage of apples you have is:
 */
public class PercentageCalculation implements Percentage {
    public static void main(String[] args) {
        // without lambda expression
        PercentageCalculation percentageCalculation = new PercentageCalculation();
        double percentage = percentageCalculation.getPercentage(20, 100);
        System.out.println(percentage);

        // by using lambda expression
        Percentage percentage1 = (a, b) -> (a / b) * 100;
        double v = percentage1.getPercentage(40, 90);
        System.out.println(v);

    }

    @Override
    public double getPercentage(double part, double whole) {
        //formula percentage = (part/whole) * 100
        if (part != 0 && whole != 0)
            return part / whole * 100;
        else
            throw new RuntimeException("part and whole value should not be 0");
    }
}
