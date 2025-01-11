/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author betid
 */
public class Trapecio {
    int lado,basemayor,basemenor,altura;
    
    Trapecio(int lado, int basemayor, int basemenor,int altura){
        this.lado = lado;
        this.basemayor = basemayor;
        this.basemenor = basemenor;
        this.altura = altura;
    }
    
    double calcularArea(){
        return (basemenor+basemenor)*altura/2;
    }
    
    int calcularPerimetro(){
        return basemenor + basemayor + 2*lado; 
    }
}
