package loop;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i " + i);
        }
        for (int i = 5; i > 0; i--) {
            System.out.println("Valor de i " + i);
        }
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }
    }
}
