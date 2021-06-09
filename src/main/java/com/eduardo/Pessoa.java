package com.eduardo;

public class Pessoa 
{
    private String sexo;
    private float peso;
    private float altura;
    private float imc;


    public Pessoa()
    {
        this.sexo = "";
        this.peso = 0;
        this.altura = 0;
    }

    public Pessoa(String sexo, float peso, float altura)
    {
        setSexo(sexo);
        setPeso(peso);
        setAltura(altura);
    }

    public void setSexo(String sexo)
    {
        if(sexo.equals("masculino") || sexo.equals("feminino"))
            this.sexo = sexo;
        else
        System.out.println("ERRO: campo 'sexo' inserido incorretamente");
    }

    public String getSexo()
    {
        return this.sexo;
    }

    public void setPeso(float peso)
    {
        if(peso > 0.0f)
            this.peso = peso;
        else
            System.out.println("ERRO: campo 'peso' inserido incorretamente");
    }

    public float getPeso()
    {
        return this.peso;
    }

    public void setAltura(float altura)
    {   
        if(altura > 0.0f)
            this.altura = altura;
        else
            System.out.println("ERRO: campo 'altura' inserido incorretamente");
    }

    public float getAltura()
    {
        return this.altura;
    }

    public void setImc()
    {
        this.imc = (this.peso / (this.altura * this.altura));
    }

    public float getImc()
    {
        return this.imc;
    }


    


    public String calcularImc() // 1
    {
        setImc();
        float imc = getImc();
        String sexo = getSexo();
        

        if(sexo.equals("feminino")) // 2
        {
            if(imc < 19.1f) // 3
            {
                return "abaixo do peso";
            }
            else if(imc < 25.8f) // 4
            {
                return "no peso normal";
            }
            else if(imc < 27.3f) // 5
            {
                return "marginalmente acima do peso";
            }
            else if(imc >= 27.3f && imc < 32.3f) // 6
            {
                return "acima do peso ideal";
            }
            else
            {
                return "obeso";
            }
        }

        else if(sexo.equals("masculino")) // 7
        {
            if(imc < 20.7f) // 8
            {
                return "abaixo do peso";
            }
            else if(imc < 26.4f) // 9
            {
                return "no peso normal";
            }
            else if(imc < 27.8f) // 10
            {
                return "marginalmente acima do peso";
            }
            else if(imc < 31.1f) // 11
            {
                return "acima do peso ideal";
            }
            else
            {
                return "obeso";
            }
        }
        return "ERRO: campo 'sexo' incorreto";
    }
}
// complexidade ciclomática = 11