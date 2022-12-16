package Aula02;

import java.util.Scanner;

public class Ex03_MenorNumero {

    public static void calcularMenorNumero() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double first = sc.nextDouble();

        System.out.print("Insira o segundo número: ");
        double second = sc.nextDouble();

        System.out.print("Insira o terceiro número: ");
        double third = sc.nextDouble();

        System.out.println("O menor número é: " + lowerNumber (first, second, third) );

    }
    public static double lowerNumber (double first, double second, double third) {

        return Math.min (first, (Math.min(second, third)));
    }
}
