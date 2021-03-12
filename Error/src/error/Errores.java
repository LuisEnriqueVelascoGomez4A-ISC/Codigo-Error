/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error;

/**
 *
 * @author luis_
 */
class Errores {

    String errorAbsoluto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String errorRelativo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String errorRePorcentual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public class ErroresProg {
    private double valorReal;
    private double valorAproximado;
    
    public ErroresProg(double real, double aproximado){
        this.valorReal = real;
        this.valorAproximado = aproximado;
    }
    
    double errorAbsoluto(){
        double Absoluto = Math.abs(valorAproximado - valorReal);
        return Absoluto;
    }
    
    double errorRelativo(){
        double Relativo = (errorAbsoluto())/valorReal;
        return Relativo;
    }
    
    double errorRePorcentual(){
        double ErPorcentual = (errorRelativo()) * 100;
        return ErPorcentual;
    }
}
}
