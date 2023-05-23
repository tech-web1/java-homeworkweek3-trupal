package homework;

import java.util.Scanner;

public class Programme5 {
    String basicsalary;
    public static void main(String[] args) {
        Scanner m1=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name =m1.nextLine();

        System.out.println("Enter your EmployeeId:");
        int employeeId =m1.nextInt();

        double basicSalary = 25000;
        double hra =calculateHRA(basicSalary);


        double da = calculateDA(basicSalary);
        double ta = calculateTa(basicSalary);
        double pf = calculatePF(basicSalary);

        double grossSalary=basicSalary+hra+da+ta+pf;
        System.out.println("---------------------------------------");
        System.out.println("|          Salary Slip                 |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Employee Id:"+employeeId+"            |");
        System.out.println("|Employee Name: "+name+"                |");
        System.out.println("|---------------------------------------|");
        System.out.println("|Basic Salary: "+basicSalary+"          |");
        System.out.println("|HRA 10%     :  "+hra+"                 |");
        System.out.println("|TA   8%     :  "+ta+"                  |");
        System.out.println("|DA   9%     :  "+da+"                  |");
        System.out.println("|PF- 20%     :  "+pf+"                  |");
        System.out.println("-----------------------------------------");
        System.out.println("|Gross salary: "+grossSalary+"          |");
        System.out.println("|---------------------------------------|");
        m1.close();
    }
    public static double calculateHRA(double basicsalary){return (basicsalary *10)/100;}
    public static double calculateDA(double basicsalary){return (basicsalary *8)/100;}
    public static double calculateTa(double basicsalary){return (basicsalary *9)/100;}
    public static double calculatePF(double basicsalary){return (basicsalary *20)/100;}


}
