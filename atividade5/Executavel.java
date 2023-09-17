package atividade5;

// Classe Executavel para demonstrar o uso
public class Executavel {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CBR 600", 2021, true);
        Bicicleta bicicleta = new Bicicleta("Trek", "Mountain Bike", 2020, 21);

        // Demonstração de métodos comuns
        carro.acelerar();
        moto.frear();
        bicicleta.acelerar();

        // Demonstração de métodos personalizados
        carro.ligarArCondicionado();
        moto.fazerManobras();
        bicicleta.pedalar();

        // Obtendo informações dos veículos
        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano de Fabricação: " + carro.getAnoFabricacao());
        System.out.println("Número de Portas: " + carro.getNumeroPortas());

        System.out.println("\nInformações da Moto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano de Fabricação: " + moto.getAnoFabricacao());
        System.out.println("Possui Baú: " + moto.isPossuiBau());

        System.out.println("\nInformações da Bicicleta:");
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Ano de Fabricação: " + bicicleta.getAnoFabricacao());
        System.out.println("Número de Marchas: " + bicicleta.getNumMarchas());
    }
}
