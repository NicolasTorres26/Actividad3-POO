/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo4_22;

/**
 *
 * @author betid
 */
public class Empleado {
    String nombre;
    double salario;
    double num_horas;
    
    public Empleado(String nombre, double salario_basico,double num_horas){
        this.nombre=nombre;
        this.salario=salario_basico;
        this.num_horas=num_horas;
    }
    
    double calcularSalario(){
        return salario*num_horas;
    }
}
