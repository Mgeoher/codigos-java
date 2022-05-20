package prograi;

import static java.lang.Math. *; 

public class CalculadoraEspecial extends Calculadora{
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
    
    
    
     public double mathCeil (double primerNumero){
         double resultado = Math.ceil(primerNumero);
         this.registrarTransaccion("entero más cercano por arriba.", primerNumero, resultado, resultado);
        return resultado;
     }
     public double mathFloor (double segundoNumero){
         double resultado = Math.floor (segundoNumero);
         this.registrarTransaccion("entero más cercano por debajo.", segundoNumero, resultado, resultado);
         return resultado;
     }
     public double mathPow (double primerNumero, double segundoNumero){
         double resultado = Math.pow (primerNumero, segundoNumero);
        this.registrarTransaccion("Potencia", primerNumero, segundoNumero, resultado);
        return resultado;
        
     }
    public double mathMax (double primerNumero, double segundoNumero){
         double resultado = Math.max (primerNumero, segundoNumero);
        this.registrarTransaccion("Mayor", primerNumero, segundoNumero, resultado);
        return resultado;
         
     }
    public double mathSqrt (double primerNumero){
        double resultado = Math.sqrt(primerNumero);
         this.registrarTransaccion("raiz cuadrada", primerNumero, resultado, resultado);
        return resultado;
    }
    
    
    
    }
    
