/*
Ejercicio 05:
------------------------------------------------------
Elaborar un programa en java que permita calcular el interés del 25.5 %
de un préstamo de 35,500 y calcular el igv del 18% del interés calculado.
-------------------------------------------------------
Fecha   : 30/10/2024
Asociado: 1321276 - Rosario Del Pilar Nosiglia Zegarra
*/

package com.Ejercicios.Tarea_01;

public class Eje05_InteresPrestamo
{
    public static void main(String[] args)
    {
        //Declaración de variables
        double capital =35500.00;
        double interes =((capital *25.5)/100);
        double igv=(0.18);
        double resultado=0;

        //Cálculos
        interes =((capital * 25.5)/100);
        igv =((interes *18)/100);
        resultado =(capital+interes+igv);


        //Mostrar en panstalla
        //Preguntar, como dar formato a los número en el print.

        System.out.println("-----------------------------------");
        System.out.println("      CÁLCULO DE INTERÉS");
        System.out.println("-----------------------------------");
        System.out.printf("Préstamo       : %.2f%n",+capital);
        System.out.println("Interés 25.5%  : "+interes);
        System.out.println("El igv 18%     : "+igv);
        System.out.println("-----------------------------------");
        System.out.println("Monto total a devolver: "+resultado);
        System.out.println("-----------------------------------");

    }
}
