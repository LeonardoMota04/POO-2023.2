package Aula02.Teste;

import Aula02.Calculadora.Calculadora;

public class Teste {

    public static void main (String[] args){
        Calculadora calc01 = new Calculadora();
        Calculadora calc02 = new Calculadora();

        calc01.a = 3;
        calc01.b = 5;
        System.out.println(calc01.somar()); 


        calc02.a = 6;
        calc02.b = 10;
        calc02.somar();
        System.out.println(calc02.somar());

    }
    
}