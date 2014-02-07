/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {

		int num=0;
		int factorial = 1;
		int numero;
int resul=0;
   		
		numero= Integer.parseInt(args[0].toString());
				
		while(num < numero-1) {
		num++;
		System.out.print(num+"x");
				
		factorial = factorial * num;
		resul =factorial*numero;
				
		}
				
		
		
		
		System.out.println(numero+ "=" +resul);
   		
   		
	
			
		
		
		
      
   }

}