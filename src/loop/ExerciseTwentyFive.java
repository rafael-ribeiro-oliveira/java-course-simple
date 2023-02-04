package loop;

import java.util.Scanner;
//altere o programa anterior permitindo ao usuario informar as populações e as taxas de crescimento iniciais.
//Valide a entrada e permita repetir a operação
public class ExerciseTwentyFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        boolean valido = false;
        do {
            System.out.println("Entre com a população A: ");
            popA = scan.nextDouble();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("A população A precisa ser maior que 0");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a população B: ");
            popB = scan.nextDouble();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("A população B precisa ser maior que 0");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento A: ");
            taxaA = scan.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("A taxa de crescimento A precisa ser maior que 0");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento B: ");
            taxaB = scan.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("A taxa de crescimento B precisa ser maior que 0");
            }
        } while (!valido);

        int i = 0;

        while (popA < popB) {

            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            i++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade anos: " + i);
    }
}