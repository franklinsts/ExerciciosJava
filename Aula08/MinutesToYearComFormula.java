package Aula08;

import java.util.Scanner;

public class MinutesToYearComFormula {
    public static void convertToYear(){

        Scanner sc = new Scanner (System.in);
        System.out.print("Quantos minutos deseja converter? ");
        double min = sc.nextDouble();

        double minutesInYear = 60 * 24 * 365;

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " mins são aprox. " + years + " anos e " + days + " dias");
    }
}