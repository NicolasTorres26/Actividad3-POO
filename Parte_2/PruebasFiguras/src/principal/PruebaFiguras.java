/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author betid
 */
public class PruebaFiguras {
    public static void main(String args[]) {
    Circulo figura1 = new Circulo(2);
    Rectangulo figura2 = new Rectangulo(1,2);
    Cuadrado figura3 = new Cuadrado(3);
    TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    Rombo figura5 = new Rombo(2,4,5);
    Trapecio figura6 = new Trapecio(2,7,6,2);
    System.out.println("El area del círculo es = " + figura1.Area());
    System.out.println("El perímetro del círculo es = " + figura1.Perimetro());
    System.out.println();
    System.out.println("El área del rectángulo es = " + figura2.calcularArea());
    System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
    System.out.println();
    System.out.println("El área del cuadrado es = " + figura3.calcularArea());
    System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro());
    System.out.println();
    System.out.println("El área del triángulo es = " + figura4.calcularArea());
    System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro());
    figura4.determinarTipoTriángulo();
    System.out.println("");
    System.out.println("El area del rombo es = " + figura5.calcularArea());
    System.out.println("El perimetro del rombo es = " + figura5.calcularPerimetro());
    System.out.println("");
    System.out.println("El area del trapecio es = " + figura6.calcularArea());
    System.out.println("El periemtro del trapecio es = " + figura6.calcularPerimetro());
    }
}
