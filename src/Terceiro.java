import java.util.Scanner;

public class Terceiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número inteiro (zero para sair): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);

        System.out.println("A soma dos números positivos digitados é: " + soma);

        scanner.close();
    }
}
