package Aula08;

import java.util.Scanner;

public class MinutesConvert2 {
    public static void convertToYear() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos minutos deseja converter? ");
        double min = sc.nextDouble();

        double ano = (min / 525600);
        double dia = (min / 60 / 24) % 365;

        System.out.println((int) ano + " anos e " + (int) dia + " dias");
    }
}
