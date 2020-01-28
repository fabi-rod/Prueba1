/**
*1. Realiza un programa que muestre en pantalla el siguente menú:
*
*~~~~~~~~~~~~~~|MENÚ PRINCIPAL|~~~~~~~~~~~~~~
*| 1 - Módulo de Programación |
*| 2 - Módulo de Lenguaje de Marcas |
*| 3 - Módulo de Entorno de Desarrollo |
*| 4 - Módulo de Sistemas Informáticos |
*| 0 - Salir del programa |
*
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*
*y posteriormente se quede a la espera de que el usuario introduzca un valor numérico.
*    •	Si introduce un 0 el programa mostrará un mensaje de despedida, que habrá
*        que confirmar pulsando una tecla y después finalizará
*    •	Se se pulsa un valor comprendido entre 1 y 4 mostrará un mensaje dando la
*        bienvenida al Modulo que corresponda y pedirá pulsar una tecla tras lo cual
*        finalizará. System.exit(0);
*    •	Si se pulsa cualquier otra cosa el programa volverá a mostrar el menú.
*/
package com.fabian.t2_tarea2;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Ejercicio1Menu {

    public static void main(String[] args) {
       
        System.out.println("Prueba GIT");
        System.out.println("Prueba GIT 2");
        System.out.println("Prueba GIT 3");
        System.out.println("4");

        int valorNumerico;      //Valor a introducir que entrará en el módulo correspondiente
        int valorVacio = 0;     //Valor a que se usará para salir del programa
        
        Scanner teclado = new Scanner (System.in);
/**
 * Se usará do-while para que cada vez que se escriba un número mal, se vuelva a 
 * mostrar el menú y vuelva a solicitar un número.
 */
        
        do{
        
        System.out.println("~~~~~~~~~~~~~~|MENÚ PRINCIPAL|~~~~~~~~~~~~~~");
        System.out.println("| 1 - Módulo de Programación |");
        System.out.println("| 2 - Módulo de Lenguaje de Marcas |");       
        System.out.println("| 3 - Módulo de Entorno de Desarollo |");
        System.out.println("| 4 - Módulo de Sistemas Informáticos |");
        System.out.println("| 0 - Salir del programa |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.print("Introduzca un valor numérico: ");
    
            valorNumerico = teclado.nextInt();
        
           
/**
 * Se usará switch con el valorNumerico y cada caso será el número a introducir
 * para acceder a cada módulo y nos de el mensaje de bienvenida.
 */        
        
            
        switch (valorNumerico){
            case 0:
             System.out.println("Ha salido del programa. Hasta luego!");
             System.out.println("Pulse una tecla para salir");
             valorVacio = teclado.nextInt();
             break;
           
            case 1:
             System.out.println ("Bienvenido al Módulo de Programación");
             System.out.println ("Pulse una tecla para salir");
             valorVacio = teclado.nextInt();
             break;
            
            case 2:
             System.out.println ("Bienvenido al Módulo de Lenguaje de Marcas");
             System.out.println ("Pulse una tecla para salir");
             valorVacio = teclado.nextInt(); 
             break;
             
            case 3:
             System.out.println ("Bienvenido al Módulo de Entornos de Desarrollo");
             System.out.println ("Pulse una tecla para salir");
             valorVacio = teclado.nextInt();
             break;
            
            case 4:
             System.out.println ("Bienvenido al Módulo de Sistemas Informáticos");
             System.out.println ("Pulse una tecla para salir");
             valorVacio = teclado.nextInt();
             break;
             
        } 
         
        
    }  
    while (valorNumerico<0 || valorNumerico>4);}
}
