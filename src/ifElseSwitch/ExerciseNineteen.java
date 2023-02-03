    package ifElseSwitch;
    import java.util.Scanner;

    public class ExerciseNineteen {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int num1, num2, num3;

            System.out.println("Digite o primeiro número: ");
            num1 = scan.nextInt();

            System.out.println("Digite o segundo número: ");
            num2 = scan.nextInt();

            System.out.println("Digite o terceiro número: ");
            num3 = scan.nextInt();

            if (num1 < num2 && num1 < num3) {
                if (num2 < num3) {
                    System.out.printf("%d, %d, %d\n", num3, num2, num1);
                } else {
                    System.out.printf("%d, %d, %d\n", num2, num3, num1);
                }
            } else if (num2 < num3) {
                if (num1 < num3) {
                    System.out.printf("%d, %d, %d\n", num3, num1, num2);
                } else {
                    System.out.printf("%d, %d, %d\n", num1, num3, num2);
                }
            } else if (num1 < num2) {
                System.out.printf("%d, %d, %d\n", num2, num1, num3);
            } else {
                System.out.printf("%d, %d, %d\n", num1, num2, num3);
            }
        }
    }