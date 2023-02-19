    package matriz;

    import java.util.Random;
    import java.util.Scanner;


    //Gere e imprima uma matriz M 4x4 com valores aleatórios entre
    //0-9. Após isso determine o maior número da matriz e a sua posição (linhas e coluna)
    public class ExerciseThirtyOne {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] numerosAleatorios = new int[4][4];

            int i, j;

            Random numeroRamdom = new Random();

            for (i = 0; i < numerosAleatorios.length; i++) {
                for (j = 0; j < numerosAleatorios[i].length; j++) {
                    numerosAleatorios[i][j] = numeroRamdom.nextInt(100);
                }

            }
            int maior = 0;
            int linha = 0;
            int col = 0;
            for (i = 0; i < numerosAleatorios.length; i++) {
                for (j = 0; j < numerosAleatorios[i].length; j++) {
                    if (numerosAleatorios[i][j] > maior) {
                        maior = numerosAleatorios[i][j];
                        linha = j;
                        col = j;
                    }

                }
            }
            for (i = 0; i < numerosAleatorios.length; i++) {
                for (j = 0; j < numerosAleatorios[i].length; j++) {
                    System.out.print(numerosAleatorios [i] [j] + " ");
            }
                System.out.println();
                }


            System.out.println("Maior valor: " + maior);
            System.out.println("Linha: " + linha);
            System.out.println("Coluna: " + col);
            }
    }
