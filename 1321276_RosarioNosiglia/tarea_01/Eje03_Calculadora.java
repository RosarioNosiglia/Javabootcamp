/*
Ejercicio 03:
------------------------------------------------------
Elaborar un programa en java que simule una calculadora
para sumar, restar, dividir y calcular la potencias.
-------------------------------------------------------
Fecha   : 30/10/2024
Asociado: 1321276 - Rosario Del Pilar Nosiglia Zegarra
*/
package com.Ejercicios.Tarea_01;

import java.util.Scanner;
import java.lang.Math;

public class Eje03_Calculadora {
    public static void main(String[] args) {

        //Declarar variables
        Scanner leer=new Scanner(System.in);
            double  resultado=0;


        //Ingresar datos para calculadora

        System.out.println("*******************************************************++++++++++");
        System.out.println("                   CALCULADORA - JAVA");
        System.out.println("******************************************************************");

        //Se solicita el 1er número
        System.out.print("Ingrese los números a procesar \n | 1er_Num: ");
        double numP1= leer.nextDouble();

        //Se solicita el 2do número
        System.out.print(" | 2do_Num: ");
        double numP2= leer.nextDouble();

        System.out.println("TIPO DE OPERACIÓN: \n|1.Sumar ||2.Restar||3.Dividir||4.Potencia|");
        System.out.println("----------------------------------------");
        System.out.print("¿Qué operación desea realizar? \n Ingrese Opción:");
        int opc=leer.nextInt();
        System.out.println("==============================================");
        //Se ejecuta la operación

        switch (opc)
        {

            case 1-> resultado=(numP1+numP2);
            case 2-> resultado=(numP1 - numP2);
            case 3-> resultado=(numP1/numP2);
            case 4-> resultado=Math.pow(numP1,numP2);
            default -> throw new IllegalStateException("La opción ingresada no es válida");

        }
        System.out.println("----------------------------------------------");
        System.out.println(" El resultado de la operación es: "+resultado);
        System.out.println("----------------------------------------------");
    }
}
