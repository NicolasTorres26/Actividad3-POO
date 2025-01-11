/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author betid
 */
public class Rombo {
    int lado,diagonalmenor,diagonalmayor;
    
    Rombo(int lado, int diagonalmenor, int diagonalmayor){
        this.lado = lado;
        this.diagonalmayor = diagonalmayor;
        this.diagonalmenor = diagonalmenor;
    }
    
    int calcularArea(){
        return 4*lado;
    }
    
    int calcularPerimetro(){
        return (diagonalmenor*diagonalmayor)/2;
    }
}
