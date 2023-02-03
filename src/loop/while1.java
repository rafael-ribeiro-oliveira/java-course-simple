package loop;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1; //count ou cont
        int max = 10;

        System.out.println("Contando até: " + max);

        while(i < max) {
            System.out.println("O valor de i: " + i);
            i++; // i = i + 1; ou i += 1;
        }
        System.out.println(i);
        }
    }
