/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author betid
 */
public class Circulo {
    double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    double Perimetro(){
        return 2*3.14156235*radio;
    }
    
    double Area(){
        return 3.14156235*Math.pow(radio,2);
    }
}
