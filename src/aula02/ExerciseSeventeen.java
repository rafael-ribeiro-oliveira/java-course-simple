package aula02;

import java.util.Scanner;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra a, e, i, o, u (vogal): ");
        var letra = scan.next();

        // Outras formas que podem ser usadas

//        if ("a".equalsIgnoreCase(letra) ||
//                "e".equalsIgnoreCase(letra) ||
//                "i".equalsIgnoreCase(letra) ||
//                "o".equalsIgnoreCase(letra) ||
//                "u".equalsIgnoreCase(letra)) {
//        System.out.println("é uma vogal: ");
//    } else {
//        System.out.println("é uma consoante: ");
//    }

//      entre "" neste caso não precisa utilizar vígula e espaçamento (pode ser utilizado)
//      if ("aeiou".contains(letra))
//        System.out.println("é uma vogal: ");
//        } else {
//                System.out.println("é uma consoante: ");
//        }
//        Usando toLowerCase() para forçar as letras serem minúsculas, assim mesmo que uma letra
//        maiúscula seja digitada essa função a converterá em minúscula

        if ("a e i o u".toLowerCase().contains(letra.toLowerCase())) {
            System.out.println("é uma vogal: ");
        } else {
            System.out.println("é uma consoante: ");
        }
    }
}
