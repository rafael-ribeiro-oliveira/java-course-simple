package loop;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1; //count ou cont
        int max = 10;
        // Enquanto ele avalia a expressão e depois executa
        System.out.println("Contando até: " + max);

        while(i <= max) {
            System.out.println("O valor de i: " + i);
            i++; // i = i + 1; ou i += 1;
        }
        System.out.println(i); // Valor de 11

        do {
            i++;   //Faça Enquanto ele executa e depois avalia a expressão (caso a expressão seja
                    // falsa ele não retorna no i++
            System.out.println("Valor de i " + i);
        } while (i < 15);

            System.out.println(i);
    }
}
