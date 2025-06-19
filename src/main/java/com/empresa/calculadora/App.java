package com.empresa.calculadora;

public class App {
    public static void main(String[] args) {
        System.out.println("Testando operações da Calculadora:");

        double a = 10.0;
        double b = 2.0;

        System.out.println("Soma: " + Calculadora.somar(a, b));
        System.out.println("Subtração: " + Calculadora.subtrair(a, b));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(a, b));
        System.out.println("Divisão: " + Calculadora.dividir(a, b));
    }
}
