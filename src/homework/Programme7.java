package homework;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {


        Scanner m2 = new Scanner(System.in);
        System.out.println("Enter Seller Name: ");
        String name = m2.nextLine();
        System.out.println("Enter Seller ID: ");
        int sellerID = m2.nextInt();
        System.out.println("Enter Sales Amount: ");
        int salesAmount = m2.nextInt();
        System.out.println("Enter Basic Salary: ");
        int basicSalary = m2.nextInt();

        Programme7 salesCommission = new Programme7();
        int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller name is            : " + name);
        System.out.println("Seller id is              : " + sellerID );
        System.out.println("Seller's sales amount is  : " + salesAmount);
        System.out.println("Seller's basic salary is  : " + basicSalary);
        System.out.println("Seller's gross salary is  : " + grossSalary);

        m2.close();
    }

    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }

}


