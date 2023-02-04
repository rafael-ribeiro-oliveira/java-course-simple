    package loop;

    import java.util.Scanner;

    public class ExerciseTwentyThree {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Boolean infoValida = false;
            String nome, sexo, estadoCivil;
            int idade;
            double salario;

            do {
                System.out.println("Digite um nome: ");

                nome = sc.next();

                if (nome.length() > 3) {   //.lenght - A propriedade length tem como responsabilidade retornar a quantidade
                    infoValida = true;     // de caracteres de uma string ou o tamanho de um array.
                } else {                   // Caso a string ou o array esteja vazio, é retornado o valor 0.
                    System.out.println("Nome precisa no mínimo 3 caracteres.");
                    }
                } while (!infoValida);

                infoValida = false;
            do {
                System.out.println("Entre com uma idade: ");

                idade = sc.nextInt();

                if (idade >= 0 && idade <= 150) {
                    infoValida = true;
                } else {
                    System.out.println("Idade precisa ser entre 0 e 150.");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Entre com o salário: ");

                salario = sc.nextDouble();

                if(salario > 0) {
                    infoValida = true;
                } else {
                    System.out.println("Salário precisa ser maior que 0.");
                     }
                } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Ente com o sexo: ");

                sexo = sc.next();

                if (sexo.equalsIgnoreCase("m") ||
                        sexo.equalsIgnoreCase("f")){
                    infoValida = true;
                } else {
                    System.out.println("Sexo precisa ser 'm' ou 'f'.");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Entre com o estado civil: ");

                estadoCivil = sc.next();

                if (estadoCivil.equalsIgnoreCase("s") ||
                        estadoCivil.equalsIgnoreCase("c") ||
                        estadoCivil.equalsIgnoreCase("v") ||
                        estadoCivil.equalsIgnoreCase("d")){
                    infoValida = true;
                } else {
                    System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
                }
            } while (!infoValida);
        }
    }
