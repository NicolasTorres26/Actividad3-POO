/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo3_19;

/**
 *
 * @author betid
 */
public class TEquilatero {
    int lado;
    TEquilatero(int lado){
        this.lado=lado;
        
    }
    double calcularArea(){
        return (Math.pow(lado,2)*Math.sqrt(3))/4;
    }
    
    double calcularPerimetro(){
        return 3*lado;
    }
    double calcularAltura(){
        return (Math.sqrt(3)*lado)/2;
    }
}
