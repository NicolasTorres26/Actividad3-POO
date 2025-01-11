/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo4_23;

/**
 *
 * @author betid
 */
public class Ecuacion {
    private double a,b,c;
    public Ecuacion(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    double Discriminante(){
        return Math.pow(b,2)-4*a*c;
    }
    
    
}
