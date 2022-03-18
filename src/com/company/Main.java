package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(san(300));
    }

    static int san(int san1) {
        int sum = 0;
        for (int i = 1; i <= san1; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                sum += i;
                if (i != san1) {
                    System.out.print(i + " + ");
                }
                if (i == san1) {
                    System.out.print(i + " = ");
                }
            }
        }
        return sum;
    }
}

