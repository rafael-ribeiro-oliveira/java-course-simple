package ifElseSwitch;

import java.util.Scanner;

public class ExerciseTwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite M - matutino, V - vespertino, N - noturno");
        var turno = sc.next().charAt(0);

        if(turno == 'm' || turno == 'M') {
            System.out.println("\n Bom dia!");
        } else if(turno == 'v' || turno == 'V') {
            System.out.println("\n Boa Tarde!");
        } else if(turno == 'n' || turno == 'N') {
            System.out.println("\n Boa Noite!");
        } else {
            System.out.println("\n Valor invalido");
        }

    }
}
