/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author betid
 */
public class TrianguloRectangulo {

    int base; // Atributo que define la base de un triángulo rectángulo
    int altura; // Atributo que define la altura de un triángulo rectángulo

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca al
método calcular hipotenusa */
    }
    double calcularHipotenusa() {
return Math.pow(base*base + altura*altura, 0.5);
}

    
    String determinarTipoTriángulo() {
        String resultado;
        if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa())){
            resultado = "Es un triangulo equilatero";
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            resultado = "Es un triángulo escaleno";
        } else {
            resultado = "Es un triángulo isósceles";
        }
       return resultado;
    }
    
    void DeterminarTipoTriangulo(){
        if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa())){
            System.out.println("Es un triangulo equilatero");
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }
}
