package Figuras;

public class Triangulo {

    public double base;
    public double altura;
    public double lado1;
    public double lado2;
    public double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double ladoo3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = ladoo3;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }
}