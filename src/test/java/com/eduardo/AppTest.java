package com.eduardo;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void abaixoDoPeso()
    {
        Pessoa pessoa = new Pessoa("masculino", 74.726f, 1.90f);
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    public void noPesoNormal()
    {
        Pessoa pessoa = new Pessoa("masculino", 95.303f, 1.90f);
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    public void marginalmenteAcimaDoPeso()
    {
        Pessoa pessoa = new Pessoa("masculino", 100.357f, 1.90f);
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    public void acimaDoPesoIdeal()
    {
        Pessoa pessoa = new Pessoa("masculino", 112.270f, 1.90f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    public void obeso()
    {
        Pessoa pessoa = new Pessoa("masculino", 112.271f, 1.90f);
        assertEquals("obeso", pessoa.calcularImc());
    }
}
