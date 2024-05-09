import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menorQue21 = 0;
        int maiorQue50 = 0;

        System.out.println("Digite as idades das pessoas (digite uma idade negativa para encerrar):");

        int idade;

        do {
            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();

            if (idade >= 0) {
                if (idade < 21) {
                    menorQue21++;
                } else if (idade > 50) {
                    maiorQue50++;
                }
            }

        } while (idade >= 0);

        System.out.println("Total de pessoas com menos de 21 anos: " + menorQue21);
        System.out.println("Total de pessoas com mais de 50 anos: " + maiorQue50);

        scanner.close();
    }
}
