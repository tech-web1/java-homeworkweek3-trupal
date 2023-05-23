package homework;
//Input number is odd or even

import java.util.Scanner;

public class Programme1 {
    public static void even(){
        int number;
        Scanner obj =new Scanner(System.in);
        number = obj.nextInt();
        System.out.println(number);
        String m1 =(number % 2 ==0) ? "Even" : "odd";
        System.out.println("number"+"is"+m1);


    }

    public static void main(String[] args) {
        even();
    }

}
