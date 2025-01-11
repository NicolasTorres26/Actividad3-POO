/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo3_18;

/**
 *
 * @author betid
 */


public class Empleado {
    private double num_horas, valor_hora, porcentaje;
    private String nombre;
    private String codigo;

    // Constructor
    public Empleado(String nombre, String codigo, double num_horas, double valor_hora, double porcentaje) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.num_horas = num_horas;
        this.valor_hora = valor_hora;
        this.porcentaje = porcentaje;
    }

    // Método para calcular el salario bruto
    public double calcularSalarioBruto() {
        return num_horas * valor_hora;
    }

    // Método para calcular el salario neto
    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - (calcularSalarioBruto() * porcentaje / 100);
    }
}