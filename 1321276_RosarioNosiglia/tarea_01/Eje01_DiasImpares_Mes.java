/*
Ejercicio 01:
------------------------------------------------------
Elaborar un programa en java que permita recorrer
los 30 días del mes y muestre a los días impares
-------------------------------------------------------
Fecha   : 30/10/2024
Asociado: 1321276 - Rosario Del Pilar Nosiglia Zegarra
*/

package com.Ejercicios.Tarea_01;
import java.util.Scanner;
import java.lang.String;


public class Eje01_DiasImpares_Mes
{
    public static void main(String[] args)
    {
        //Declaración de variables
        Scanner leer=new Scanner(System.in);
        //String Mes="";
        int diasMes=0;
        int diaImpar=0;
        int i=0;

        //Ingresar mes a procesar.
        System.out.println("Ingresar el nombre del mes a consultar: ");
        String Mes=leer.next();

        //Validar la cantidad de días que tiene el mes en consulta.
        //El mes ingresado será convertido a mayúscula.
        switch (Mes.toUpperCase())
        {
            case "ABRIL","JUNIO","SETIEMBRE","NOVIEMBRE" -> diasMes=30;
            case "FEBRERO" ->diasMes=29;
            case "ENERO","MARZO","MAYO","JULIO","AGOSTO","OCTUBRE","DICIEMBRE" ->diasMes=31;
            default -> System.out.println("Error en mes ingresado");
        };



        /* Recorrer los 30 días del mes
           (Los meses que tienen 30 días en el año son: Abril,Junio,Setiembre,Noviembre)
           Se debe mostrar en pantalla las fechas impares.
         */
        if(diasMes==30)
        {
            System.out.print("El mes de "+Mes.toUpperCase());
            System.out.println(" tiene  "+diasMes +" días");
            System.out.print("Las fechas impares son: ");
            while(i <= diasMes)
            {
                if (i%2>0) // Si el residuo es mayor a cero es impar
                {
                 System.out.print(i+" , ");
                }
                i++;
            }
        }
        else
        {
            if (diasMes!=30)
            {
                System.out.print("Solo se muestra fechas impares, de los meses que tienen 30 días");

            }
        }

    }
}


