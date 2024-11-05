/*
Ejercicio 06:
---------------------------------------------------------------
Elaborar un programa que permite resolver si un numero es primo.
----------------------------------------------------------------
Fecha   : 30/10/2024
Asociado: 1321276 - Rosario Del Pilar Nosiglia Zegarra

 */
package com.Ejercicios.Tarea_01;

import java.util.Scanner;

public class Eje06_NroPrimo
{
    public static void main(String[] args)
    {
        //Declaración de variables
        int numero=0;
        Scanner leer = new Scanner(System.in);


        //Solicitar número
        System.out.println("Ingresar número a consultar: ");
        numero= leer.nextInt();

        //Calcular número primo
        if(numero %2 ==0)
        {
            System.out.println(+numero+", No es número primo");
        }
        else
        {
            System.out.println(+numero+" , Si es un número primo");
        }



    }
}
