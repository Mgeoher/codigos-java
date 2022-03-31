package prograi;

import static java.lang.Math. *; 

public class CalculadoraEspecial {
    private String tipoCalculadora;
    private int numeroDeTeclas;

    CalculadoraEspecial(){
        this.tipoCalculadora="Calculadora Especial";
    }

    CalculadoraEspecial(String tipo){
        this.tipoCalculadora=tipo;
    }
    
    CalculadoraEspecial(String tipo, int cantidad){
        this.tipoCalculadora=tipo;
        this.numeroDeTeclas=cantidad;
    }

    public String getTipoCalculadora() {
        return this.tipoCalculadora;
    }

    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }
     public double mathCeil (double operador1){
        return Math.ceil (operador1);
     }
     public double mathFloor (double operador2){
         return Math.floor (operador2);
     }
     public double mathPow (double operador1, double operador2){
         return Math.pow (operador1, operador2);
     }
    public double mathMax (double operador1, double operador2){
         return Math.max (operador1, operador2);
     }
    public double mathSqrt (double operador1){
        return Math.sqrt(operador1);
    }
    }
    
