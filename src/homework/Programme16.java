package homework;

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Scanner u1 = new Scanner(System.in);
        System.out.println("Input a Number : ");
        int number = u1.nextInt();
        findNumberIsPositiveNegativeorZero(number);
        u1.close();
    }

    public static void findNumberIsPositiveNegativeorZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number");
        } else {
            System.out.println(number + " is ZERO");
        }
    }
}


