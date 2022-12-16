package Aula06;

import java.util.Scanner;

public class Ex08_Matrizes {

    public static void matrizBidimensional (){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura da matriz: ");
        int alt = sc.nextInt();

        System.out.print("Digite a largura da matriz: ");
        int larg = sc.nextInt();



        int[][] matriz = new int[alt][larg];


        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                System.out.print(" " + matriz[i][a]);
            }

            System.out.println();
        }
    }
}
