package app;

import java.util.Scanner;

public class Main {

    public static double miles = 0.621371192;

    public static void main(String[] args){
        System.out.println("Convertor distance app");
        Scanner inputKM = new Scanner(System.in);
        System.out.println("Введіть відстань в кілометрах: ");
        int km = inputKM.nextInt();
        System.out.println("Ви ввели " + km + " ки " + " - в мілях це буде " + convertKmtoMiles(km) + " мілі");
        Scanner inputMiles = new Scanner(System.in);
        System.out.println("Введіть відстань в милях: ");
        int mile = inputMiles.nextInt();
        System.out.println("Ви ввели " + mile + " милі " + " - в кілмоетрах це буде " + convertMilesToKm(mile) + " км");
    }
    private static double convertKmtoMiles(int km){
        return km * miles;
    }
    private static double convertMilesToKm(int mile){
        return mile/miles;
    }
}
