package com.eduardo;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        String sexo;
        float peso;
        float altura;


        Scanner ler = new Scanner(System.in);

        System.out.println("\nDigite seu sexo: ");
        sexo = ler.next();

        System.out.println("\nDigite seu peso: ");
        peso = ler.nextFloat();

        System.out.println("\nDigite sua altura: ");
        altura = ler.nextFloat();

        ler.close();

        Pessoa pessoa1 = new Pessoa(sexo, peso, altura);

        
        System.out.println("\n\n" + pessoa1.calcularImc() + "\n\n");
    }
}
