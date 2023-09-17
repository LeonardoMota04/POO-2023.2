package atividade5;

// Classe base Veiculo
class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    // Construtor
    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    // Métodos comuns
    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    public void frear() {
        System.out.println("O veículo está freando.");
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}

// Subclasse Carro
class Carro extends Veiculo {
    private int numeroPortas;

    // Construtor
    public Carro(String marca, String modelo, int anoFabricacao, int numeroPortas) {
        super(marca, modelo, anoFabricacao);
        this.numeroPortas = numeroPortas;
    }

    // Método personalizado para Carro
    public void ligarArCondicionado() {
        System.out.println("Ar-condicionado ligado no carro.");
    }

    // Getter para numeroPortas
    public int getNumeroPortas() {
        return numeroPortas;
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    private boolean possuiBau;

    // Construtor
    public Moto(String marca, String modelo, int anoFabricacao, boolean possuiBau) {
        super(marca, modelo, anoFabricacao);
        this.possuiBau = possuiBau;
    }

    // Método personalizado para Moto
    public void fazerManobras() {
        System.out.println("Realizando manobras com a moto.");
    }

    // Getter para possuiBau
    public boolean isPossuiBau() {
        return possuiBau;
    }
}

// Subclasse Bicicleta
class Bicicleta extends Veiculo {
    private int numMarchas;

    // Construtor
    public Bicicleta(String marca, String modelo, int anoFabricacao, int numMarchas) {
        super(marca, modelo, anoFabricacao);
        this.numMarchas = numMarchas;
    }

    // Método personalizado para Bicicleta
    public void pedalar() {
        System.out.println("Pedalando a bicicleta.");
    }

    // Getter para numMarchas
    public int getNumMarchas() {
        return numMarchas;
    }
}



