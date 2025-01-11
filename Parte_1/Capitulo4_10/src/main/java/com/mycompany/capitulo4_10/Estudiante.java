/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo4_10;

/**
 *
 * @author betid
 */
public class Estudiante {
    String num_incripcion;
    String nombres;
    double patrimonio;
    int estrato;
    
    public Estudiante(String num,String nombre,double patrimonio,int estrato){
        this.nombres=nombre;
        this.num_incripcion=num;
        this.patrimonio=patrimonio;
        this.estrato=estrato;
    }
    
    double calcularMatricula(){
        double valor_matricula=50000;
        if (patrimonio>2000000 && estrato>3){
            valor_matricula=valor_matricula+0.03*patrimonio;
        }
        return valor_matricula;
    }
    
    
    
}
