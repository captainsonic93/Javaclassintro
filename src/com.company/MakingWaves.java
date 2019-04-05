package com.company;

public class MakingWaves {
    public static void main(String[] args) {
        Operation whitewash = new Operation();
        System.out.println(whitewash.add(40,70));
        System.out.println(whitewash.multiply(37,9));
        System.out.println(whitewash.multiply(40,5));
        System.out.println(whitewash.increment(69));
        System.out.println(whitewash.decrement(94));
        System.out.println(whitewash.modulous(69,96));
        System.out.println(
                whitewash.subtract(
                        whitewash.add(40,88),
                        whitewash.divide(45,9789)
                )

        );
        System.out.println(whitewash.multiadd(34,56,93));

    }
}
