package prograi;
public class PrograI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //System.out.println("Hola Mundo con Java");
  
Calculadora calculadora1=new Calculadora();
        //System.out.println(calculadora1.sumar(5, 10));

        Calculadora otraCalculadora = new Calculadora();
        
        /*System.out.println(otraCalculadora.sumar(8, 9));
        System.out.println(otraCalculadora.restar(10, 3));
        System.out.println(otraCalculadora.multiplicar(5, 3));*/
        //System.out.println(otraCalculadora.getMarca());
        //System.out.println(otraCalculadora.getTipo());
        //System.out.println(otraCalculadora.getAnchoPantalla());
        //Scanner sc= new Scanner(System.in);
       // System.out.println("Ingrese el color de la calculadora");
        //String valorRecibido = sc.nextLine();

        /*otraCalculadora.setColor(valorRecibido);
        System.out.println("El color de la calculadora es: " + otraCalculadora.getColor());
        otraCalculadora.setColor("Azul");
        System.out.println("El color de la calculadora es: " + otraCalculadora.getColor());*/

        /*CalculadoraEspecial calculadoraNueva = new CalculadoraEspecial();
        System.out.println(calculadoraNueva.getTipoCalculadora());

        CalculadoraEspecial calculadora4 = new CalculadoraEspecial("Calculadora del mundo de a 3");
        System.out.println(calculadora4.getTipoCalculadora());
        
        CalculadoraEspecial calculadora5 = new CalculadoraEspecial("Calculadora del Bazar Chino", 100);
        System.out.println(calculadora5.getTipoCalculadora() + " con " + calculadora5.getNumeroDeTeclas()+ " teclas");*/
        
        CalculadoraEspecial calculadoraE = new CalculadoraEspecial (); 
        double operador1=25.5;
        double operador2=15.21;
        
       /* System.out.println(Math.ceil(operador1)); 
        System.out.println(Math.floor(operador2)); 
        System.out.println(Math.pow(operador1, operador2)); 
        System.out.println(Math.max(operador1, operador2)); 
        System.out.println(Math.sqrt(operador1)); */
        
       System.out.println(calculadoraE.mathCeil(operador1));// entero más cercano por arriba.
       System.out.println(calculadoraE.mathFloor(operador2)); // entero más cercano por debajo.
       System.out.println(calculadoraE.mathPow(operador1, operador2)); //potencia 
       System.out.println(calculadoraE.mathMax(operador1, operador2)); // mayor 
       System.out.println(calculadoraE.mathSqrt(operador1)); // raiz cuadrada
       
        



    }
}