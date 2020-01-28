/**
* Escribe un programa para calcular el factorial de un número. Hazlo usando primero
* un ciclo (while) y de nuevo usando un ciclo (for). La forma de hacerlo la hemos
* tratado en los contenidos de este bloque.
*/
package com.fabian.t2_tarea2;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Ejercicio2Factorial {

    public static void main(String[] args) {
        
        int numero;             //Numero a factorizar
        int numeroPrograma;     //Numero para acceder el programa
        int factorial;          //Variable para guardar los números de la operación
        int resultado=1;        //Variable para guardar el resultado
        
       Scanner teclado = new Scanner (System.in);
       
/**
 * El programa solicita usar dos tipos de estructuras repetitivas, por lo que se
 * usará switch para acceder a una o a otra, siendo que al introducir 1 se usará
 * while y al introducir 2 se usará for, por lo que, justo antes del switch, se 
 * usará do-while para que repita la solicitud del número en caso de escribir uno
 * incorrecto.
 */
       
       do{
       
       System.out.print("Pulse 1 si desea usar el ciclo \"While\" y 2 si desea"
               + " usar el ciclo \"For\": ");
               
       numeroPrograma = teclado.nextInt();
       
       
       switch (numeroPrograma){
               case 1:         
       System.out.print("Introduzca numero a factorizar: ");
       numero = teclado.nextInt();
       factorial = 1;
       
       while (numero != 0){

           factorial = factorial * numero;
           numero--;
       }
       
       System.out.print(""+ factorial);
       
       break;
       
       
               case 2:
       System.out.print("Introduzca numero a factorizar: ");
       numero = teclado.nextInt();
       
       for (factorial=1; numero != 0; numero--){
           
           factorial = factorial * numero;}
       
       System.out.print(""+ factorial);   
       break;
       }
       
       }
       while ((numeroPrograma <1) || (numeroPrograma>2)); 
                    //Se repite el bucle en caso de introducir numero incorrecto de programa
    }
}
