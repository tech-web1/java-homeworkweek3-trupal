package homework;


import java.util.Scanner;
/*java programme to input any year like (ex.2007)to find leap year

 */
public class Programme2 {
    public static void year(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Input year");
        int year=obj.nextInt();
        boolean a = (year%4)==0;
        boolean b = (year %100)!=0;
        boolean c = (year %100==0)&&(year%400==0);

        if(a && (b||c)){
            System.out.println("is a leap year"+year);
        }
        else{
            System.out.println("is not leap year"+year);

        }
    }

    public static void main(String[] args) {
        Programme2.year();
    }
}
