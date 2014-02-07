/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {

		
		System.out.println("limites: "+args[0]+" "+args[1]);
		int num = Integer.parseInt(args[0].toString());
		int num2 = Integer.parseInt(args[1].toString());
		
		for (int i=0; num < num2 -1; i++)
		{
		num ++;
		 System.out.println("numero actual es:"+num );
}
			
      	 
        
      
   }

}