package com.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somaTest(){
        Calculadora calc = new Calculadora();
        int soma = calc.soma(10, 35);
        Assertions.assertEquals(45, soma);
    }

    @Test
    public void subtrairTest(){
        Calculadora calc = new Calculadora();
        int subtrair = calc.subtrair(10, 35);
        Assertions.assertEquals(-25, subtrair);
    }
    
}
