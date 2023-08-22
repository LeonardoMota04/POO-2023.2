package atividade2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha a direção da conversão (C para Celsius -> Fahrenheit, F para Fahrenheit -> Celsius): ");
        char choice = scanner.next().charAt(0);

        double temperature, convertedTemperature;

        if (choice == 'C' || choice == 'c') {
            System.out.print("Digite a temperatura em Celsius: ");
            temperature = scanner.nextDouble();
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + convertedTemperature);
        } else if (choice == 'F' || choice == 'f') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperature = scanner.nextDouble();
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println("Temperatura em Celsius: " + convertedTemperature);
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}
