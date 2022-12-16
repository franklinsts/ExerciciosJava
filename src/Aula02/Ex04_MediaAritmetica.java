package Aula02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_MediaAritmetica {
    public static void mediaAritmetica() {

        double[] valores = new double[7];
        valores[0] = 1;
        valores[1] = 4;
        valores[2] = 17;
        valores[3] = 7;
        valores[4] = 25;
        valores[5] = 3;
        valores[6] = 100;

        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        System.out.println(total / valores.length);

    }
}