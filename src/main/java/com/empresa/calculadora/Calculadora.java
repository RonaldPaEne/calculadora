package com.empresa.calculadora;

/**
 * Classe utilitária para operações aritméticas básicas.
 */
public final class Calculadora {

    private Calculadora() {
        // Construtor privado: evita instanciação
    }

    /**
     * Retorna a soma de dois valores.
     */
    public static double somar(double a, double b) {
        return a + b;
    }

    /**
     * Retorna a subtração de b em relação a a.
     */
    public static double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Retorna a multiplicação de dois valores.
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Retorna a divisão de a por b.
     * 
     * @throws IllegalArgumentException se b for zero.
     */
    public static double dividir(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Divisão por zero não permitida.");
        }
        return a / b;
    }
}
