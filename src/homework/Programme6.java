package homework;

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value to check odd or even number");
        int number =sc.nextInt();
        Programme6 oddEven=new Programme6();
        System.out.println(number + "is"+oddEven.isItEvenorOddNumber(number)+"number");
        sc.close();
    }
    public String isItEvenorOddNumber(int number){
        if (number % 2==0){
            return "Even";
        }else{
            return "odd";
        }
    }
}
