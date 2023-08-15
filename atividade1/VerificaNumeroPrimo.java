package atividade1;
import java.util.Scanner;

public class VerificaNumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.print(numero + " não é primo, pois é divisível por: ");
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " | ");
                }
            }
            
        }

        scanner.close();
    }
}
