package matriz;

import java.util.Scanner;
//Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24h
//onde para cada uma destas 24h podemos associar uma tarefa específica (compromisso agendado). O programa deve ter um
//menu  onde o usuario indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então,
//o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
public class ExerciseThirtyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        boolean sair = false;
        byte opcao;
        while (!sair) {
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = sc.nextByte();

            if (opcao == 1) {//adicionar compromisso

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = sc.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do mês");
                    hora = sc.nextInt();
                    if (hora > 0 && hora <= 31) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválidax, digite novamente");
                    }
                }
                dia--;
                System.out.println("Digite o compromisso");
                compromissos[dia][hora] = sc.next();

            } else if (opcao == 2) { //verificar compromisso

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = sc.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do mês");
                    hora = sc.nextInt();
                    if (hora > 0 && hora <= 31) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválidax, digite novamente");
                    }
                }
                dia--;
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[dia][hora]);

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção invalida, digite novamente");
            }
        }
    }
}
