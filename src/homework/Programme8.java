package homework;

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Scanner t1 = new Scanner(System.in);
        System.out.println("Please Enter Alphabet between A to F : ");
        char city = t1.next().charAt(0);
        Programme8 cityName = new Programme8();
        cityName.printCityName(city);
        t1.close();
    }

    public void printCityName(char city){
        if (city == 'A' || city == 'a'){
            System.out.println("Atlanta");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bombay");
        } else if (city == 'C' || city == 'c') {
            System.out.println("California");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Denmark");
        } else if (city == 'E' || city == 'e') {
            System.out.println("El Paso");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Franca");
        } else {
            System.out.println("The Alphabet you have entered is not between A to F ");
        }
    }

}
