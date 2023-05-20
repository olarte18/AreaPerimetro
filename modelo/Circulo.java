package modelo;

public class Circulo extends Figura{
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }

    public void calcular(){
        double pi=3.1416;
        area = pi* Math.pow(radio, 2);
        perimetro = 2 * pi * radio;
        ;
        
    }
}
