package prograi;

import java.util.Scanner;

public class PrograI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //System.out.println("Hola Mundo con Java");
  Scanner sc= new Scanner(System.in);
Calculadora calculadora1=new Calculadora();
        //System.out.println(calculadora1.sumar(5, 10));

       /* Calculadora otraCalculadora = new Calculadora();
        
        System.out.println(otraCalculadora.sumar(8, 9));
        System.out.println(otraCalculadora.restar(10, 3));
        System.out.println(otraCalculadora.multiplicar(5, 3));
        System.out.println(otraCalculadora.getMarca());
        System.out.println(otraCalculadora.getTipo());
        System.out.println(otraCalculadora.getAnchoPantalla());
        
        System.out.println("Ingrese el color de la calculadora");
        String valorRecibido = sc.nextLine(); */

       
       CalculadoraEspecial calculadoraE = new CalculadoraEspecial ();
       System.out.println("Ingrese el primer numero a operar");
        double primerNumero = sc.nextDouble();
       System.out.println("Ingrese el primer numero a operar");
        double segundoNumero = sc.nextDouble(); 
       
       /**System.out.println(calculadoraE.mathCeil(operador1));// entero más cercano por arriba.
       System.out.println(calculadoraE.mathFloor(operador2)); // entero más cercano por debajo.
       System.out.println(calculadoraE.mathPow(operador1, operador2)); //potencia 
       System.out.println(calculadoraE.mathMax(operador1, operador2)); // mayor 
       System.out.println(calculadoraE.mathSqrt(operador1)); // raiz cuadrada 
       
       System.out.println(calculadoraE.sumar(operador1, operador2));
       System.out.println(calculadoraE.restar(operador1, operador2));
       System.out.println(calculadoraE.multiplicar(operador1, operador2));
       System.out.println(calculadoraE.dividir(operador1, operador2));**/
        
     
       calculadoraE.sumar(primerNumero, segundoNumero);
       calculadoraE.restar(primerNumero, segundoNumero);
       calculadoraE.multiplicar(primerNumero, segundoNumero);
       calculadoraE.dividir(primerNumero, segundoNumero);
       
       calculadoraE.mathCeil(primerNumero);
       calculadoraE.mathCeil(primerNumero);
       calculadoraE.mathPow(primerNumero, segundoNumero);
       calculadoraE.mathMax(primerNumero, segundoNumero);
       calculadoraE.mathSqrt(primerNumero);
    
       calculadoraE.mostrarTransacciones();        



    }
}