/**
 * Escribir un programa Java para calcular el máximo común divisor (mcd) de dos 
 * números enteros por el algoritmo de Euclides:
 * 
 * "Dividir el payor de los dos enteros positivos por el más pequeño. A continuación
 * dividir el nº más pequeño (divisor) por el resto. Continuar el proceso de dividir
 * último divisor por el último resto hasta que la división sea exacta. El último
 * divisor (que también es el último resto no nulo) es el mcd.
 * 
 */
package com.fabian.t2_tarea2;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Ejercicio5MCDEuclides {

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    /**
     * En primer lugar, se guarda el número mayor en el dividendo y el número menor
     * en el divisor. A continuación, se abre un bucle para realizar el MCD, de
     * forma que mientras el resto no sea igual a 0, se continuarán realizando
     * las operaciones. 
     */
    
    int numero1, numero2;       //Numeros a introducir
    int numMayor=0, numMenor=0; //Numeros mayores
    int divisor=0, dividendo=0; 
    int resto;
    
    System.out.print("Introduzca el primer numero: ");
    numero1 = teclado.nextInt();
    
    System.out.print("Introduzca el segundo numero: ");
    numero2= teclado.nextInt();
    
    if (numero1 >= numero2){numMayor=numero1; numMenor=numero2;}
    else {numMayor=numero2; numMenor=numero1;}
    
    
    dividendo=numMayor;
    divisor=numMenor;
    
    if (dividendo==0 || divisor==0){
        System.out.print("Los numeros introducidos no son correctos.");
    }
    
    
    
    else{
        resto=dividendo%divisor;
    do{
        divisor=resto;      
        resto=dividendo%divisor;
        dividendo=divisor;       
    }
      while(resto!=0); 
    System.out.print("El Maximo Comun Divisor es: " + divisor);
    
      
        
    }}
    
}
