package matriz;

import java.util.Random;
import java.util.Scanner;

public class ExerciseThirtyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numAleatorios = new int[10][10];

        int i, j;

        Random numeroRandom = new Random();

        for (i = 0; i < numAleatorios.length; i++) {
            for (j = 0; j < numAleatorios[i].length; j++) {
                numAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        for (i = 0; i < numAleatorios.length; i++) {
            for (j = 0; j < numAleatorios[i].length; j++) {
                System.out.print(numAleatorios [i] [j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;
        for (i = 0; i < numAleatorios[linha5].length; i++) {
            if (numAleatorios[linha5][i] > maiorL5) {
                maiorL5 = numAleatorios[linha5][i];
                }
            if (numAleatorios[linha5][i] < menorL5) {
                menorL5 = numAleatorios[linha5][i];

            }
        }

            System.out.println("Maior valor da linha 5: " + maiorL5);
            System.out.println("Menor valor da linha 5: " + menorL5);

        int maiorC7 = 0;
        int menorC7 = 101;
        int col7 = 7;
        for (i = 0; i < numAleatorios[col7].length; i++) {
            if (numAleatorios[col7][i] > maiorC7) {
                maiorC7 = numAleatorios[col7][i];
            }
            if (numAleatorios[col7][i] < menorC7) {
                menorC7 = numAleatorios[col7][i];

            }
        }
        System.out.println("Maior valor da coluna 7: " + maiorC7);
        System.out.println("Menor valor da coluna 7: " + menorC7);
            }

        }
