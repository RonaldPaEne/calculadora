package com.empresa.calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Testes da Calculadora")
class CalculadoraTest {

    @Nested
    @DisplayName("Testes de Soma")
    class SomaTests {
        @Test
        @DisplayName("Soma de positivos")
        void somaPositivos() {
            assertEquals(5.0, Calculadora.somar(2.0, 3.0));
        }

        @Test
        @DisplayName("Soma de negativos")
        void somaNegativos() {
            assertEquals(-5.0, Calculadora.somar(-2.0, -3.0));
        }

        @Test
        @DisplayName("Soma com zero")
        void somaComZero() {
            assertEquals(2.0, Calculadora.somar(2.0, 0.0));
        }
    }

    @Nested
    @DisplayName("Testes de Subtração")
    class SubtracaoTests {
        @Test
        @DisplayName("Subtrair positivos")
        void subtrairPositivos() {
            assertEquals(1.0, Calculadora.subtrair(3.0, 2.0));
        }

        @Test
        @DisplayName("Subtrair negativos")
        void subtrairNegativos() {
            assertEquals(1.0, Calculadora.subtrair(-2.0, -3.0));
        }

        @Test
        @DisplayName("Subtrair com zero")
        void subtrairComZero() {
            assertEquals(2.0, Calculadora.subtrair(2.0, 0.0));
        }
    }

    @Nested
    @DisplayName("Testes de Multiplicação")
    class MultiplicacaoTests {
        @Test
        @DisplayName("Multiplicar positivos")
        void multiplicarPositivos() {
            assertEquals(6.0, Calculadora.multiplicar(2.0, 3.0));
        }

        @Test
        @DisplayName("Multiplicar negativos")
        void multiplicarNegativos() {
            assertEquals(6.0, Calculadora.multiplicar(-2.0, -3.0));
        }

        @Test
        @DisplayName("Multiplicar com zero")
        void multiplicarComZero() {
            assertEquals(0.0, Calculadora.multiplicar(2.0, 0.0));
        }
    }

    @Nested
    @DisplayName("Testes de Divisão")
    class DivisaoTests {
        @Test
        @DisplayName("Dividir positivos")
        void dividirPositivos() {
            assertEquals(2.0, Calculadora.dividir(6.0, 3.0));
        }

        @Test
        @DisplayName("Dividir negativos")
        void dividirNegativos() {
            assertEquals(2.0, Calculadora.dividir(-6.0, -3.0));
        }

        @Test
        @DisplayName("Dividir por zero deve lançar exceção")
        void dividirPorZero() {
            IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                    () -> Calculadora.dividir(1.0, 0.0));
            assertEquals("Divisão por zero não permitida.", ex.getMessage());
        }
    }
}
