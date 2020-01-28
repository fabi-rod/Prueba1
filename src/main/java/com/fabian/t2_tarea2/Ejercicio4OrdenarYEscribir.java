/**
 * Escribe un programa Java para ordenar y escribir, de menor a mayor, cuatro 
 * numeros leidos desde teclado.Primero se escribirán los 4 numeros ordenados y 
 * después se volveran a escribir, pero de forma que si se han escrito dos numeros 
 * iguales, solo se escriba uno.
 * 
 * Por ejemplo, la entrada 7, 3, 7, 3 la salida esperada sería: 3377 y la salida
 * debe ser 3 7.
 */
package com.fabian.t2_tarea2;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Ejercicio4OrdenarYEscribir {

    public static void main(String[] args) {
        
/**
 * En este programa se ha usado la estructura if-else para ordenar los numeros,
 * de manera que se han ido escribiendo, uno a uno, todos los posibles casos de 
 * ordenación de números, guardando en las variables de posición los números de
 * manera ordenada y mostrándolos luego.
 */
 Scanner teclado = new Scanner ( System.in );
         int numero1, numero2, numero3, numero4;        //Números a ordenar
         int primero=0, segundo=0, tercero=0, cuarto=0; //Variables de posición
         
         
         System.out.println ("Introduce el primer numero a ordenar: ");
         numero1 = teclado.nextInt();
         System.out.println ("Introduce el segundo numero a ordenar: ");
         numero2 = teclado.nextInt();
         System.out.println ("Introduce el tercer numero a ordenar: ");
         numero3 = teclado.nextInt();
         System.out.println ("Introduce el ultimo numero a ordenar: ");
         numero4 = teclado.nextInt();
         
         /*
         A continuación de cada línea, se escribirá el orden de los valores en
         formato numérico, para así saber que línea tiene fallo en caso de error
         en orden concreto.
         */

         if(numero1<=numero2 && numero1<=numero3 && numero1<=numero4){   //1-2-3-4
             primero=numero1;
             if(numero2<=numero3 && numero2<=numero4){
                 segundo=numero2;                                        
                 if(numero3<=numero4){
                     tercero=numero3;
                     cuarto=numero4;        
                 }
                 else{                                                  //1-2-4-3 
                     tercero=numero4;
                     cuarto=numero3;
                 }
             }
             
             
             else if(numero3<=numero2 && numero3<=numero4){             //1-3-2-4     
                    segundo=numero3;
                 if(numero2<=numero4){
                     tercero=numero2;
                     cuarto=numero4;
                 }
                 
                 else{                                                  //1-3-4-2
                     tercero=numero4;
                     cuarto=numero2;
                 } 
             }
             
             
             else if(numero4<=numero2 && numero4<=numero3){             //1-4-2-3
                 segundo=numero4;
                 if(numero2<=numero3){
                     tercero=numero2;
                     cuarto=numero3;
                 }
                 else{                                                  //1-4-3-2
                     tercero=numero3;
                     cuarto=numero2;
                 }}            
         }     
         
        else if(numero2<=numero1 && numero2<=numero3 && numero2<=numero4){  //2-1-3-4
                primero=numero2;
             if(numero1<=numero3 && numero1<=numero4){
                 segundo=numero1;
                 if(numero3<=numero4){
                     tercero=numero3;
                     cuarto=numero4;
                 }
                 else{                                                  //2-1-4-3
                     tercero=numero4;
                     cuarto=numero3;          
                 }}
             
             else if(numero3<=numero1 && numero3<=numero4){             //2-3-1-4
                 segundo=numero3;
                 if(numero1<=numero4){
                     tercero=numero1;
                     cuarto=numero4;
                 }
                 else{                                                  //2-3-4-1
                     tercero=numero4;
                     cuarto=numero1;
                 }}
             
             else if(numero4<=numero1 && numero4<=numero3){             //2-4-1-3
                 segundo=numero4;
                 if(numero1<=numero3){
                      tercero=numero1;
                     cuarto=numero3;
                 }
                 else{                                                  //2-4-3-1
                      tercero=numero3;
                     cuarto=numero1;
                 }}  
             }
        
        else if(numero3<=numero2 && numero3<=numero1 && numero3<=numero4){  //3-2-1-4
              primero=numero3;
             if(numero2<=numero1 && numero2<=numero4){
                 segundo=numero2;
                 if(numero1<=numero4){
                      tercero=numero1;
                     cuarto=numero4;
                 }
                 else{                                                  //3-2-4-1
                      tercero=numero4;
                     cuarto=numero1;
                 }}
             else if(numero1<=numero2 && numero1<=numero4){             //3-1-2-4
                 segundo=numero1;
                 if(numero2<=numero4){
                      tercero=numero2;
                     cuarto=numero4;
                 }
                 else{                                                  //3-1-4-2
                      tercero=numero4;
                     cuarto=numero2;
                 }}
             
             else if(numero4<=numero2 && numero4<=numero1){             //3-4-2-1
                 segundo=numero4;
                 if(numero2<=numero1){
                      tercero=numero2;
                     cuarto=numero1;
                 }
                 else{                                                  //3-4-1-2
                      tercero=numero1;
                     cuarto=numero2;
                 }}      
             } 
        
        else if(numero4<=numero2 && numero4<=numero3 && numero4<=numero1){  //4-2-3-1
                primero=numero4;
             if(numero2<=numero3 && numero2<=numero1){
                 segundo=numero2;
                 if(numero3<=numero1){ 
                     tercero=numero3;
                     cuarto=numero1;
                 }
                 else{                                                  //4-2-1-3
                      tercero=numero1;
                     cuarto=numero3;
                 }}
             
             else if(numero3<=numero2 && numero3<=numero1){             //4-3-2-1
                 segundo=numero3;
                 if(numero2<=numero1){
                      tercero=numero2;
                     cuarto=numero1;
                 }
                 else{                                                  //4-3-1-2
                      tercero=numero1;
                     cuarto=numero2;
                 }}
             
             else if(numero1<=numero2 && numero1<=numero3){             //4-1-2-3
                 segundo=numero1;
                 if(numero2<=numero3){
                      tercero=numero2;
                     cuarto=numero3;
                 }
                 else{                                                  //4-1-3-2
                      tercero=numero3;
                     cuarto=numero2;
                 }}            
             }
         
         
         System.out.println (primero+" "+ segundo+" "+ tercero+" "+ cuarto);
/**
 * Una vez mostrados, en el caso de que alguno se repita, usando también la estructura
 * if-else se ha ordenado que cada vez que algun numero se repita, solo se muestre
 * uno de ellos.
 */

        /*
         Al igual que en las líneas anteriores se escribirá el orden de los números
         en formato númerico, junto con los que se repiten
         */
                    
         if(primero==segundo && segundo==tercero && tercero==cuarto){   //1-1-1-1
              System.out.println (primero);
          }       
         
        else if(primero==segundo && tercero==cuarto){                   //1-1-2-2
               System.out.println (primero+" "+cuarto);
          }
        
        else if(segundo==tercero && tercero==cuarto){                   //1-2-2-2
              System.out.println (primero+" "+cuarto);
          } 
        
        else if(primero==segundo){                                      //1-1-2-3
              System.out.println (primero+" "+ tercero+" "+ cuarto);
          }
        
        else if(segundo==tercero){                                      //1-2-2-3    
               System.out.println (primero+" "+ tercero+" "+ cuarto);
          }
        
        else if(tercero==cuarto){                                       //1-2-3-3
               System.out.println (primero+" "+ segundo+" "+ cuarto);
          }
         
}
}   
