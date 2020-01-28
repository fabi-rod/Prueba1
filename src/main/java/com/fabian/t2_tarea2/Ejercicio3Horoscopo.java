/**
* Escribe un programa que muestre el horóscopo de una persona a partir del día y
* el mes de nacimiento que serán solicitados por pantalla.
*/
package com.fabian.t2_tarea2;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Ejercicio3Horoscopo {


    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    int dia;    //Dia de nacimiento
    int mes;    //Mes de nacimiento
    
/**
 * Se usará la estructura selectiva if-else, donde la expresión será si el dia de
 * nacimiento y el mes de nacimiento es el correcto, mostrará el signo del zociaco
 * correspondiente, y al final del todo un else, donde si la fecha está mal introducida
 * devolverá que la fecha ha sido mal introducida.
 */
    
    System.out.print("Introduzca el dia de su nacimiento: ");
    dia = teclado.nextInt();
    
    System.out.print("Introduzca el mes de su nacimiento en numero: ");
    mes = teclado.nextInt();
    
    if (dia >= 21 && dia <= 31 && mes == 1 || dia >=1 && dia <= 18 && mes == 2){
    System.out.print("Tu signo del zodiaco es \"Acuario\"");}
    
    else if (dia >= 19 && dia <= 29 && mes == 2 || dia >=1 && dia <= 20 && mes == 3){
    System.out.print("Tu signo del zodiaco es \"Piscis\"");}  
    
    else if (dia >= 21 && dia <= 31 && mes == 3 || dia >=1 && dia <= 20 && mes == 4){
    System.out.print("Tu signo del zodiaco es \"Aries\"");}
    
    else if (dia >= 21 && dia <= 30 && mes == 4 || dia >=1 && dia <= 20 && mes == 5){
    System.out.print("Tu signo del zodiaco es \"Tauro\"");}
    
    else if (dia >= 21 && dia <= 31 && mes == 5 || dia >=1 && dia <= 20 && mes == 6){
    System.out.print("Tu signo del zodiaco es \"Geminis\"");}
    
    else if (dia >= 21 && dia <= 30 && mes == 6 || dia >=1 && dia <= 22 && mes == 7){
    System.out.print("Tu signo del zodiaco es \"Cancer\"");}
    
    else if (dia >= 23 && dia <= 31 && mes == 7 || dia >=1 && dia <= 23 && mes == 8){
    System.out.print("Tu signo del zodiaco es \"Leo\"");}
    
    else if (dia >= 24 && dia <= 31 && mes == 8 || dia >=1 && dia <= 23 && mes == 9){
    System.out.print("Tu signo del zodiaco es \"Virgo\"");}
    
    else if (dia >= 24 && dia <= 30 && mes == 9 || dia >=1 && dia <= 22 && mes == 10){
    System.out.print("Tu signo del zodiaco es \"Libra\"");}
    
    else if (dia >= 23 && dia <= 31 && mes == 10 || dia >=1 && dia <= 22 && mes == 11){
    System.out.print("Tu signo del zodiaco es \"Escorpio\"");}
    
    else if (dia >= 22 && dia <= 30 && mes == 11 || dia >=1 && dia <= 20 && mes == 12){
    System.out.print("Tu signo del zodiaco es \"Sagitario\"");}
    
    else if (dia >= 21 && dia <= 31 && mes == 12 || dia >=1 && dia <= 20 && mes == 1){
    System.out.print("Tu signo del zodiaco es \"Capricornio\"");}
    
    else {System.out.print("La fecha introducida no es correcta.");}
    
    
}}
