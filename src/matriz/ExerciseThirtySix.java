package matriz;

//Faça um programa para jogar o jogo da velha. O progrmaa deve permitir que dois jogadores façam uma partida do jogo da
//velha, usando o computador para ver a posição onde deseja colocar a sua peça ('O' ou 'X'). O programa deve impedir
//jogadas inválidas e determinar automáticamente quando o jogo terminou e quem foi o vencedor (jogador 1 ou jogador 2).
//A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.

import java.util.Scanner;

public class ExerciseThirtySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] jogo = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if (jogada % 2 == 1) { //jogador 1
                System.out.println("Vez do jogador 1. Escolha linha e coluna(1-3).");
                sinal = 'X';
            } else {

                System.out.println("Vez do jogador 2. Escolha linha e coluna(1-3).");
                sinal = 'O';
            }
            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = sc.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada invalida, tente novamente");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna (1, 2 ou 3)");
                coluna = sc.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada invalida, tente novamente");
                }
            }
            linha--;
            coluna--;
            if (jogo[linha] [coluna] == 'X' || jogo[linha] [coluna] == 'O') {
                System.out.println("Posição ja usada, tente novamente");
            } else { //Jogada Válida
                jogo [linha] [coluna] = sinal;
                jogada++;
            }

            //imprimir tabuleiro
            for (int i = 0; i < jogo.length; i++) {
                for (int j = 0; j < jogo[i].length; j++) {
                    System.out.print(jogo[i][j] + " | ");
                }
                System.out.println();
            }
            //Verifica se tem ganhador
            if ((jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X') || //linha 1
            (jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X') ||     //linha 2
            (jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') ||     //linha 3
            (jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') ||     //coluna 1
            (jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') ||     //coluna 2
            (jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') ||     //coluna 3
            (jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X')) {     //diagonal
            ganhou = true;
                System.out.println("PARABENS JOGAR 1 venceu");
    } else if ((jogo[0] [0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O') || //linha 1
            (jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O') ||     //linha 2
            (jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O') ||     //linha 3
            (jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O') ||     //coluna 1
            (jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O') ||     //coluna 2
            (jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O') ||     //coluna 3
            (jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O')) {     //diagonal
                    ganhou = true;
                    System.out.println("PARABENS JOGAR 2 venceu");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Ninguem venceu esta partida");
            }
        }
    }
}
